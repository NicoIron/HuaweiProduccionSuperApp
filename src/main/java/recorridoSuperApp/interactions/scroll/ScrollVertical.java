package recorridoSuperApp.interactions.scroll;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import recorridoSuperApp.utils.AndroidObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.thucydides.core.annotations.Step;

public class ScrollVertical extends AndroidObject implements Interaction {

  private String labelText;

  public ScrollVertical(String labelText) {
    this.labelText = labelText;
  }

  @Override
  @Step("Realiza scroll vertical hasta encontrar el texto de '#labelText'")
  public <T extends Actor> void performAs(T actor) {
    ScrollVertical(actor, labelText);

  }

  public static Interaction scrollVertical(String labelText) {
    return instrumented(ScrollVertical.class, labelText);
  }
}
