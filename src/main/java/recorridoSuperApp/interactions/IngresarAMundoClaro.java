package recorridoSuperApp.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;
import recorridoSuperApp.models.User;
import recorridoSuperApp.tasks.MundoClaro.*;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isCurrentlyEnabled;
import static recorridoSuperApp.userInterfaces.MundoClaro.MundoClaroInterface.BTN_PRUEBA_T;

public class IngresarAMundoClaro implements Interaction {

	static String categoria = "Zona mundo claro";

	User user;

	public IngresarAMundoClaro(User user) {
		this.user = user;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		switch (user.getMiniprograma()){

			case "Tarjeta Tuya":
				Btn_TarjetaTuya(actor);
				break;
			case "Prueba T":
				Btn_PruebaT(actor);
				break;

			case "Hogar Seguro":
				Btn_HogarSeguro(actor);
				break;

			case "Vehiculo Conectado":
				Btn_VehiculoConectado(actor);
				break;
			case "Claro Club":
				Btn_ClaroClub(actor);
				break;

			case "Tienda claro":
				Btn_TiendaClaro(actor);
				break;
			case "Claro Pay":
				Btn_ClaroPay(actor);
				break;
			case "All":
				//Btn_TarjetaTuya(actor);
				Btn_PruebaT(actor);
				//Btn_HogarSeguro(actor);
				//Btn_VehiculoConectado(actor);
				//Btn_ClaroClub(actor);
				Btn_TiendaClaro(actor);
				Btn_ClaroPay(actor);
				break;

		}

	}
	@Step
	public void Btn_TarjetaTuya(Actor actor) {
		actor.attemptsTo(new TarjetaTuyaTask(user));
	}

	@Step
	public void Btn_PruebaT(Actor actor) {	actor.attemptsTo(new PruebaTTask(user));
	}

	@Step
	public void Btn_HogarSeguro(Actor actor) {	actor.attemptsTo(new HogarSeguroTask(user));
	}

	@Step
	public void Btn_VehiculoConectado(Actor actor) {
		actor.attemptsTo(new VehiculoConectadoTask(user));
	}

	@Step
	public void Btn_ClaroClub(Actor actor) {
		actor.attemptsTo(new ClaroClubTask(user));
	}

	@Step
	public void Btn_TiendaClaro(Actor actor) {
		actor.attemptsTo(new TiendaClaroTask(user));
	}

	@Step
	public void Btn_ClaroPay(Actor actor) {
		actor.attemptsTo(new ClaroPayTask(user));
	}

}


