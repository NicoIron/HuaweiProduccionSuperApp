package recorridoSuperApp.userInterfaces.loguinProduc;

import io.appium.java_client.MobileBy;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;

public class LogueoInterface extends PageObject {

    public static final Target BTN_OMITIR = Target.the("Dar clic en omitir")
            .located(MobileBy.id("com.clarocolombia.miclaro:id/tv_welcome_omitir"));
    public static final Target BTN_OMITIR_REGISTRO = Target.the("Dar clic en omitir registro")
            .located(MobileBy.id("com.clarocolombia.miclaro:id/linear_register"));
    public static final Target SPLASH_CLARO = Target.the("Esperar splash")
            .located(MobileBy.id("com.clarocolombia.miclaro:id/animation_splash_lottie"));
    public static final Target POP_UP_NUEVA_SESION = Target.the("VALIDAR QUE SEA VISIBLE EL POP-UP")
            .located(MobileBy.id("com.claro.superapp:id/cl_dialog_bg"));
    public static final Target POP_UP_ACEPTAR = Target.the("DAR CLIC EN EL BOTÓN ACEPTAR DEL POP-UP")
            .located(MobileBy.id("com.clarocolombia.miclaro:id/bt_top"));
    public static final Target INPUT_CELULAR = Target.the("Ingresar numero de celular")
            .located(MobileBy.id("com.clarocolombia.miclaro:id/input"));
    public static final Target BTN_CONTINUAR = Target.the("Clic en continuar")
            .located(MobileBy.id("com.clarocolombia.miclaro:id/login_entry_next"));
    public static final Target BTN_NEXT_PASSWORD = Target.the("Clic en continuar")
            .located(MobileBy.id("com.clarocolombia.miclaro:id/login_password_next"));
    public static final Target BTN_OTRO_MOMENTO_POP_UP = Target.the("Clic en OTRO MOMENTO")
            .located(MobileBy.id("com.clarocolombia.miclaro:id/tv_wait"));
    public static final Target OMITIR_ADMINISTRACION_APP = Target.the("Clic en OTRO MOMENTO")
            .located(MobileBy.xpath("//android.widget.FrameLayout[@content-desc='Notificaciones']/android.widget.LinearLayout"));
    public static final Target Condiciones_Aceptar= Target.the("Click Aceptar Condiciones")
            .located(MobileBy.id("com.clarocolombia.miclaro:id/bt_top"));

    public static final Target BTN_VER_MAS = Target.the("Clic en botón de ver más")
            .located(MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.LinearLayout[2]/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[4]/android.widget.FrameLayout/android.widget.ImageView"));
    public static final Target BTN_DEV_DE_EQUIPOS = Target.the("Clic en botón de devolución de equipos")
            .located(MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.RelativeLayout[2]/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[1]/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ImageView"));
    public static final Target BTN_CONTINUAR_DEV_DE_EQUIPOS = Target.the("Clic en botón de continuar en devolución de equipos")
            .located(MobileBy.className("android.widget.Button"));
    public static final Target TXT_WEBVIEW_DEV_EQUIPOS = Target.the("Visualizar texto de devolución de equipos")
            .located(MobileBy.xpath("//*[contains(@text,'Devolución de Equipos Hogar') and @index='1']"));

    public static final Target POP_UP_CONDICIONES_SERVICIO = Target.the("Clic en botón Aceptar del pop up Condiciones del Servicio")
            .located(MobileBy.id("com.clarocolombia.miclaro:id/bt_top"));

    public static final Target ACTUALIZAR_APP_EN_OTRO_MOMENTO = Target.the("Clic en botón Actualizar app en otro momento")
            .located(MobileBy.id("com.clarocolombia.miclaro:id/bt_bottom"));

//botones Ver Prductivo

    public static final Target BTN_ACEPTAR_TERMINOS= Target.the("Boton aceptar Terminos y condicones")
            .located(MobileBy.id("com.clarocolombia.miclaro:id/bt_bottom"));

    public static final Target BTN_PERMITIR = Target.the("Boton permitir")
            .located(MobileBy.id("com.android.permissioncontroller:id/permission_allow_button"));
    public static final Target BTN_APP_MAS_USADAS = Target.the("Clic en omitir apss ")
            .located(MobileBy.id("com.clarocolombia.miclaro:id/navigation_notifications"));



}
