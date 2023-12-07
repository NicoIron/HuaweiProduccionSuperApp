package recorridoSuperApp.interactions.waits;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;

public class WaitToLoad implements Interaction {


    private int seconds;

    public WaitToLoad(int seconds) {
        this.seconds = seconds;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        try {
            Thread.sleep(seconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public static WaitToLoad theSeconds(int seconds) {
        return Tasks.instrumented(WaitToLoad.class, seconds);
    }

    public static WaitToLoad theMiliSeconds(int seconds) {
        return Tasks.instrumented(WaitToLoad.class, seconds);
    }
}
