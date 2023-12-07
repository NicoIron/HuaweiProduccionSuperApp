package recorridoSuperApp.utils;

import recorridoSuperApp.interactions.waits.WaitFor;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import java.util.Set;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.webdriver.WebDriverFacade;

public class AndroidObject extends recorridoSuperApp.Excepciones.Excepciones {

	public void HideKeyboard(Actor actor) {
		androidDriver(actor).hideKeyboard();
	}

	public void SwipeToElement(Actor actor, String label) {
		try {
			androidDriver(actor).findElementByAndroidUIAutomator(
					"new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(" + "new UiSelector().text(\""
							+ label + "\"));")
					.click();
		} catch (Exception e) {
			ExSwipeToElement(actor, label);
		}
	}

	public void UnScrollAbajo(Actor actor) {
		try {
			androidDriver(actor).findElementByAndroidUIAutomator(
					"new UiScrollable(new UiSelector().scrollable(true)).scrollForward()");
		} catch (Exception e) {
		}
	}

	public void UnScrollAbajoInicio(Actor actor) {
		try {
			androidDriver(actor).findElementByAndroidUIAutomator(
					"new UiScrollable(new UiSelector().className(\"android.widget.ScrollView\").scrollable(true)).scrollForward()");
		} catch (Exception e) {
		}
	}

	public void ScrollHorizontalId(Actor actor, String id) {
		try {
			androidDriver(actor)
					.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().resourceIdMatches(\".*" + id
							+ ".*\").scrollable(true))" + ".setAsHorizontalList().scrollForward()");
		} catch (Exception e) {
			ExScrollHorizontalId(actor, id);
		}
	}

	public void ScrollHorizontalIdElement(Actor actor, String id, String label) {
		try {
			androidDriver(actor).findElementByAndroidUIAutomator(
					"new UiScrollable(new UiSelector().resourceIdMatches(\".*" + id + ".*\").scrollable(true))"
							+ ".setAsHorizontalList().scrollIntoView(new UiSelector().text(\"" + label + "\"));");
		} catch (Exception e) {
			ExScrollHorizontalIdElement(actor, id, label);
		}
	}

	public void ScrollHorizontal(Actor actor, String instance, String label) {
		try {
			androidDriver(actor).findElementByAndroidUIAutomator(
					"new UiScrollable(new UiSelector().resourceIdMatches(\".*com.clarocolombia.miclaro:id/rvCategories.*\")"
							+ ".childSelector(new UiSelector().instance(" + instance + ").scrollable(true)))"
							+ ".setAsHorizontalList().scrollIntoView(new UiSelector().text(\"" + label + "\"));")
					.click();
		} catch (Exception e) {
			ExScrollHorizontal(actor, instance, label);
		}
	}

	public void ScrollElement(Actor actor, String instance, String label) {
		try {
			androidDriver(actor).findElementByAndroidUIAutomator(
					"new UiScrollable(new UiSelector().resourceIdMatches(\".*com.clarocolombia.miclaro:id/rvCategories.*\")"
							+ ".childSelector(new UiSelector().instance(" + instance + ").scrollable(true)))"
							+ ".setAsHorizontalList().scrollIntoView(new UiSelector().text(\"" + label + "\"));");
			androidDriver(actor).findElementByAndroidUIAutomator("new UiSelector().text(\"" + label + "\")")
					.isDisplayed();
		} catch (Exception e) {

			ExScrollElement(actor, instance, label);

		}

	}

	public void ScrollHorizontalFinal(Actor actor, String instance) {
		try {
			androidDriver(actor).findElementByAndroidUIAutomator(
					"new UiScrollable(new UiSelector().resourceIdMatches(\".*com.clarocolombia.miclaro:id/rvCategories.*\")"
							+ ".childSelector(new UiSelector().instance(" + instance + ").scrollable(true)))"
							+ ".setAsHorizontalList().scrollForward()");
		} catch (Exception e) {
			ExScrollHorizontalFinal(actor, instance);
		}
	}
	
	
	public void ValidarTexto(Actor actor, String text) {
		try {
			androidDriver(actor).findElementByAndroidUIAutomator("new UiSelector().text(\"" + text + "\")")
					.isDisplayed();
		} catch (Exception e) {
			ExValidarTexto(actor, text);
		}
	}

	public void ElTextoContiene(Actor actor, String text) {
		try {
			androidDriver(actor).findElementByAndroidUIAutomator("new UiSelector().textContains(\"" + text + "\")")
					.isDisplayed();
		} catch (Exception e) {
			ExElTextoContiene(actor, text);
		}
	}

	public void ScrollVertical(Actor actor, String label) {
		try {
			androidDriver(actor).findElementByAndroidUIAutomator(
					"new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(" + "new UiSelector().text(\""
							+ label + "\"));");
		} catch (Exception e) {
			ExScrollVertical(actor, label);
		}
	}

	public void ScrollVerticalInicio(Actor actor, String label) {
		try {
			androidDriver(actor).findElementByAndroidUIAutomator(
					"new UiScrollable(new UiSelector().className(\"android.widget.ScrollView\").scrollable(true)).scrollIntoView("
							+ "new UiSelector().text(\"" + label + "\"));");
		} catch (Exception e) {
			ExScrollVerticalInicio(actor, label);
		}
	}

	public void ClickByText(Actor actor, String text) {
		try {
			actor.attemptsTo(WaitFor.aTime(1000));
			androidDriver(actor).findElementByAndroidUIAutomator("new UiSelector().text(\"" + text + "\")").click();
		} catch (Exception e) {
			ExClickByText(actor, text);
		}
	}

	public void Atras(Actor actor) {
		androidDriver(actor).navigate().back();
	}

	public void switchToWebView(Actor actor, String web_view) {
		Set<String> contextNames = getAndroidDriver(actor).getContextHandles();

		for (String contextName : contextNames) {
			if (contextName.equals(web_view)) {
				getAndroidDriver(actor).context(web_view);
			}
		}
	}

	public AndroidDriver getAndroidDriver(Actor actor) {
		return androidDriver(actor);
	}

	@SuppressWarnings("unchecked")
	private static AndroidDriver androidDriver(Actor actor) {
		return (AndroidDriver) ((WebDriverFacade) getDriver(actor)).getProxiedDriver();
	}

	private static WebDriverFacade getDriver(Actor actor) {
		return ((WebDriverFacade) BrowseTheWeb.as(actor).getDriver());
	}

	public TouchAction withAction(Actor actor) {
		return new TouchAction(androidDriver(actor));
	}

	public void SwitchtoFrame(Actor actor, int id) {
		androidDriver(actor).switchTo().frame(id);
	}
}
