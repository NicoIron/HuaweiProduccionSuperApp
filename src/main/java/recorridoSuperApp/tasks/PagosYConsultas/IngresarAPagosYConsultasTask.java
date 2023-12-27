package recorridoSuperApp.tasks.PagosYConsultas;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;
import recorridoSuperApp.interactions.comunes.GoBack;
import recorridoSuperApp.models.User;
import recorridoSuperApp.utils.ValidarRecorrido;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;
import static recorridoSuperApp.userInterfaces.PagosYConsultas.PagosYConsultasInterface.*;

public class IngresarAPagosYConsultasTask implements Task {
	String categoria = "Pagos y consultas";


	User user;

	public IngresarAPagosYConsultasTask(User user) {
		this.user = user;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		switch (user.getMiniprograma()) {
			case "All":
				Ingresar_a_pagos_y_consultas(actor);
				Ingresar_a_Consultar_Portabilidad(actor);
				//Ingresar_a_envio_de_sim_card(actor);
				Ingresar_a_solicitar_traslado(actor);
				Ingresar_a_devolucion_de_equipos(actor);
				Ingresar_a_Adquiere_una_Linea_Nueva(actor);
				Ingresar_a_Consulta_el_estado_PQR(actor);
				Ingresar_a_Agendar_turnos(actor);
				Ingresar_a_Vehiculo_Conectado(actor);
				Ingresar_a_Tarjeta_Tuya(actor);
				Ingresar_Servicios_Chat(actor);
				Ingresar_a_Familia_y_Amigos(actor);
				break;
		}
	}

	@Step
	public void Ingresar_a_pagos_y_consultas(Actor actor) {
		try {
			actor.attemptsTo(
				Click.on(BTN_VER_MAS),
				WaitUntil.the(SPLASH_CLARO,isNotVisible()),
				WaitUntil.the(TXT_PAGOS_Y_CONSULTAS, isCurrentlyEnabled())
					);
			GoBack.DoWhileForBacKPage(actor, TXT_PAGOS_Y_CONSULTAS, "Pagos y consultas");
		} catch (Exception e) {
			Serenity.takeScreenshot();
			ValidarRecorrido.verificacionErrores.append("- No fue posible validar el botón de " + TXT_PAGOS_Y_CONSULTAS
				+ " en la categoría de " + categoria);
			Serenity.recordReportData().withTitle("Error").andContents("Ocurrió un problema con el botón de " + TXT_PAGOS_Y_CONSULTAS +
				" Detalle del error: " + e.getMessage());
		}
		GoBack.DoWhileForBacKPage(actor, TXT_PAGOS_Y_CONSULTAS, "Pagos y consultas");
	}

	@Step
	public void Ingresar_a_Consultar_Portabilidad(Actor actor) {
		try {
			actor.attemptsTo(
				Click.on(BTN_CONSULTA_PORTABILIDAD),
				WaitUntil.the(WEBVIEW_CONSULTAR_PORTABILIDAD, isVisible()).forNoMoreThan(30).seconds()
			);
			GoBack.DoWhileForBacKPage(actor, TXT_PAGOS_Y_CONSULTAS, "Pagos y consultas");
		} catch (Exception e) {
			Serenity.takeScreenshot();
			ValidarRecorrido.verificacionErrores.append("- No fue posible validar el botón de " + WEBVIEW_CONSULTAR_PORTABILIDAD
				+ " en la categoría de " + categoria);
			Serenity.recordReportData().withTitle("Error").andContents("Ocurrió un problema con el botón de " + WEBVIEW_CONSULTAR_PORTABILIDAD +
				" Detalle del error: " + e.getMessage());
		}
		GoBack.DoWhileForBacKPage(actor, TXT_PAGOS_Y_CONSULTAS, "Pagos y consultas");
	}

	@Step
	public void Ingresar_a_envio_de_sim_card(Actor actor) {
		try {
			actor.attemptsTo(
				//Click.on(BTN_VER_MAS),
				Click.on(BTN_CONSULTA_ENVIO_SIM),
				WaitUntil.the(WEBVIEW_CONSULTA_TU_SIM, isVisible()).forNoMoreThan(30).seconds()
			);

			GoBack.DoWhileForBacKPage(actor, TXT_PAGOS_Y_CONSULTAS, "Pagos y consultas");
		} catch (Exception e) {
			Serenity.takeScreenshot();
			ValidarRecorrido.verificacionErrores.append("- No fue posible validar el botón de " + WEBVIEW_CONSULTA_TU_SIM
				+ " en la categoría de " + categoria);
			Serenity.recordReportData().withTitle("Error").andContents("Ocurrió un problema con el botón de " + WEBVIEW_CONSULTA_TU_SIM +
				" Detalle del error: " + e.getMessage());
		}
		GoBack.DoWhileForBacKPage(actor, TXT_PAGOS_Y_CONSULTAS, "Pagos y consultas");
	}

	//PENDIENTE VALIDAR CON NICOLAY
	@Step
	public void Ingresar_a_solicitar_traslado(Actor actor) {
		try {
			actor.attemptsTo(
				//Click.on(BTN_VER_MAS),
				Click.on(BTN_SOLICITAR_TRASLADO)
				//WaitUntil.the(BTN_SOLICITAR_TRASLADO, isVisible()).forNoMoreThan(30).seconds()
			);

			GoBack.DoWhileForBacKPage(actor, TXT_PAGOS_Y_CONSULTAS, "Pagos y consultas");
		} catch (Exception e) {
			Serenity.takeScreenshot();
			ValidarRecorrido.verificacionErrores.append("- No fue posible validar el botón de " + WEBVIEW_CONSULTA_TU_SIM
				+ " en la categoría de " + categoria);
			Serenity.recordReportData().withTitle("Error").andContents("Ocurrió un problema con el botón de " + WEBVIEW_CONSULTA_TU_SIM +
				" Detalle del error: " + e.getMessage());
		}
		GoBack.DoWhileForBacKPage(actor, TXT_PAGOS_Y_CONSULTAS, "Pagos y consultas");
	}

	@Step
	public void Ingresar_a_devolucion_de_equipos(Actor actor) {
		try {
			actor.attemptsTo(
				//Click.on(BTN_VER_MAS),
				Click.on(BTN_DEV_DE_EQUIPOS),
				WaitUntil.the(TXT_HOME_DEV_EQUIPOS, isNotVisible())
			);

			GoBack.DoWhileForBacKPage(actor, TXT_PAGOS_Y_CONSULTAS, "Pagos y consultas");
		} catch (Exception e) {
			Serenity.takeScreenshot();
			ValidarRecorrido.verificacionErrores.append("- No fue posible validar el botón de " + WEBVIEW_CONSULTA_TU_SIM
				+ " en la categoría de " + categoria);
			Serenity.recordReportData().withTitle("Error").andContents("Ocurrió un problema con el botón de " + WEBVIEW_CONSULTA_TU_SIM +
				" Detalle del error: " + e.getMessage());
		}
		GoBack.DoWhileForBacKPage(actor, TXT_PAGOS_Y_CONSULTAS, "Pagos y consultas");
	}

	@Step
	public void Ingresar_a_Adquiere_una_Linea_Nueva(Actor actor) {
		try {
			actor.attemptsTo(
				//Click.on(BTN_VER_MAS),
				Click.on(BTN_ADQUIERE_LINEA_NUEVA),
				WaitUntil.the(WEBVIEW_ADQUIERE_LINEA_NUEVA, isVisible())
			);

			GoBack.DoWhileForBacKPage(actor, TXT_PAGOS_Y_CONSULTAS, "Pagos y consultas");
		} catch (Exception e) {
			Serenity.takeScreenshot();
			ValidarRecorrido.verificacionErrores.append("- No fue posible validar el botón de " + WEBVIEW_CONSULTA_TU_SIM
				+ " en la categoría de " + categoria);
			Serenity.recordReportData().withTitle("Error").andContents("Ocurrió un problema con el botón de " + WEBVIEW_CONSULTA_TU_SIM +
				" Detalle del error: " + e.getMessage());
		}
		GoBack.DoWhileForBacKPage(actor, TXT_PAGOS_Y_CONSULTAS, "Pagos y consultas");
	}

	@Step
	public void Ingresar_a_Consulta_el_estado_PQR(Actor actor) {
		try {
			actor.attemptsTo(
				//Click.on(BTN_VER_MAS),
				Click.on(BTN_CONSULTA_ESTADO_PQR),
				WaitUntil.the(WEBVIEW_CONSULTA_ESTADO_PQR, isVisible())
			);

			GoBack.DoWhileForBacKPage(actor, TXT_PAGOS_Y_CONSULTAS, "Pagos y consultas");
		} catch (Exception e) {
			Serenity.takeScreenshot();
			ValidarRecorrido.verificacionErrores.append("- No fue posible validar el botón de " + WEBVIEW_CONSULTA_TU_SIM
				+ " en la categoría de " + categoria);
			Serenity.recordReportData().withTitle("Error").andContents("Ocurrió un problema con el botón de " + WEBVIEW_CONSULTA_TU_SIM +
				" Detalle del error: " + e.getMessage());
		}
		GoBack.DoWhileForBacKPage(actor, TXT_PAGOS_Y_CONSULTAS, "Pagos y consultas");
	}

	@Step
	public void Ingresar_a_Agendar_turnos(Actor actor) {
		try {
			actor.attemptsTo(
				//Click.on(BTN_VER_MAS),
				Click.on(BTN_AGENDAR_TURNOS),
				WaitUntil.the(WEBVIEW_AGENDAR_TURNOS, isVisible())
			);

			GoBack.DoWhileForBacKPage(actor, TXT_PAGOS_Y_CONSULTAS, "Pagos y consultas");
		} catch (Exception e) {
			Serenity.takeScreenshot();
			ValidarRecorrido.verificacionErrores.append("- No fue posible validar el botón de " + WEBVIEW_CONSULTA_TU_SIM
				+ " en la categoría de " + categoria);
			Serenity.recordReportData().withTitle("Error").andContents("Ocurrió un problema con el botón de " + WEBVIEW_CONSULTA_TU_SIM +
				" Detalle del error: " + e.getMessage());
		}
		GoBack.DoWhileForBacKPage(actor, TXT_PAGOS_Y_CONSULTAS, "Pagos y consultas");
	}
	@Step
	public void Ingresar_a_Vehiculo_Conectado(Actor actor) {
		try {
			actor.attemptsTo(
					//Click.on(BTN_VER_MAS),
					Click.on(BTN_Vehiculo_Conectado),
					WaitUntil.the(WEBVIEW_Vehiculo_conectado, isVisible())
			);

			GoBack.DoWhileForBacKPage(actor, BTN_Vehiculo_Conectado, "Pagos y consultas");
		} catch (Exception e) {
			Serenity.takeScreenshot();
			ValidarRecorrido.verificacionErrores.append("- No fue posible validar el botón de " + WEBVIEW_CONSULTA_TU_SIM
					+ " en la categoría de " + categoria);
			Serenity.recordReportData().withTitle("Error").andContents("Ocurrió un problema con el botón de " + WEBVIEW_CONSULTA_TU_SIM +
					" Detalle del error: " + e.getMessage());
		}
		GoBack.DoWhileForBacKPage(actor, BTN_Vehiculo_Conectado, "Pagos y consultas");
	}

	@Step
	public void Ingresar_a_Tarjeta_Tuya(Actor actor) {
		try {
			actor.attemptsTo(
					//Click.on(BTN_VER_MAS),
					Click.on(BTN_Tarjeta_Credito_Tuya),
					WaitUntil.the(WEBVIEW_Tarjeta_Credito_Tuya, isVisible())
			);

			GoBack.DoWhileForBacKPage(actor, BTN_Tarjeta_Credito_Tuya, "Pagos y consultas");
		} catch (Exception e) {
			Serenity.takeScreenshot();
			ValidarRecorrido.verificacionErrores.append("- No fue posible validar el botón de " + WEBVIEW_CONSULTA_TU_SIM
					+ " en la categoría de " + categoria);
			Serenity.recordReportData().withTitle("Error").andContents("Ocurrió un problema con el botón de " + WEBVIEW_CONSULTA_TU_SIM +
					" Detalle del error: " + e.getMessage());
		}
		GoBack.DoWhileForBacKPage(actor, BTN_Tarjeta_Credito_Tuya, "Pagos y consultas");
	}
	@Step
	public void Ingresar_Servicios_Chat(Actor actor) {
		try {
			actor.attemptsTo(
					//Click.on(BTN_VER_MAS),
					Click.on(BTN_Servicios_Chat),
					WaitUntil.the(WEBVIEW_Servicios_Chat, isVisible())
			);

			GoBack.DoWhileForBacKPage(actor, BTN_Servicios_Chat, "Pagos y consultas");
		} catch (Exception e) {
			Serenity.takeScreenshot();
			ValidarRecorrido.verificacionErrores.append("- No fue posible validar el botón de " + WEBVIEW_CONSULTA_TU_SIM
					+ " en la categoría de " + categoria);
			Serenity.recordReportData().withTitle("Error").andContents("Ocurrió un problema con el botón de " + WEBVIEW_CONSULTA_TU_SIM +
					" Detalle del error: " + e.getMessage());
		}
		GoBack.DoWhileForBacKPage(actor, BTN_Servicios_Chat, "Pagos y consultas");
	}

	@Step
	public void Ingresar_a_Familia_y_Amigos(Actor actor) {
		try {
			actor.attemptsTo(
					//Click.on(BTN_VER_MAS),
					Click.on(BTN_Familia_y_Amigos),
					WaitUntil.the(WEBVIEW_Familia_y_Amigos, isVisible())
			);

			GoBack.DoWhileForBacKPage(actor, BTN_Familia_y_Amigos, "Pagos y consultas");
		} catch (Exception e) {
			Serenity.takeScreenshot();
			ValidarRecorrido.verificacionErrores.append("- No fue posible validar el botón de " + WEBVIEW_CONSULTA_TU_SIM
					+ " en la categoría de " + categoria);
			Serenity.recordReportData().withTitle("Error").andContents("Ocurrió un problema con el botón de " + WEBVIEW_CONSULTA_TU_SIM +
					" Detalle del error: " + e.getMessage());
		}
		GoBack.DoWhileForBacKPage(actor, BTN_Familia_y_Amigos, "Pagos y consultas");
	}

}
