package recorridoSuperApp.interactions.scroll;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import recorridoSuperApp.utils.AndroidObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.thucydides.core.annotations.Step;

public class ScrollVerticalInicio extends AndroidObject implements Interaction {

  private String labelText;

  public ScrollVerticalInicio(String labelText) {
    this.labelText = labelText;
  }

  @Override
  @Step("Realiza scroll vertical hasta encontrar el texto de '#labelText'")
  public <T extends Actor> void performAs(T actor) {
    ScrollVerticalInicio(actor, labelText);}

  public static Interaction scrollVertical(String labelText) {
    return instrumented(ScrollVerticalInicio.class, labelText);
  }
}
