package recorridoSuperApp.interactions.login;

import recorridoSuperApp.interactions.waits.WaitElement;
import recorridoSuperApp.interactions.waits.WaitFor;
import recorridoSuperApp.models.User;
import co.com.miclaro.questions.ValidateInformationText;
import io.appium.java_client.android.AndroidDriver;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.questions.Presence;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.webdriver.WebDriverFacade;

import static recorridoSuperApp.userInterfaces.autentication.LoginPage.*;
import static recorridoSuperApp.userInterfaces.exceptions.ExcepcionesPage.*;
import static recorridoSuperApp.userInterfaces.home.HomePage.IMG_LOADING;
import static recorridoSuperApp.userInterfaces.home.HomePage.LOADING;
import static recorridoSuperApp.userInterfaces.segmento.SegmentoPage.*;
import static recorridoSuperApp.userInterfaces.segmento.SegmentoPage.BTN_CELULAR_O_CUENTA;
import static recorridoSuperApp.utils.Constants.ACTUALIZAR;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isNotPresent;
import static org.hamcrest.core.IsEqual.equalTo;

public class LoginPinInteraction implements Interaction {

    User credenciales;

    public LoginPinInteraction(User credenciales) {
        this.credenciales = credenciales;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(WaitUntil.the(LOADING_SPLASH, isNotPresent()));

        if (!Presence.of(MODAL_PERMISOS).viewedBy(actor).resolveAll().isEmpty()) {
            actor.attemptsTo(WaitFor.aTime(1000),
                    WaitElement.isClickable(MODAL_PERMISOS),
                    Click.on(MODAL_PERMISOS));
        } else {
            actor.attemptsTo(WaitFor.aTime(1000));
        }

        actor.attemptsTo(
                WaitElement.isClickable(BTN_PERSONAS),
                Click.on(BTN_PERSONAS),
                WaitElement.isClickable(BTN_PERMITIR_DATOS),
                Click.on(BTN_PERMITIR_DATOS),
                WaitElement.isClickable(BTN_CELULAR_O_CUENTA),
                Click.on(BTN_CELULAR_O_CUENTA));
        actor.attemptsTo(
                WaitElement.isEnable(TXT_CELULAR_O_CUENTA),
                Enter.theValue(credenciales.getNumero()).into(TXT_CELULAR_O_CUENTA),
                WaitElement.isEnable(MODAL_ACEPTAR_TERMINOS),
                Click.on(MODAL_ACEPTAR_TERMINOS),
                WaitElement.isEnable(BTN_ENVIAR_PIN),
                Click.on(BTN_ENVIAR_PIN),
                WaitUntil.the(IMG_LOADING, isNotPresent()),
                WaitFor.aTime(10000),
                WaitUntil.the(IMG_LOADING, isNotPresent()));

        actor.attemptsTo(WaitUntil.the(LOADING, isNotPresent()),
                WaitElement.isEnable(MODAL_ACEPTA_CONDICIONES),
                Click.on(MODAL_ACEPTA_CONDICIONES),
                WaitUntil.the(IMG_LOADING, isNotPresent()),
                WaitUntil.the(LOADING_EN_CATEGORIAS_CLARO, isNotPresent()));

        actor.should(seeThat(ValidateInformationText.validateInformationText(LBL_ENCABEZADO_USUARIO),
                equalTo(credenciales.getNombreUsuario())));

        if (!Presence.of(TXT_ACTUALIZAR).viewedBy(actor).resolveAll().isEmpty()) {
            driver(actor).findElementByAndroidUIAutomator("new UiSelector().text(\"" + ACTUALIZAR + "\")").click();
            actor.attemptsTo(WaitUntil.the(LOADING_EN_CATEGORIAS_CLARO, isNotPresent()));
        }

    }

    public AndroidDriver getAndroidDriver(Actor actor) {
        return driver(actor);
    }

    @SuppressWarnings("unchecked")
    private static AndroidDriver driver(Actor actor) {
        return (AndroidDriver) ((WebDriverFacade) getDriver(actor)).getProxiedDriver();
    }

    private static WebDriverFacade getDriver(Actor actor) {
        return ((WebDriverFacade) BrowseTheWeb.as(actor).getDriver());
    }
}
