package recorridoSuperApp.userInterfaces.Entretenimiento;

import io.appium.java_client.MobileBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class EntretenimientoInterface extends PageObject {
    public static final Target BTN_VER_MAS_ENTRETENIMIENTO = Target.the("VER MAS ENTRETENIMIENTO")
            .located(MobileBy.xpath("//android.widget.TextView[@resource-id='com.clarocolombia.miclaro:id/mini_program__name' and @text='Ver más']"));
    public static final Target SPLASH_CLARO_ENTRETENIMIENTO = Target.the("VER MAS ENTRETENIMIENTO")
            .located(MobileBy.id("com.clarocolombia.miclaro:id/content_id"));

    public static final Target Visualizar_ClaroMusica = Target.the("Ver Claro Musica")
            .located(MobileBy.xpath("//android.widget.TextView[@text=\"Tus servicios Claro\"]"));

    public static final Target Visualizar_Gestiona_Tu_Cuenta = Target.the("Ver Claro Musica")
            .located(MobileBy.xpath("//android.widget.TextView[@text=\"Gestiona tu cuenta\"]"));

    public static final Target BTN_Claro_Video = Target.the("INGRESAR A CLARO VIDEO")
            .located(MobileBy.xpath("//android.widget.TextView[@resource-id='com.clarocolombia.miclaro:id/tv_name' and @text='Claro Video']"));

    public static final Target BTN_Red_Mas = Target.the("INGRESAR A RED MAS")
            .located(MobileBy.xpath("//android.widget.TextView[@resource-id='com.clarocolombia.miclaro:id/tv_name' and @text='Red +']"));

    public static final Target BTN_Claro_Musica = Target.the("INGRESAR A Claro Musica")
            .located(MobileBy.xpath("//android.widget.TextView[@resource-id='com.clarocolombia.miclaro:id/tv_name' and @text='Claro Música']"));

    public static final Target BTN_La_Tele_Letal = Target.the("INGRESAR A LA TELE LETAL")
            .located(MobileBy.xpath("//android.widget.TextView[@resource-id='com.clarocolombia.miclaro:id/tv_name' and @text='La Tele Letal']"));

    public static final Target BTN_HBO = Target.the("INGRESAR A HBO")
            .located(MobileBy.xpath("//android.widget.TextView[@resource-id='com.clarocolombia.miclaro:id/tv_name' and @text='HBO Max']"));

    public static final Target BTN_NETFLIX = Target.the("INGRESAR A NETFLIX")
            .located(MobileBy.xpath("//android.widget.TextView[@resource-id='com.clarocolombia.miclaro:id/tv_name' and @text='Netflix']"));





}
