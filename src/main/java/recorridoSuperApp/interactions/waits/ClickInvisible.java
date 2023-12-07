package recorridoSuperApp.interactions.waits;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import net.serenitybdd.markers.IsSilent;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;

public class ClickInvisible implements IsSilent, Interaction {

  private Target element;

  public ClickInvisible(Target element) {
    this.element = element;
  }

  public static ClickInvisible inInvisbleClick(Target element) {
    return instrumented(ClickInvisible.class, element);
  }

  @Override
  public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(Click.on(element));

  }
}
