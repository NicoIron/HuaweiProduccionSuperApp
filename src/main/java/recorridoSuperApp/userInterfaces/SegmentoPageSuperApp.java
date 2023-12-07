package recorridoSuperApp.userInterfaces;

import io.appium.java_client.MobileBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class SegmentoPageSuperApp extends PageObject {

    public static final Target MODAL_INSTALAR_APP =
            Target.the("Modal instalar la App mi Claro").located(MobileBy.xpath("//*[@text='Instalar']"));
    public static final Target MODAL_PERMISOS =
            Target.the("Modal condiciones").located(MobileBy.id("com.clarocolombia.miclaro:id/up"));
    public static final Target BTN_LOGIN =
            Target.the("Boton Iniciar sesion").located(MobileBy.id("btnLoginUsPass"));
    public static final Target BTN_SING_UP =
            Target.the("Boton Registrate").located(MobileBy.id("btn_register"));
    public static final Target BTN_PERSONAS =
            Target.the("Boton Personas").located(MobileBy.id("com.clarocolombia.miclaro.debug:id/lbGoPersonas"));
    public static final Target BTN_USUARIO =
            Target.the("Boton Usuario y Password").located(MobileBy.id("btnLoginUserPass"));
    public static final Target BTN_CORREO =
            Target.the("Boton Con Correo").located(MobileBy.id("lbEmail"));
    public static final Target BTN_DOCUMENTO =
            Target.the("Boton Con Documento").located(MobileBy.id("lbGoPersonas"));
    public static final Target BTN_PERMITIR_DATOS =
            Target.the("Boton Permitir Datos").located(MobileBy.id("android:id/button1"));
    public static final Target BTN_NEGAR_DATOS =
            Target.the("Boton Negar Datos").located(MobileBy.id("android:id/button2"));
    public static final Target TAB_PERSONAS =
            Target.the("Pestana Personas").located(MobileBy.id("lbGoPersonas"));
    public static final Target TAB_EMPRESAS =
            Target.the("Pestana Empresas").located(MobileBy.id("lbGoEnterprise"));
    public static final Target BTN_CELULAR_O_CUENTA =
            Target.the("Boton Numero celular, cuenta hogar o PIN").located(MobileBy.id("btnLoginOtp"));
    public static final Target LOADING_SPLASH =
            Target.the("Logo de espera al iniciar la App Mi Claro").located(MobileBy.id("com.clarocolombia.miclaro:id/imgLoadingSplash"));
}
