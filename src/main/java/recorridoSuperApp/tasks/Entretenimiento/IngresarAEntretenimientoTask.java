package recorridoSuperApp.tasks.Entretenimiento;

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
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isNotVisible;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static recorridoSuperApp.userInterfaces.Entretenimiento.EntretenimientoInterface.*;
import static recorridoSuperApp.userInterfaces.Entretenimiento.EntretenimientoInterface.BTN_Claro_Club;
import static recorridoSuperApp.userInterfaces.loguinProduc.LogueoInterface.*;

public class IngresarAEntretenimientoTask implements Task {
    String categoria = "Mundo Claro";
//Entretenimiento
    User user;

    public IngresarAEntretenimientoTask(User user) {
        this.user = user;
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        switch (user.getMiniprograma()){
            case "Claro Video":
                Ingresar_Claro_video(actor);
                break;
            case "HBO":
                Ingresar_HBO(actor);
                break;
            case "Disney":
                break;
            case "Red +":
                Ingresar_Red_Mas(actor);
                break;
            case "Prime video":
                break;
            case "La Tele Letal":
                Ingresar_La_Tele_Letal(actor);
                break;
            case "Claro Musica":
              Ingresar_Claro_Musica(actor);
                break;
            case "Netflix":
                Ingresar_Netflix(actor);
                break;
            case "Claro Club":
                Ingresar_Claro_Club(actor);
                break;
            case "ALL":
                Ingresar_Claro_video(actor);
                Ingresar_Red_Mas(actor);
                Ingresar_Claro_Club(actor);
                Ingresar_Claro_Musica(actor);
                Ingresar_La_Tele_Letal(actor);
                Ingresar_HBO(actor);
                Ingresar_Netflix(actor);
                break;
        }

    }

    @Step
    public void Ingresar_Claro_video(Actor actor) {
        try {

            driver(actor).findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().className(\"android.widget.ScrollView\")).scrollIntoView("+" new UiSelector().text(\""+ categoria +"\"));");
            actor.attemptsTo(
                    Click.on(BTN_VER_MAS_ENTRETENIMIENTO),
                    Click.on(BTN_Claro_Video),
                    WaitUntil.the(SPLASH_CLARO_ENTRETENIMIENTO, isNotVisible()).forNoMoreThan(30).seconds()
            );
            GoBack.DoWhileForBacKPage(actor, BTN_Claro_Video,"Menu entretenimiento");
        } catch (Exception e) {
            Serenity.takeScreenshot();
            ValidarRecorrido.verificacionErrores.append("- No fue posible validar el botón de " + "Devolución de equipos"
                    + " en la categoría de " + categoria);
            Serenity.recordReportData().withTitle("Error").andContents("Ocurrió un problema con el botón de " + "Devolución de equipos" +
                    " Detalle del error: " + e.getMessage());
            GoBack.DoWhileForBacKPage(actor, BTN_Claro_Video,"Menu entretenimiento");
        }
    }
    @Step
    public void Ingresar_Claro_Club(Actor actor) {
        try {
            actor.attemptsTo(
                    Click.on(BTN_Claro_Club),
                    WaitUntil.the(Visualizar_Tus_Servicios, isVisible()).forNoMoreThan(30).seconds()
            );
            GoBack.DoWhileForBacKPage(actor, BTN_Claro_Club,"Menu entretenimiento");
        } catch (Exception e) {
            Serenity.takeScreenshot();
            ValidarRecorrido.verificacionErrores.append("- No fue posible validar el botón de " + "Devolución de equipos"
                    + " en la categoría de " + categoria);
            Serenity.recordReportData().withTitle("Error").andContents("Ocurrió un problema con el botón de " + "Devolución de equipos" +
                    " Detalle del error: " + e.getMessage());
            GoBack.DoWhileForBacKPage(actor, BTN_Claro_Club,"Menu entretenimiento");
        }
    }

    @Step
    public void Ingresar_Red_Mas(Actor actor) {
        try {
            actor.attemptsTo(
                    Click.on(BTN_Red_Mas),
                    WaitUntil.the(SPLASH_CLARO_ENTRETENIMIENTO, isNotVisible()).forNoMoreThan(30).seconds()
            );
            GoBack.DoWhileForBacKPage(actor, BTN_Red_Mas,"Menu entretenimiento");
        } catch (Exception e) {
            Serenity.takeScreenshot();
            ValidarRecorrido.verificacionErrores.append("- No fue posible validar el botón de " + "Devolución de equipos"
                    + " en la categoría de " + categoria);
            Serenity.recordReportData().withTitle("Error").andContents("Ocurrió un problema con el botón de " + "Devolución de equipos" +
                    " Detalle del error: " + e.getMessage());
            GoBack.DoWhileForBacKPage(actor, BTN_Red_Mas,"Menu entretenimiento");
        }
    }
    @Step
    public void Ingresar_La_Tele_Letal(Actor actor) {
        try {
            actor.attemptsTo(
                    Click.on(BTN_La_Tele_Letal),
                    WaitUntil.the(RED_MAS_NOTICIAS_TITLE, isVisible()).forNoMoreThan(30).seconds()
            );
            GoBack.DoWhileForBacKPage(actor, BTN_La_Tele_Letal,"Menu entretenimiento");

        } catch (Exception e) {
            Serenity.takeScreenshot();
            ValidarRecorrido.verificacionErrores.append("- No fue posible validar el botón de " + "Devolución de equipos"
                    + " en la categoría de " + categoria);
            Serenity.recordReportData().withTitle("Error").andContents("Ocurrió un problema con el botón de " + "Devolución de equipos" +
                    " Detalle del error: " + e.getMessage());
            GoBack.DoWhileForBacKPage(actor, BTN_La_Tele_Letal,"Menu entretenimiento");
        }
    }
    @Step
    public void Ingresar_Claro_Musica(Actor actor) {
        try {
            actor.attemptsTo(
                    Click.on(BTN_Claro_Musica),
                    WaitUntil.the(Visualizar_ClaroMusica, isVisible()).forNoMoreThan(30).seconds()
            );
            GoBack.DoWhileForBacKPage(actor, BTN_Claro_Musica,"Menu entretenimiento");

        } catch (Exception e) {
            Serenity.takeScreenshot();
            ValidarRecorrido.verificacionErrores.append("- No fue posible validar el botón de " + "Devolución de equipos"
                    + " en la categoría de " + categoria);
            Serenity.recordReportData().withTitle("Error").andContents("Ocurrió un problema con el botón de " + "Devolución de equipos" +
                    " Detalle del error: " + e.getMessage());
            GoBack.DoWhileForBacKPage(actor, BTN_Claro_Musica,"Menu entretenimiento");
        }
    }
    @Step
    public void Ingresar_HBO(Actor actor) {
        try {
            actor.attemptsTo(
                    Click.on(BTN_HBO),
                    WaitUntil.the(Visualizar_ClaroMusica, isVisible()).forNoMoreThan(30).seconds()
            );
            GoBack.DoWhileForBacKPage(actor, BTN_HBO,"Menu entretenimiento");

        } catch (Exception e) {
            Serenity.takeScreenshot();
            ValidarRecorrido.verificacionErrores.append("- No fue posible validar el botón de " + "Devolución de equipos"
                    + " en la categoría de " + categoria);
            Serenity.recordReportData().withTitle("Error").andContents("Ocurrió un problema con el botón de " + "Devolución de equipos" +
                    " Detalle del error: " + e.getMessage());
            GoBack.DoWhileForBacKPage(actor, BTN_HBO,"Menu entretenimiento");
        }
    }

    @Step
    public void Ingresar_Netflix(Actor actor) {
        try {
            actor.attemptsTo(
                    Click.on(BTN_NETFLIX),
                    WaitUntil.the(Visualizar_Gestiona_Tu_Cuenta, isVisible()).forNoMoreThan(30).seconds()
            );
            GoBack.DoWhileForBacKPage(actor, BTN_NETFLIX,"Menu entretenimiento");

        } catch (Exception e) {
            Serenity.takeScreenshot();
            ValidarRecorrido.verificacionErrores.append("- No fue posible validar el botón de " + "Devolución de equipos"
                    + " en la categoría de " + categoria);
            Serenity.recordReportData().withTitle("Error").andContents("Ocurrió un problema con el botón de " + "Devolución de equipos" +
                    " Detalle del error: " + e.getMessage());
            GoBack.DoWhileForBacKPage(actor, BTN_NETFLIX,"Menu entretenimiento");
        }
    }

    public static Performable recorridoEntretenimiento(User user) {
        return instrumented(IngresarAEntretenimientoTask.class, user);
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
