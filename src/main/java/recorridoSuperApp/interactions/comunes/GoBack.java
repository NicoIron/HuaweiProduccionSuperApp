package recorridoSuperApp.interactions.comunes;


import io.appium.java_client.android.AndroidDriver;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.questions.Visibility;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.webdriver.WebDriverFacade;

import java.util.logging.Logger;

public class GoBack {

    public static Logger logger = Logger.getLogger(GoBack.class.getName());
    private static boolean status;
    public static void DoWhileForBacKPage(Actor actor, Target xpath, String Str1){

        do {
            status = Visibility.of(xpath).viewedBy(actor).resolve();
            if (status == false) {
                logger.info("!status Inicial: " + status);
                driver(actor).navigate().back();
            } else {
                logger.info("Ya se visualiza el String: " + Str1);
            }
        } while (status = !status);

    }


    public AndroidDriver getAndroidDriver(Actor actor) {
        return driver(actor);
    }

    @SuppressWarnings("unchecked")
    private static AndroidDriver driver(Actor actor) {
        return (AndroidDriver) ((WebDriverFacade) getDriver(actor)).getProxiedDriver();
    }

    private static WebDriverFacade getDriver(Actor actor) {
        return ((WebDriverFacade) BrowseTheWeb.as(actor).getDriver());
    }

}
