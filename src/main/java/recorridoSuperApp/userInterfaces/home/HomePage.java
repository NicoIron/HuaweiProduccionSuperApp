package recorridoSuperApp.userInterfaces.home;

import io.appium.java_client.MobileBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class HomePage extends PageObject {

	public static final Target LOADING = Target.the("Logo de espera Claro").located(MobileBy.id("logoClaroLoading"));

	public static final Target IMG_LOADING = Target.the("Imagen de espera de CLaro")
			.located(MobileBy.id("com.clarocolombia.miclaro:id/imgLoading"));
	public static final Target CBX_NUMERO_CELULAR = Target.the("Combo seleccion de numero celular")
			.located(MobileBy.id("contentSpinnerInicio"));

	public static final Target TXT_ACTUALIZAR =
			Target.the("Texto de Actualizar").located(MobileBy.xpath("//*[@text='Activar']"));

}
