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
import static recorridoSuperApp.userInterfaces.autentication.LoginPage.BTN_LOGIN;
import static recorridoSuperApp.userInterfaces.exceptions.ExcepcionesPage.LOADING_EN_CATEGORIAS_CLARO;
import static recorridoSuperApp.userInterfaces.exceptions.ExcepcionesPage.TXT_ACTUALIZAR;
import static recorridoSuperApp.userInterfaces.home.HomePage.*;
import static recorridoSuperApp.userInterfaces.home.HomePage.CBX_NUMERO_CELULAR;
import static recorridoSuperApp.userInterfaces.segmento.SegmentoPage.*;
import static recorridoSuperApp.userInterfaces.segmento.SegmentoPage.BTN_CORREO;
import static recorridoSuperApp.utils.Constants.ACTUALIZAR;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isNotPresent;
import static org.hamcrest.core.IsEqual.equalTo;

public class LoginCorreoInteraction implements Interaction {


    User credenciales;

    public LoginCorreoInteraction(User credenciales) {
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
                WaitElement.isClickable(BTN_USUARIO),
                Click.on(BTN_USUARIO),
                WaitElement.isClickable(BTN_CORREO),
                Click.on(BTN_CORREO));

        actor.attemptsTo(
                WaitElement.isEnable(TXT_USERNAME),
                Enter.theValue(credenciales.getEmail()).into(TXT_USERNAME),
                Enter.theValue(credenciales.getPassword()).into(TXT_PASSWORD),
                WaitElement.isEnable(BTN_LOGIN),
                Click.on(BTN_LOGIN),
                WaitUntil.the(IMG_LOADING, isNotPresent()));
        if (!Presence.of(MODAL_CANCELAR_HUELLA).viewedBy(actor).resolveAll().isEmpty()) {
            actor.attemptsTo(WaitElement.isClickable(MODAL_CANCELAR_HUELLA),
                    Click.on(MODAL_CANCELAR_HUELLA));
        } else {
            actor.attemptsTo(WaitFor.aTime(1000));
        }
        actor.attemptsTo(WaitUntil.the(LOADING, isNotPresent()),
                WaitElement.isEnable(MODAL_ACEPTA_CONDICIONES),
                Click.on(MODAL_ACEPTA_CONDICIONES),
                WaitUntil.the(IMG_LOADING, isNotPresent()));

        actor.should(seeThat(ValidateInformationText.validateInformationText(LBL_ENCABEZADO_USUARIO),
                equalTo(credenciales.getNombreUsuario())));

        actor.attemptsTo(WaitElement.isClickable(CBX_NUMERO_CELULAR), Click.on(CBX_NUMERO_CELULAR));
        WaitFor.aTime(3000);
        driver(actor).findElementByAndroidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(" + "new UiSelector().text(\""
                        + credenciales.getNumero() + "\"));");
        driver(actor).findElementByAndroidUIAutomator("new UiSelector().text(\"" + credenciales.getNumero() + "\")").click();
        if (!Presence.of(TXT_ACTUALIZAR).viewedBy(actor).resolveAll().isEmpty()) {
            driver(actor).findElementByAndroidUIAutomator("new UiSelector().text(\"" + ACTUALIZAR + "\")").click();
        }
        actor.attemptsTo(WaitUntil.the(LOADING_EN_CATEGORIAS_CLARO, isNotPresent()));

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

