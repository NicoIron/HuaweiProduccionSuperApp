package recorridoSuperApp.tasks;

import net.serenitybdd.core.Serenity;
import net.thucydides.core.annotations.Step;
import recorridoSuperApp.models.User;
import io.appium.java_client.android.AndroidDriver;
import net.serenitybdd.screenplay.Actor;

import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import net.serenitybdd.screenplay.questions.Visibility;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.webdriver.WebDriverFacade;
import recorridoSuperApp.utils.ValidarRecorrido;


import java.util.logging.Logger;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isNotVisible;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static recorridoSuperApp.userInterfaces.MundoClaro.MundoClaroInterface.BTN_ACEPTAR;
import static recorridoSuperApp.userInterfaces.loguinProduc.LogueoInterface.*;


public class IngresoCorreoSuperApp implements Task {
    String categoria = "Home Claro";

    User user;

    Logger logger = Logger.getLogger(String.valueOf(IngresoCorreoSuperApp.class));


    public IngresoCorreoSuperApp(User user) {
        this.user = user;
    }


    @Override
    public <T extends Actor> void performAs(T actor) {

        Input_InicioDeSesion(actor);
    }

    @Step
    public void Input_InicioDeSesion(Actor actor) {
        try {

            if (Visibility.of(POP_UP_CONDICIONES_SERVICIO).viewedBy(actor).resolve()) {
                actor.attemptsTo(
                        Click.on(POP_UP_CONDICIONES_SERVICIO));
            } else {
                logger.info("No hay pop up de Condiciones del servicio");
            }

            if (Visibility.of(ACTUALIZAR_APP_EN_OTRO_MOMENTO).viewedBy(actor).resolve()) {
                actor.attemptsTo(
                        Click.on(ACTUALIZAR_APP_EN_OTRO_MOMENTO));
            } else {
                logger.info("No hay pop up de Actualizar App");
            }

            actor.attemptsTo(
                    WaitUntil.the(BTN_OMITIR, isVisible()),
                    Click.on(BTN_OMITIR),
                    Click.on(BTN_OMITIR_REGISTRO),
                    Enter.theValue(user.getCelular()).into(INPUT_CELULAR),
                    Click.on(BTN_CONTINUAR),
                    WaitUntil.the(SPLASH_CLARO, isNotVisible()).forNoMoreThan(30).seconds(),
                    Enter.theValue(user.getContrasena()).into(INPUT_CELULAR),
                    Click.on(BTN_NEXT_PASSWORD),
                    WaitUntil.the(SPLASH_CLARO, isNotVisible()).forNoMoreThan(80).seconds());

            if (Visibility.of(POP_UP_ACEPTAR).viewedBy(actor).resolve()) {
                actor.attemptsTo(
                        Click.on(POP_UP_ACEPTAR));
            } else {
                logger.info("No hay pop up");
            }


            if (Visibility.of(BTN_OTRO_MOMENTO_POP_UP).viewedBy(actor).resolve()) {
                actor.attemptsTo(
                        Click.on(BTN_OTRO_MOMENTO_POP_UP));
            } else {
                logger.info("No hay botón");
            }


            if (Visibility.of(OMITIR_ADMINISTRACION_APP).viewedBy(actor).resolve()) {
                actor.attemptsTo(
                        Click.on(OMITIR_ADMINISTRACION_APP));
            } else {
                logger.info("No hay botón Omitir");
            }



            if (Visibility.of(Condiciones_Aceptar).viewedBy(actor).resolve()) {
                actor.attemptsTo(
                        Click.on(Condiciones_Aceptar));
            } else {
                logger.info("No hay pop up de Condiciones");
            }


        } catch (Exception e) {
            Serenity.takeScreenshot();
            ValidarRecorrido.verificacionErrores.append("- No fue posible validar el botón de " + "Devolución de equipos"
                    + " en la categoría de " + categoria);
            Serenity.recordReportData().withTitle("Error").andContents("Ocurrió un problema con el botón de " + "Devolución de equipos" +
                    " Detalle del error: " + e.getMessage());

        }
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

