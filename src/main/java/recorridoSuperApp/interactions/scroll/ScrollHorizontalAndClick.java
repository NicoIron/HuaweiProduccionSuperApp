package recorridoSuperApp.interactions.scroll;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import recorridoSuperApp.utils.AndroidObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.thucydides.core.annotations.Step;

public class ScrollHorizontalAndClick extends AndroidObject implements Interaction {

  private String labelText;
  private String instance;

  public ScrollHorizontalAndClick(String instance, String labelText) {
    this.labelText = labelText;
    this.instance = instance;
  }

  @Override
  @Step("Realiza scroll horizontal en busca del texto '#labelText' y le da click.")
  public <T extends Actor> void performAs(T actor) {
    ScrollHorizontal(actor, instance, labelText);

  }

  public static Interaction scrollHorizontal(String instance, String labelText) {
    return instrumented(ScrollHorizontalAndClick.class, instance, labelText);
  }
}
