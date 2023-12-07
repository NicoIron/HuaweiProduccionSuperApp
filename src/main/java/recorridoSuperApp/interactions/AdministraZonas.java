package recorridoSuperApp.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;
import recorridoSuperApp.models.User;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isCurrentlyEnabled;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isNotVisible;
import static recorridoSuperApp.tasks.IngresoCorreoSuperApp.driver;
import static recorridoSuperApp.userInterfaces.MundoClaro.MundoClaroInterface.BTN_VER_MAS_MUNDO_CLARO;
import static recorridoSuperApp.userInterfaces.MundoClaro.MundoClaroInterface.SPLASH_MUNDO_CLARO;

public class AdministraZonas implements Interaction {

	static String categoria = "Zona mundo claro";

	User user;

	public AdministraZonas(User user) {
		this.user = user;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		switch (user.getZona()){

			case "Pagos y Consultas":
				Btn_PagosyConsultas(actor);
				break;
			case "Entretenimiento":
				Btn_Entretenimiento(actor);
				break;
			case "Mundo Claro":
				Btn_MundoClaro(actor);
				break;
			case "Soluciones Empresariales":
				Btn_SolucionesEmpresariales(actor);
				break;
			case "All":
				Btn_PagosyConsultas(actor);
				Btn_Entretenimiento(actor);
				Btn_MundoClaro(actor);
				Btn_SolucionesEmpresariales(actor);
				break;

		}

	}
	@Step
	public void Btn_PagosyConsultas(Actor actor) {
		actor.attemptsTo(new AdministraZonas(user));
	}

	@Step
	public void Btn_Entretenimiento(Actor actor) {
		actor.attemptsTo(new AdministraZonas(user));
	}

	@Step
	public void Btn_MundoClaro(Actor actor) {

		driver(actor).findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()" +
				".className(\"android.widget.ScrollView\").scrollable(true)).scrollIntoView("
				+" new UiSelector().text(\"Soluciones empresariales\"));");

		actor.attemptsTo(WaitUntil.the(BTN_VER_MAS_MUNDO_CLARO,
						isCurrentlyEnabled()).forNoMoreThan(30).seconds(),
				       Click.on(BTN_VER_MAS_MUNDO_CLARO),
	          new IngresarAMundoClaro(user));
	}
	@Step
	public void Btn_SolucionesEmpresariales(Actor actor) {
		actor.attemptsTo(new AdministraZonas(user));
	}

}
