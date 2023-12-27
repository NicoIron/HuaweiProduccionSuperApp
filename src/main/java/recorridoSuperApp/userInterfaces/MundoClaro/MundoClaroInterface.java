package recorridoSuperApp.userInterfaces.MundoClaro;

import io.appium.java_client.MobileBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class MundoClaroInterface extends PageObject {



    public static final Target BTN_VER_MAS_MUNDO_CLARO = Target
            .the("Boton ver más  Mundo claro ")
            .located(MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.LinearLayout[2]/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.FrameLayout[1]/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[4]/android.widget.TextView"));

    public static final Target SPLASH_MUNDO_CLARO = Target.the("Ver más mundo claro")
            .located(MobileBy.id("com.claro.superapp:id/content_id"));

    public static final Target BTN_TARJETA_TUYA = Target
            .the("Boton tarjeta Tuya")
            .located(MobileBy.xpath("//android.widget.TextView[contains(@text,'Tarjeta Credito Tuya')]"));

    public static final Target TXT_SOLICITA_TARJETA_TUYA = Target
            .the("texto  solicita tu tarjeta Tuya online")
            .located(MobileBy.xpath("//android.widget.TextView[contains(@text,'Solicita tu Tarjeta de Crédito Claro Online')]"));

    public static final Target BTN_PRUEBA_T = Target
            .the("Boton prueba T")
            .located(MobileBy.xpath("//android.widget.TextView[contains(@text,'Prueba T')]"));

    public static final Target TXT_PRUEBA_T = Target
            .the("Texto de prueba T")
            .located(MobileBy.xpath("//android.widget.TextView[contains(@text,'PruébaT')]"));

    public static final Target BTN_HOGAR_SEGURO= Target
            .the("Boton Hogar Seguro")
            .located(MobileBy.xpath("//android.widget.TextView[contains(@text,'Hogar Seguro')]"));

    /*public static final Target BTN_ENTENDIDO_HOGARSEGURO = Target.the("Boton entendido para continuar a hogar seguro")
            .located(MobileBy.id("com.claro.superapp:id/content_id"));
*/

    public static final Target BTN_ENTENDIDO_MUNDOCLARO= Target
            .the("Boton entendido para continuar a hogar seguro")
            .located(MobileBy.xpath("//android.view.View[@content-desc=\"Entendido\"]"));

    public static final Target TXT_HOGAR_SEGURO = Target
            .the("Texto de hogar seguro")
            .located(MobileBy.xpath("//android.widget.TextView[contains(@text,'Hogar Conectado Seguro | Claro Colombia')]"));

    public static final Target BTN_VEHICULO_CONECTADO= Target
            .the("Boton Vehículo conectado")
            .located(MobileBy.xpath("//android.widget.TextView[contains(@text,'Vehículo conectado')]"));

    public static final Target TXT_VEHICULO_CONECTADO = Target
            .the("Texto de  vehiculo conectado")
            .located(MobileBy.xpath("//android.widget.TextView[contains(@text,'Carro Conectado, Seguimiento y control | Claro Colombia')]"));


    public static final Target BTN_CLARO_CLUB= Target
            .the("Boton Claro Club")
            .located(MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.RelativeLayout[2]/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[5]"));

//Boton sin acción
    public static final Target BTN_ACEPTAR_CLAROCLUB = Target.the("Boton aceptar para  continuar a  tus servicios claro")
            .located(MobileBy.id("com.claro.superapp:id/content_id"));

    public static final Target TXT_CLAROCLUB = Target
            .the("Texto de claro club")
            .located(MobileBy.xpath("//android.widget.TextView[contains(@text,'Tus servicios Claro')]"));


    public static final Target BTN_TIENDA_CLARO = Target
            .the("Boton Tienda claro")
            .located(MobileBy.xpath("//android.widget.TextView[contains(@text,'Tienda Claro')]"));

    public static final String BTN_ACEPTAR ="Aceptar";

    public static final Target TXT_TIENDA_CLARO = Target
            .the("Texto de  la web tienda claro")
            .located(MobileBy.xpath("//android.widget.TextView[contains(@text,'Tienda Online Claro Colombia | Estrena con Claro')]"));



    public static final Target BTN_CLARO_PAY= Target
            .the("Boton Claro Pay")
            .located(MobileBy.xpath("//android.widget.TextView[contains(@text,'Claro Pay')]"));

    public static final Target TXT_CLARO_PAY = Target
            .the("Texto de la tienda de aplicaciones  claro pay para instalar")
            .located(MobileBy.xpath("//android.widget.TextView[contains(@text,'Claro Pay Colombia')]"));

    public static final Target BTN_CLARO_ATRAS= Target
            .the("Boton Atras")
            .located(MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View[2]/android.view.View[1]/android.view.View/android.widget.Button"));



}
