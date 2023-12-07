package recorridoSuperApp.Excepciones;

import io.appium.java_client.android.AndroidDriver;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.questions.Presence;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.webdriver.WebDriverFacade;
import recorridoSuperApp.interactions.waits.WaitFor;

import static recorridoSuperApp.userInterfaces.exceptions.ExcepcionesPage.*;
import static recorridoSuperApp.userInterfaces.home.HomePage.IMG_LOADING;
import static recorridoSuperApp.utils.Constants.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isNotPresent;

public class Excepciones {

    public static void ExScrollHorizontal(Actor actor, String texto, String instancia, String categoria) {
        try {
            if (!Presence.of(TXT_TE_GUSTARIA_CALIFICAR_MI_CLARO_APP).viewedBy(actor).resolveAll().isEmpty()) {
                driver(actor).findElementByAndroidUIAutomator("new UiSelector().text(\"" + NO + "\")").click();
            } else if (!Presence.of(TXT_CERRAR).viewedBy(actor).resolveAll().isEmpty()) {
                driver(actor).findElementByAndroidUIAutomator("new UiSelector().text(\"" + CERRAR + "\")").click();
            } else if (!Presence.of(TXT_ACTUALIZAR).viewedBy(actor).resolveAll().isEmpty()) {
                driver(actor).findElementByAndroidUIAutomator("new UiSelector().text(\"" + ACTUALIZAR + "\")").click();
                actor.attemptsTo(WaitUntil.the(LOADING_EN_CATEGORIAS_CLARO, isNotPresent()));
            }
            driver(actor).findElementByAndroidUIAutomator(
                    "new UiScrollable(new UiSelector().resourceIdMatches(\".*com.clarocolombia.miclaro:id/rvCategories.*\")"
                            + ".childSelector(new UiSelector().instance("+ instancia +").scrollable(true)))"
                            + ".setAsHorizontalList().scrollIntoView(new UiSelector().text(\"" + texto + "\"));");
            driver(actor).findElementByAndroidUIAutomator("new UiSelector().text(\"" + texto + "\")").isDisplayed();
        } catch (Exception e) {
            Serenity.takeScreenshot();
            Serenity.recordReportData().withTitle("Error").andContents("No se encontró el botón de " + texto + " en la categoría de " + categoria);
        }
    }

    public static void ExScrollVertical(Actor actor, String texto) {
        try {
            if (!Presence.of(TXT_TE_GUSTARIA_CALIFICAR_MI_CLARO_APP).viewedBy(actor).resolveAll().isEmpty()) {
                driver(actor).findElementByAndroidUIAutomator("new UiSelector().text(\"" + NO + "\")").click();
            } else if (!Presence.of(TXT_CERRAR).viewedBy(actor).resolveAll().isEmpty()) {
                driver(actor).findElementByAndroidUIAutomator("new UiSelector().text(\"" + CERRAR + "\")").click();
            } else if (!Presence.of(TXT_ACTUALIZAR).viewedBy(actor).resolveAll().isEmpty()) {
                driver(actor).findElementByAndroidUIAutomator("new UiSelector().text(\"" + ACTUALIZAR + "\")").click();
                actor.attemptsTo(WaitUntil.the(LOADING_EN_CATEGORIAS_CLARO, isNotPresent()));
            }
            driver(actor).findElementByAndroidUIAutomator(
                    "new UiScrollable(new UiSelector().className(\"android.widget.ScrollView\").scrollable(true)).scrollIntoView("
                            + "new UiSelector().text(\"" + texto + "\"));");
            driver(actor).findElementByAndroidUIAutomator("new UiSelector().text(\"" + texto + "\")").isDisplayed();
            driver(actor).findElementByAndroidUIAutomator(
                    "new UiScrollable(new UiSelector().className(\"android.widget.ScrollView\").scrollable(true)).scrollForward()");
        } catch (Exception e) {
            Serenity.takeScreenshot();
            Serenity.recordReportData().withTitle("Error").andContents("No se encontró el texto de " + texto);
        }
    }

    /////// parte 2



    public void ExSwipeToElement(Actor actor, String label) {
        Serenity.takeScreenshot();
        driver(actor)
                .findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView("
                        + "new UiSelector().text(\"" + label + "\"));")
                .click();
    }

    public void ExScrollHorizontalId(Actor actor, String id) {
        Serenity.takeScreenshot();
        driver(actor).findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().resourceIdMatches(\".*"
                + id + ".*\").scrollable(true)).setAsHorizontalList().scrollForward()");

    }

    public void ExScrollHorizontalIdElement(Actor actor, String id, String label) {
        Serenity.takeScreenshot();
        driver(actor).findElementByAndroidUIAutomator(
                "new UiScrollable(new UiSelector().resourceIdMatches(\".*" + id + ".*\").scrollable(true))"
                        + ".setAsHorizontalList().scrollIntoView(new UiSelector().text(\"" + label + "\"));");

    }

    public void ExScrollHorizontal(Actor actor, String instance, String label) {
        Serenity.takeScreenshot();
        driver(actor).findElementByAndroidUIAutomator(
                        "new UiScrollable(new UiSelector().resourceIdMatches(\".*com.clarocolombia.miclaro:id/rvCategories.*\")"
                                + ".childSelector(new UiSelector().instance(" + instance + ").scrollable(true)))"
                                + ".setAsHorizontalList().scrollIntoView(new UiSelector().text(\"" + label + "\"));")
                .click();

    }

    public void ExScrollElement(Actor actor, String instance, String label) {
        Serenity.takeScreenshot();
        int instancia = Integer.parseInt(instance);
        instancia = instancia + 1;
        String instancia2 = Integer.toString(instancia);
        if (!Presence.of(TXT_TE_GUSTARIA_CALIFICAR_MI_CLARO_APP).viewedBy(actor).resolveAll().isEmpty()) {
            driver(actor).findElementByAndroidUIAutomator("new UiSelector().text(\"No\")").click();
            actor.attemptsTo(WaitFor.aTime(1000));
        } else if (!Presence.of(TXT_ACTUALIZAR).viewedBy(actor).resolveAll().isEmpty()) {
            driver(actor).findElementByAndroidUIAutomator("new UiSelector().text(\"Actualizar\")").click();
            actor.attemptsTo(WaitFor.aTime(5000));
        }
        try {
            driver(actor).findElementByAndroidUIAutomator("new UiSelector().text(\"" + label + "\")")
                    .isDisplayed();
        } catch (Exception e) {
            driver(actor).findElementByAndroidUIAutomator(
                    "new UiScrollable(new UiSelector().resourceIdMatches(\".*com.clarocolombia.miclaro:id/rvCategories.*\")"
                            + ".childSelector(new UiSelector().instance(" + instance + ").scrollable(true)))"
                            + ".setAsHorizontalList().scrollIntoView(new UiSelector().text(\"" + label + "\"));");
			/*try {
				androidDriver(actor).findElementByAndroidUIAutomator("new UiSelector().text(\"" + label + "\")")
						.isDisplayed();
			} catch (Exception ex) {
				androidDriver(actor).findElementByAndroidUIAutomator(
						"new UiScrollable(new UiSelector().resourceIdMatches(\".*com.clarocolombia.miclaro:id/rvCategories.*\")"
								+ ".childSelector(new UiSelector().instance(" + instancia2 + ").scrollable(true)))"
								+ ".setAsHorizontalList().scrollIntoView(new UiSelector().text(\"" + label + "\"));");
			}*/
        }




    }

    public void ExScrollHorizontalFinal(Actor actor, String instance) {
        Serenity.takeScreenshot();
        driver(actor).findElementByAndroidUIAutomator(
                "new UiScrollable(new UiSelector().resourceIdMatches(\".*com.clarocolombia.miclaro:id/rvCategories.*\")"
                        + ".childSelector(new UiSelector().instance(" + instance + ").scrollable(true)))"
                        + ".setAsHorizontalList().scrollForward()");

    }

    public void ExScrollVertical2(Actor actor, String label) {
        Serenity.takeScreenshot();
        driver(actor)
                .findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView("
                        + "new UiSelector().text(\"" + label + "\"));");

    }

    public void ExScrollVerticalInicio(Actor actor, String label) {
        Serenity.takeScreenshot();
        if (!Presence.of(TXT_TE_GUSTARIA_CALIFICAR_MI_CLARO_APP).viewedBy(actor).resolveAll().isEmpty()) {
            driver(actor).findElementByAndroidUIAutomator("new UiSelector().text(\"No\")").click();
            actor.attemptsTo(WaitFor.aTime(1000));
        } else if (!Presence.of(TXT_ACTUALIZAR).viewedBy(actor).resolveAll().isEmpty()) {
            driver(actor).findElementByAndroidUIAutomator("new UiSelector().text(\"Actualizar\")").click();
            actor.attemptsTo(WaitFor.aTime(5000));
        }
        driver(actor).findElementByAndroidUIAutomator(
                "new UiScrollable(new UiSelector().className(\"android.widget.ScrollView\").scrollable(true)).scrollIntoView("
                        + "new UiSelector().text(\"" + label + "\"));");

    }

    public void ExValidarTexto(Actor actor, String text) {
        Serenity.takeScreenshot();
        if (!Presence.of(IMG_LOADING).viewedBy(actor).resolveAll().isEmpty()) {
            actor.attemptsTo(WaitUntil.the(IMG_LOADING, isNotPresent()));
        }


        driver(actor).findElementByAndroidUIAutomator("new UiSelector().text(\"" + text + "\")").isDisplayed();


    }

    public void ExElTextoContiene(Actor actor, String text) {
        Serenity.takeScreenshot();
        driver(actor).findElementByAndroidUIAutomator("new UiSelector().textContains(\"" + text + "\")")
                .isDisplayed();
    }

    public void ExClickByText(Actor actor, String text) {
        Serenity.takeScreenshot();
        if (!Presence.of(TXT_TE_GUSTARIA_CALIFICAR_MI_CLARO_APP).viewedBy(actor).resolveAll().isEmpty()) {
            actor.attemptsTo(WaitFor.aTime(1000));
            driver(actor).findElementByAndroidUIAutomator("new UiSelector().text(\"No\")").click();
        }
        actor.attemptsTo(WaitFor.aTime(1000));
        driver(actor).findElementByAndroidUIAutomator("new UiSelector().text(\"" + text + "\")").click();
    }


	/*public static void ExClaroMusica(Actor actor) {
		String numero = IngresoPin.numero;
		try {
			driver(actor).startActivity(new Activity("com.clarocolombia.miclaro", ".activities.redesing.NewHome"));
		} catch (Exception ex) {
			actor.attemptsTo(WaitFor.aTime(6000));
			driver(actor).activateApp("com.clarocolombia.miclaro");
		}
		actor.attemptsTo(WaitUntil.the(LOADING_SPLASH, isNotPresent()));
		actor.attemptsTo(WaitUntil.the(LOADING_EN_CATEGORIAS_CLARO, isNotPresent()),
				WaitElement.isClickable(BTN_CELULAR_O_CUENTA),
			    Click.on(BTN_CELULAR_O_CUENTA));

		actor.attemptsTo(
		        WaitElement.isEnable(TXT_CELULAR_O_CUENTA),
		        Enter.theValue(numero).into(TXT_CELULAR_O_CUENTA),
		        WaitElement.isEnable(MODAL_ACEPTAR_TERMINOS),
		        Click.on(MODAL_ACEPTAR_TERMINOS),
		        WaitElement.isEnable(BTN_ENVIAR_PIN),
		        Click.on(BTN_ENVIAR_PIN),
		        WaitUntil.the(IMG_LOADING, isNotPresent()),
		        WaitFor.aTime(10000),
		        WaitUntil.the(IMG_LOADING, isNotPresent()));

    }*/



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
