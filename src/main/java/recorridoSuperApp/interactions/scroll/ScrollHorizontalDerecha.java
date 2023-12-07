package recorridoSuperApp.interactions.scroll;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import recorridoSuperApp.utils.AndroidObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.thucydides.core.annotations.Step;

public class ScrollHorizontalDerecha extends AndroidObject implements Interaction {

  private String instance;

  public ScrollHorizontalDerecha(String instance) {

    this.instance = instance;
  }

  @Override
  @Step("Realiza Scroll horizontal una vez hacia la derecha en la instancia #instance")
  public <T extends Actor> void performAs(T actor) {
    ScrollHorizontalFinal(actor, instance);

  }

  public static Interaction scrollHorizontalFinal(String instance) {
    return instrumented(ScrollHorizontalDerecha.class, instance);
  }
}
