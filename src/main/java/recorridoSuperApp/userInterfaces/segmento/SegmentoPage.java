package recorridoSuperApp.userInterfaces.segmento;

import io.appium.java_client.MobileBy;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;

public class SegmentoPage extends PageObject {

  public static final Target MODAL_PERMISOS =
      Target.the("Modal condiciones").located(MobileBy.id("com.clarocolombia.miclaro:id/up"));


  public static final Target BTN_PERSONAS =
      Target.the("Boton Personas").located(MobileBy.id("com.clarocolombia.miclaro:id/btnPersonas"));
  public static final Target BTN_USUARIO =
      Target.the("Boton Usuario y Password").located(MobileBy.id("btnLoginUserPass"));
  public static final Target BTN_CORREO =
      Target.the("Boton Con Correo").located(MobileBy.id("lbEmail"));

  public static final Target BTN_PERMITIR_DATOS =
      Target.the("Boton Permitir Datos").located(MobileBy.id("android:id/button1"));


  public static final Target BTN_CELULAR_O_CUENTA =
      Target.the("Boton Numero celular, cuenta hogar o PIN").located(MobileBy.id("btnLoginOtp"));
  public static final Target LOADING_SPLASH =
	      Target.the("Logo de espera al iniciar la App Mi Claro").located(MobileBy.id("com.clarocolombia.miclaro:id/imgLoadingSplash"));
}
