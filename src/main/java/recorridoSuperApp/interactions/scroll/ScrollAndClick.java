package recorridoSuperApp.interactions.scroll;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import recorridoSuperApp.utils.AndroidObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.thucydides.core.annotations.Step;

public class ScrollAndClick extends AndroidObject implements Interaction {

  private String labelText;

  public ScrollAndClick(String labelText) {
    this.labelText = labelText;
  }

  @Override
  @Step("Realiza scroll vertical en busca del texto '#labelText' y de la click.")
  public <T extends Actor> void performAs(T actor) {
    SwipeToElement(actor, labelText);

  }

  public static Interaction scrollAndClick(String labelText) {
    return instrumented(ScrollAndClick.class, labelText);
  }
}
