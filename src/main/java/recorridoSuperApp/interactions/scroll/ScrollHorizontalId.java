package recorridoSuperApp.interactions.scroll;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import recorridoSuperApp.utils.AndroidObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.thucydides.core.annotations.Step;

public class ScrollHorizontalId extends AndroidObject implements Interaction {

  private String Id;

  public ScrollHorizontalId(String Id) {

    this.Id = Id;
  }

  @Override
  @Step("Realiza scroll horizontal hacia la derecha una vez en una categoria especificada por ID.")
  public <T extends Actor> void performAs(T actor) {
    ScrollHorizontalId(actor, Id);

  }

  public static Interaction scrollHorizontalId(String Id) {
    return instrumented(ScrollHorizontalId.class, Id);
  }
}
