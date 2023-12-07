package recorridoSuperApp.userInterfaces.autentication;

import io.appium.java_client.MobileBy;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;

public class LoginPage extends PageObject {
  public static final Target TXT_USERNAME =
      Target.the("Ingresar Usuario").located(MobileBy.id("edUsuario"));
  public static final Target TXT_DOCUMENTO =
      Target.the("Ingresar Documento").located(MobileBy.id("et_identificacion"));
  public static final Target TXT_PASSWORD =
      Target.the("Ingresar Password").located(MobileBy.id("edPassword"));
  public static final Target BTN_LOGIN =
      Target.the("Boton Iniciar Sesion").located(MobileBy.id("btnLoginUsPass"));

  public static final Target BTN_ACEPTAR_AUTORIZACION_MEDICION_DE_VELOCIDAD = Target.the(" ACEPTAR AUTORIZACION MEDICION DE VELOCIDAD").locatedBy("//*[contains(@text,'Aceptar')]");
  public static final Target MODAL_CANCELAR_HUELLA =
      Target.the("Modal Cancelar Huella").located(MobileBy.id("btn31"));
  public static final Target MODAL_ACEPTA_CONDICIONES =
      Target.the("Modal Acepta Terminos y Condiciones")
          .located(MobileBy.id("googlePolicyDialogAccept"));
  public static final Target LBL_ENCABEZADO_USUARIO =
      Target.the("Modal Acepta Terminos y Condiciones").located(MobileBy.id("lbUserHeader"));
  public static final Target TXT_CELULAR_O_CUENTA =
      Target.the("Ingresar numero de celular o cuenta").located(MobileBy.id("edNumber"));
  public static final Target MODAL_ACEPTAR_TERMINOS =
      Target.the("Modal aceptar terminos y condiciones")
          .located(MobileBy.id("checkTerminosLogPin"));
  public static final Target BTN_ENVIAR_PIN =
      Target.the("Boton enviar pin").located(MobileBy.id("btnLoginPin"));
  public static final Target LBL_SEGMENTACION =
      Target.the("Texto de segmentacion").located(MobileBy.id("lbStatusLevel"));
}
