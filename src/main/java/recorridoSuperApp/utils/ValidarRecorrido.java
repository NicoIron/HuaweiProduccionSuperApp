package recorridoSuperApp.utils;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import org.assertj.core.api.Fail;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ValidarRecorrido implements Task {


    public static StringBuilder verificacionErrores = new StringBuilder();


    @Override
    public <T extends Actor> void performAs(T actor) {
        if (!(verificacionErrores.length()==0)) {
            Fail.fail(verificacionErrores.toString());
        }

    }

    public static Task funcion() {
        return instrumented(ValidarRecorrido.class);
    }
}
