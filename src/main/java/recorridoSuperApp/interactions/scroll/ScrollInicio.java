package recorridoSuperApp.interactions.scroll;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import recorridoSuperApp.utils.AndroidObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.thucydides.core.annotations.Step;

public class ScrollInicio extends AndroidObject implements Interaction {

  @Override
  @Step("Realiza Scroll una vez hacia abajo en el inicio de la App")
  public <T extends Actor> void performAs(T actor) {
    UnScrollAbajoInicio(actor);
  }

  public static Interaction scrollUnaVista() {
    return instrumented(ScrollInicio.class);
  }
}
