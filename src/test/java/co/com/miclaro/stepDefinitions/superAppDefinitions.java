package co.com.miclaro.stepDefinitions;


import cucumber.api.DataTable;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import recorridoSuperApp.interactions.AdministraZonas;
import recorridoSuperApp.models.User;
import recorridoSuperApp.tasks.Entretenimiento.IngresarAEntretenimientoTask;
import recorridoSuperApp.tasks.IngresoCorreoSuperApp;
import recorridoSuperApp.tasks.PagosYConsultas.IngresarAPagosYConsultasTask;
import recorridoSuperApp.tasks.solucionesEmpresariales.RecorrerSeccion;
import recorridoSuperApp.utils.ValidarRecorrido;

import java.util.Map;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;


public class superAppDefinitions {

    User user;

    @Before
    public void test() {
        OnStage.setTheStage(new OnlineCast());

    }


    @Dado("^Ingresa a super app con correo electronico y usuario postpago(.*)$")
    public void ingresaASuperAppConCorreoElectronicoYUsuarioPostpago(String actor, DataTable info) {
        Map<String, String> map = info.asMaps(String.class, String.class).get(0);
        user = new User(map);
        theActorCalled(actor).attemptsTo(new IngresoCorreoSuperApp(user));
    }

    @Cuando("^recorre la seccion de soluciones empresariale(.*)s$")
    public void recorreLaSeccionDeSolucionesEmpresariales(String actor, DataTable info) {
        Map<String, String> map = info.asMaps(String.class, String.class).get(0);
        user = new User(map);
        theActorCalled(actor).attemptsTo(new RecorrerSeccion(user));
    }

    @Cuando("^Realizar navegacion a Mundo Claro(.*)$")
    public void Realizar_navegacion_a_Mundo_Claro(String actor, DataTable info) {
        Map<String, String> map = info.asMaps(String.class, String.class).get(0);
        user = new User(map);
        theActorCalled(actor).attemptsTo(new AdministraZonas(user));
    }

    @Cuando("^Realizar flujo de pagos y consultas(.*)$")
    public void realizar_flujo_de_pagos_y_consultas(String actor, DataTable info) {
        Map<String, String> map = info.asMaps(String.class, String.class).get(0);
        user = new User(map);
        theActorCalled(actor).attemptsTo(new IngresarAPagosYConsultasTask(user));
    }

    @Cuando("^Realizar flujo de entretenimiento(.*)$")
    public void realiza_flujo_de_entretenimiento(String actor, DataTable info) {
        Map<String, String> map = info.asMaps(String.class, String.class).get(0);
        user = new User(map);
        theActorCalled(actor).attemptsTo(new IngresarAEntretenimientoTask(user));
    }


    @Entonces("^Valida que funcionen los botones$")
    public void validaQueFuncionenLosBotones() {
        theActorInTheSpotlight().attemptsTo(ValidarRecorrido.funcion());
    }
}
