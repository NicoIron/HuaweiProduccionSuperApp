package recorridoSuperApp.interactions.scroll;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import recorridoSuperApp.utils.AndroidObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.thucydides.core.annotations.Step;

public class ScrollHorizontalElementId extends AndroidObject implements Interaction {

  private String Id;
  private String Label;

  public ScrollHorizontalElementId(String Id, String Label) {

    this.Id = Id;
    this.Label = Label;
  }

  @Override
  @Step(
      "Realiza scroll horizontal en una categoria especificada por ID hasta encontrar el texto de '#Label'.")
  public <T extends Actor> void performAs(T actor) {
    ScrollHorizontalIdElement(actor, Id, Label);

  }

  public static Interaction scroll(String Id, String Label) {
    return instrumented(ScrollHorizontalElementId.class, Id, Label);
  }
}
