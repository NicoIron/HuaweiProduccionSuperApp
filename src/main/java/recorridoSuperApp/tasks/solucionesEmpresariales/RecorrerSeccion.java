package recorridoSuperApp.tasks.solucionesEmpresariales;

import io.appium.java_client.android.AndroidDriver;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.webdriver.WebDriverFacade;
import recorridoSuperApp.interactions.comunes.GoBack;
import recorridoSuperApp.models.User;
import recorridoSuperApp.utils.ValidarRecorrido;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static recorridoSuperApp.userInterfaces.solucionesEmpresariales.SolucionesEmpresarialesInterface.*;


public class RecorrerSeccion implements Task {

    public final String soluciones_empresariales = "Soluciones empresariales";
    public final String Consulta_consumos = "Accesos";

    User user;

    public RecorrerSeccion(User user) {
        this.user = user;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        switch (user.getMiniprograma()) {
            case "ALL":
                solucionesEmpresariales(actor);
                break;
        }
    }


    @Step
    public void solucionesEmpresariales(Actor actor) {

        try {
            driver(actor).findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().className(\"android.widget.ScrollView\").scrollable(true)).flingForward().scrollIntoView("
                    + " new UiSelector().text(\"" + soluciones_empresariales + "\"));");

            // driver(actor).findElementByAndroidUIAutomator("new UiSelector().text(\"" + BTN_VER_XPATH + "\")").click();

            actor.attemptsTo(
                    Click.on(BTN_VER_MAS_MP),
                    WaitUntil.the(BTN_CHAT_EMPRESARIAL, isVisible()).forNoMoreThan(30).seconds(),
                    Click.on(BTN_CHAT_EMPRESARIAL),
                    WaitUntil.the(CERRAR_CHAT_EMPRESARIAL, isVisible()).forNoMoreThan(30).seconds());
            GoBack.DoWhileForBacKPage(actor, BTN_CHAT_EMPRESARIAL, "Chat empresarial");

        } catch (Exception e) {
            Serenity.takeScreenshot();
            ValidarRecorrido.verificacionErrores.append("- No fue posible validar el botón de " + BTN_CHAT_EMPRESARIAL
                    + " en la categoría de " + soluciones_empresariales);
            Serenity.recordReportData().withTitle("Error").andContents("Ocurrió un problema con el botón de " + BTN_CHAT_EMPRESARIAL +
                    " Detalle del error: " + e.getMessage());
            GoBack.DoWhileForBacKPage(actor, BTN_CHAT_EMPRESARIAL, "Chat empresarial");
        }


        try {
            actor.attemptsTo(
                    WaitUntil.the(BTN_PAGOS_EN_LINEA, isVisible()).forNoMoreThan(30).seconds(),
                    Click.on(BTN_PAGOS_EN_LINEA),
                    WaitUntil.the(CERRAR_PAGOS_EN_LINEA, isVisible()).forNoMoreThan(30).seconds());
            GoBack.DoWhileForBacKPage(actor, BTN_PAGOS_EN_LINEA, "Pagos en línea");

        } catch (Exception e) {
            Serenity.takeScreenshot();
            ValidarRecorrido.verificacionErrores.append("- No fue posible validar el botón de " + BTN_PAGOS_EN_LINEA
                    + " en la categoría de " + soluciones_empresariales);
            Serenity.recordReportData().withTitle("Error").andContents("Ocurrió un problema con el botón de " + BTN_PAGOS_EN_LINEA +
                    " Detalle del error: " + e.getMessage());
            GoBack.DoWhileForBacKPage(actor, BTN_PAGOS_EN_LINEA, "Pagos en línea");
        }


        try {
            actor.attemptsTo(
                    WaitUntil.the(BTN_GUIA_Y_NOVEDADES, isVisible()).forNoMoreThan(30).seconds(),
                    Click.on(BTN_GUIA_Y_NOVEDADES),
                    WaitUntil.the(CERRAR_GUIA_Y_NOVEDADES, isVisible()).forNoMoreThan(30).seconds());
            GoBack.DoWhileForBacKPage(actor, BTN_GUIA_Y_NOVEDADES, "Guía y Novedades");

        } catch (Exception e) {
            Serenity.takeScreenshot();
            ValidarRecorrido.verificacionErrores.append("- No fue posible validar el botón de " + BTN_GUIA_Y_NOVEDADES
                    + " en la categoría de " + soluciones_empresariales);
            Serenity.recordReportData().withTitle("Error").andContents("Ocurrió un problema con el botón de " + BTN_GUIA_Y_NOVEDADES +
                    " Detalle del error: " + e.getMessage());
            GoBack.DoWhileForBacKPage(actor, BTN_GUIA_Y_NOVEDADES, "Guía y Novedades");
        }


//NO PERMITE MAPEAR UN ELEMENTO INTERNO Y EL BOTÓN CERRAR ES DINAMICO EN POSICIÓN
        try {
            actor.attemptsTo(
                    WaitUntil.the(BTN_INFORMACION_DE_TRAMITES, isVisible()).forNoMoreThan(30).seconds(),
                    Click.on(BTN_INFORMACION_DE_TRAMITES),
                    WaitUntil.the(CERRAR_INFORMACION_DE_TRAMITES, isVisible()).forNoMoreThan(30).seconds());
            GoBack.DoWhileForBacKPage(actor, BTN_INFORMACION_DE_TRAMITES, "Información de tramites");

        } catch (Exception e) {
            Serenity.takeScreenshot();
            ValidarRecorrido.verificacionErrores.append("- No fue posible validar el botón de " + BTN_INFORMACION_DE_TRAMITES
                    + " en la categoría de " + soluciones_empresariales);
            Serenity.recordReportData().withTitle("Error").andContents("Ocurrió un problema con el botón de " + BTN_INFORMACION_DE_TRAMITES +
                    " Detalle del error: " + e.getMessage());
            GoBack.DoWhileForBacKPage(actor, BTN_INFORMACION_DE_TRAMITES, "Información de tramites");
        }


        //RETIRADO DE LA SUPER APP
      /*  try {
            actor.attemptsTo(
                    WaitUntil.the(BTN_CONSULTA_CONSUMOS, isVisible()).forNoMoreThan(30).seconds(),
                    Click.on(BTN_CONSULTA_CONSUMOS),
                    WaitUntil.the(CERRAR_CONSULTA_CONSUMOS, isVisible()).forNoMoreThan(30).seconds());
            GoBack.DoWhileForBacKPage(actor, BTN_CONSULTA_CONSUMOS, "Consulta consumos");

        } catch (Exception e) {
            Serenity.takeScreenshot();
            ValidarRecorrido.verificacionErrores.append("- No fue posible validar el botón de " + BTN_CONSULTA_CONSUMOS
                    + " en la categoría de " + soluciones_empresariales);
            Serenity.recordReportData().withTitle("Error").andContents("Ocurrió un problema con el botón de " + BTN_CONSULTA_CONSUMOS +
                    " Detalle del error: " + e.getMessage());
            GoBack.DoWhileForBacKPage(actor, BTN_CONSULTA_CONSUMOS, "Consulta consumos");
        }*/

/*
        try {
            actor.attemptsTo(
                    WaitUntil.the(BTN_INICIO_DE_SESION, isVisible()).forNoMoreThan(30).seconds(),
                    Click.on(BTN_INICIO_DE_SESION),
                    WaitUntil.the(CERRAR_INICIO_DE_SESION, isVisible()).forNoMoreThan(30).seconds());
            GoBack.DoWhileForBacKPage(actor, BTN_INICIO_DE_SESION, "Inicio de Sesión");

        } catch (Exception e) {
            Serenity.takeScreenshot();
            ValidarRecorrido.verificacionErrores.append("- No fue posible validar el botón de " + BTN_INICIO_DE_SESION
                    + " en la categoría de " + soluciones_empresariales);
            Serenity.recordReportData().withTitle("Error").andContents("Ocurrió un problema con el botón de " + BTN_INICIO_DE_SESION +
                    " Detalle del error: " + e.getMessage());
            GoBack.DoWhileForBacKPage(actor, BTN_INICIO_DE_SESION, "Inicio de Sesión");
        }

*/
        try {
            actor.attemptsTo(
                    WaitUntil.the(BTN_DEVOLUCION_EQUIPOS, isVisible()).forNoMoreThan(30).seconds(),
                    Click.on(BTN_DEVOLUCION_EQUIPOS),
                    WaitUntil.the(CERRAR_DEVOLUCION_EQUIPOS, isVisible()).forNoMoreThan(30).seconds());
            GoBack.DoWhileForBacKPage(actor, BTN_DEVOLUCION_EQUIPOS, "Devolución equipos");

        } catch (Exception e) {
            Serenity.takeScreenshot();
            ValidarRecorrido.verificacionErrores.append("- No fue posible validar el botón de " + BTN_DEVOLUCION_EQUIPOS
                    + " en la categoría de " + soluciones_empresariales);
            Serenity.recordReportData().withTitle("Error").andContents("Ocurrió un problema con el botón de " + BTN_DEVOLUCION_EQUIPOS +
                    " Detalle del error: " + e.getMessage());
            GoBack.DoWhileForBacKPage(actor, BTN_DEVOLUCION_EQUIPOS, "Devolución equipos");
        }

        //NO PERMITE MAPEAR UN ELEMENTO INTERNO Y EL BOTÓN CERRAR ES DINAMICO EN POSICIÓN
        try {
            actor.attemptsTo(
                    WaitUntil.the(BTN_PORTAFOLIO_DE_SOLUCIONES, isVisible()).forNoMoreThan(30).seconds(),
                    Click.on(BTN_PORTAFOLIO_DE_SOLUCIONES),
                    WaitUntil.the(CERRAR_PORTAFOLIO_DE_SOLUCIONES, isVisible()).forNoMoreThan(40).seconds());
            GoBack.DoWhileForBacKPage(actor, BTN_PORTAFOLIO_DE_SOLUCIONES, "Portafolio de soluciones");

        } catch (Exception e) {
            Serenity.takeScreenshot();
            ValidarRecorrido.verificacionErrores.append("- No fue posible validar el botón de " + BTN_PORTAFOLIO_DE_SOLUCIONES
                    + " en la categoría de " + soluciones_empresariales);
            Serenity.recordReportData().withTitle("Error").andContents("Ocurrió un problema con el botón de " + BTN_PORTAFOLIO_DE_SOLUCIONES +
                    " Detalle del error: " + e.getMessage());
            GoBack.DoWhileForBacKPage(actor, BTN_PORTAFOLIO_DE_SOLUCIONES, "Portafolio de soluciones");
        }
    }

    public static Performable recorrido(User user) {
        return instrumented(RecorrerSeccion.class, user);
    }

    public AndroidDriver getAndroidDriver(Actor actor) {
        return driver(actor);
    }

    public static AndroidDriver driver(Actor actor) {
        return (AndroidDriver) ((WebDriverFacade) getDriver(actor)).getProxiedDriver();
    }

    public static WebDriverFacade getDriver(Actor actor) {
        return (WebDriverFacade) BrowseTheWeb.as(actor).getDriver();
    }

}

