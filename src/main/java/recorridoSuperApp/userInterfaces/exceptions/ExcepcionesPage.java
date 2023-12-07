package recorridoSuperApp.userInterfaces.exceptions;

import io.appium.java_client.MobileBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class ExcepcionesPage extends PageObject {


	public static final Target LOADING_EN_CATEGORIAS_CLARO = Target.the("Imagen de cargando Claro en la pantalla principal")
			.located(MobileBy.id("com.clarocolombia.miclaro:id/imgLoadingInfoTitle"));

	public static final Target TXT_TE_GUSTARIA_CALIFICAR_MI_CLARO_APP = Target.the("Texto de te gustaria calificar mi claro App")
			.located(MobileBy.xpath("//*[@text='¿Te gustaría calificar tu experiencia con el App Mi Claro?']"));
	public static final Target TXT_ACTUALIZAR = Target.the("Texto de Actualizar")
			.located(MobileBy.xpath("//*[@text='Actualizar']"));
	public static final Target TXT_ADMINISTRA_TUS_PRODUCTOS = Target.the("Texto de Administra tus productos")
			.located(MobileBy.xpath("//*[@text='Actualizar']"));
	public static final Target TXT_ACEPTAR_Y_CONTINUAR = Target.the("Texto de ACEPTAR Y CONTINUAR")
			.located(MobileBy.xpath("//*[@text='ACEPTAR Y CONTINUAR']"));
	public static final Target TXT_CLARO_MUSICA = Target.the("Texto de Claro música")
			.located(MobileBy.xpath("//*[@text='Claro música']"));
	public static final Target TXT_LOGIN_O_REGISTRO = Target.the("Texto de LOGIN O REGISTRO")
			.located(MobileBy.xpath("//*[@text='LOGIN O REGISTRO']"));
	public static final Target TXT_ADELANTOS = Target.the("Texto de Adelantos")
			.located(MobileBy.xpath("//*[@text='Adelantos']"));
	public static final Target TXT_ADELANTAR = Target.the("Texto de Adelantar")
			.located(MobileBy.xpath("//*[@text='Adelantar']"));
	public static final Target BTN_CLARO_MUSICA_PREPAGO = Target.the("Botón de Claro Música en Prepago")
			.located(MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[3]/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[1]/android.widget.LinearLayout/android.view.ViewGroup/android.widget.LinearLayout[2]"));
	public static final Target TXT_CERRAR = Target.the("Texto de cerrar")
			.located(MobileBy.xpath("//*[@text='Cerrar']"));

}
