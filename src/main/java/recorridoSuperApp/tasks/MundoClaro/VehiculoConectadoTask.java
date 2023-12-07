package recorridoSuperApp.tasks.MundoClaro;

import io.appium.java_client.android.AndroidDriver;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.webdriver.WebDriverFacade;
import recorridoSuperApp.interactions.comunes.GoBack;
import recorridoSuperApp.models.User;
import recorridoSuperApp.utils.ValidarRecorrido;

import java.util.logging.Logger;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isCurrentlyEnabled;
import static recorridoSuperApp.userInterfaces.MundoClaro.MundoClaroInterface.*;


public class VehiculoConectadoTask implements Task {

	static String categoria = "Vehiculo Conectado";

	User user;

	public VehiculoConectadoTask(User user) {
		this.user = user;
	}

	Logger logger = Logger.getLogger(String.valueOf(VehiculoConectadoTask.class));

	@Override
	@Step("{0}  Navega por Vehiculo Conectado")
	public <T extends Actor> void performAs(T actor) {

		try {

			actor.attemptsTo(
					Click.on(BTN_VEHICULO_CONECTADO),

					  WaitUntil.the(TXT_VEHICULO_CONECTADO,
						isCurrentlyEnabled()).forNoMoreThan(30).seconds(),
					Click.on(TXT_VEHICULO_CONECTADO));
			GoBack.DoWhileForBacKPage(actor, BTN_VEHICULO_CONECTADO,"Mundo Claro");

		} catch (Exception e) {
			Serenity.takeScreenshot();
			ValidarRecorrido.verificacionErrores.append("- No fue posible validar el botón de " + "Mundo Claro"
				+ " en la categoría de " + categoria);
			Serenity.recordReportData().withTitle("Error").andContents("Ocurrió un problema con el botón de "
					+ "Mundo Claro" +	" Detalle del error: " + e.getMessage());
			GoBack.DoWhileForBacKPage(actor, BTN_VEHICULO_CONECTADO,"Mundo Claro");
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
