package co.com.miclaro.questions;

import recorridoSuperApp.interactions.waits.WaitElement;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.Target;

public class ValidarElemento implements Question<Boolean> {

  Target element;

  public ValidarElemento(Target element) {
    this.element = element;
  }

  public static ValidarElemento esVisible(Target element) {
    return new ValidarElemento(element);
  }

  @Override
  public Boolean answeredBy(Actor actor) {
    actor.attemptsTo(WaitElement.isVisible(element));
    boolean resultado = element.resolveFor(actor).isVisible();
    return resultado;
  }
}
