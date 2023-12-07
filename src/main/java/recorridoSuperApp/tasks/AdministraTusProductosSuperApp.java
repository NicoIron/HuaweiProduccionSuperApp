package recorridoSuperApp.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import recorridoSuperApp.interactions.AdminTusProductosInteraction;
import recorridoSuperApp.models.OpcionesModels;

public class AdministraTusProductosSuperApp implements Task {

    OpcionesModels OpcionesInterccion;


    public AdministraTusProductosSuperApp(OpcionesModels OpcionesInterccion) {

        this.OpcionesInterccion=OpcionesInterccion;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(new AdminTusProductosInteraction(OpcionesInterccion));

    }
}
