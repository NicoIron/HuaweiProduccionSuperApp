package recorridoSuperApp.userInterfaces.PagosYConsultas;

import net.serenitybdd.core.pages.PageObject;
import io.appium.java_client.MobileBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class PagosYConsultasInterface extends PageObject {
	public static final Target BTN_OMITIR = Target.the("Dar clic en omitir")
		.located(MobileBy.id("com.claro.superapp:id/tv_welcome_omitir"));
	public static final Target BTN_OMITIR_REGISTRO = Target.the("Dar clic en omitir registro")
		.located(MobileBy.id("com.claro.superapp:id/linear_register"));
	public static final Target SPLASH_CLARO = Target.the("Esperar splash")
		.located(MobileBy.id("com.clarocolombia.miclaro:id/animation_splash_lottie"));
	public static final Target TXT_PAGOS_Y_CONSULTAS = Target.the("Texto de pagos y consultas")
		.located(MobileBy.id("com.clarocolombia.miclaro:id/mini_program_manager_group_title"));


	public static final Target POP_UP_NUEVA_SESION = Target.the("VALIDAR QUE SEA VISIBLE EL POP-UP")
		.located(MobileBy.id("com.claro.superapp:id/cl_dialog_bg"));
	public static final Target POP_UP_ACEPTAR = Target.the("DAR CLIC EN EL BOTÓN ACEPTAR DEL POP-UP")
		.located(MobileBy.id("com.claro.superapp:id/bt_top"));
	public static final Target INPUT_CELULAR = Target.the("Ingresar numero de celular")
		.located(MobileBy.id("com.claro.superapp:id/input"));
	public static final Target BTN_CONTINUAR = Target.the("Clic en continuar")
		.located(MobileBy.id("com.claro.superapp:id/login_entry_next"));
	public static final Target BTN_NEXT_PASSWORD = Target.the("Clic en continuar")
		.located(MobileBy.id("com.claro.superapp:id/login_password_next"));
	public static final Target BTN_OTRO_MOMENTO_POP_UP = Target.the("Clic en OTRO MOMENTO")
		.located(MobileBy.id("com.claro.superapp:id/tv_wait"));
	public static final Target OMITIR_ADMINISTRACION_APP = Target.the("Clic en OTRO MOMENTO")
		.located(MobileBy.xpath("//android.widget.FrameLayout[@content-desc='Notificaciones']/android.widget.LinearLayout"));
	public static final Target Condiciones_Aceptar= Target.the("Click Aceptar Condiciones")
		.located(MobileBy.id("com.claro.superapp:id/bt_top"));
	public static final Target POP_UP_UBICACION = Target.the("Clic en OTRO MOMENTO para activar ubicación")
		.located(MobileBy.id("com.claro.superapp:id/bt_bottom"));

	public static final Target BTN_VER_MAS = Target.the("Clic en botón de ver más")
		.located(MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.LinearLayout[2]/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[4]"));
	public static final Target BTN_DEV_DE_EQUIPOS = Target.the("Clic en botón de devolución de equipos")
		.located(MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.RelativeLayout[2]/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[3]"));
	public static final Target BTN_CONTINUAR_DEV_DE_EQUIPOS = Target.the("Clic en botón de continuar en devolución de equipos")
		.located(MobileBy.className("android.widget.Button"));
	public static final Target TXT_HOME_DEV_EQUIPOS = Target.the("Visualizar HOME de devolución de equipos")
		.located(MobileBy.xpath("//*[contains(@text,'Recuerda que solo puedes acceder') and @index='2']"));
	public static final Target TXT_WEBVIEW_DEV_EQUIPOS = Target.the("Visualizar texto de devolución de equipos")
		.located(MobileBy.xpath("//*[contains(@text,'Devolución de Equipos Hogar') and @index='1']"));
	public static final Target TXT_DEV_DE_EQUIPOS_HOGAR_WEBVIEW = Target.the("Validar el texto de que está en el webView")
		.located(MobileBy.xpath("//*[contains(@text,'Devolución de Equipos Hogar')]"));
	public static final String TXT_DEV_DE_EQUIPOS_HOGAR = "Devolución de Equipos Hogar";
	public static final Target TXT_PAGINA_PAGOS_CONSULTAS = Target.the("Validar pagina principal PAGOS Y CONSULTAS")
		.located(MobileBy.id("com.claro.superapp:id/mini_program_manager_container"));
	public static final Target BTN_CONSULTA_ENVIO_SIM = Target.the("Clic en botón de Consulta envio de sim card")
		.located(MobileBy.xpath("//*[contains(@class,'android.widget.RelativeLayout') and @index='7']"));
	public static final String TXT_CONSULTA_ENVIO_SIM = "Consulta el estado de tu pedido";
	public static final Target BTN_CONSULTA_PORTABILIDAD = Target.the("Clic en botón de Consulta PORTABILIDAD")
		.located(MobileBy.xpath("//*[contains(@class,'android.widget.RelativeLayout') and @index='6']"));
	public static final Target WEBVIEW_CONSULTAR_PORTABILIDAD = Target.the("Validar que se encuentre en el webview de portabilidad")
		.located(MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[2]/android.widget.RelativeLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.widget.FrameLayout/android.webkit.WebView"));
	public static final Target WEBVIEW_CONSULTA_TU_SIM = Target.the("Validar que se encuentre en el webview de consulta tu sim")
		.located(MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[2]/android.widget.RelativeLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.widget.FrameLayout/android.webkit.WebView"));
	public static final Target BTN_SOLICITAR_TRASLADO = Target.the("Clic en botón de solicitar traslado")
		.located(MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.RelativeLayout[2]/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[1]"));
	public static final Target BTN_ADQUIERE_LINEA_NUEVA = Target.the("Clic en botón de Consulta PORTABILIDAD")
		.located(MobileBy.xpath("//*[contains(@text,'Adquirir Nueva Linea') and @index='1']"));
	public static final Target WEBVIEW_ADQUIERE_LINEA_NUEVA = Target.the("Validar que se encuentre en el webview de ADQUIERE LINEA NUEVA")
		.located(MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[2]/android.widget.RelativeLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.widget.FrameLayout/android.webkit.WebView"));
	public static final Target BTN_CONSULTA_ESTADO_PQR = Target.the("Clic en botón de Consulta Estado del PQR")
		.located(MobileBy.xpath("//*[contains(@text,'Consultar Estado de PQR') and @index='1']"));
	public static final Target WEBVIEW_CONSULTA_ESTADO_PQR = Target.the("Validar que se encuentre en el webview de  Consulta Estado del PQR")
		.located(MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[2]/android.widget.RelativeLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.widget.FrameLayout/android.webkit.WebView"));
	public static final Target BTN_AGENDAR_TURNOS = Target.the("Clic en botón de Agendar turnos")
		.located(MobileBy.xpath("//*[contains(@text,'Agendar turnos') and @index='1']"));

	public static final Target BTN_Vehiculo_Conectado = Target.the("Clic en botón de Vehiculo conectado")
			.located(MobileBy.xpath("//*[contains(@text,'Vehículo conectado')]"));
	public static final Target WEBVIEW_AGENDAR_TURNOS = Target.the("Validar que se encuentre en el webview de Agendar turnos")
		.located(MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[2]/android.widget.RelativeLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.widget.FrameLayout/android.webkit.WebView"));

	public static final Target WEBVIEW_Vehiculo_conectado = Target.the("Validar que se encuentre en el webview de Vehiculo conectado")
			.located(MobileBy.xpath("//android.widget.TextView[@resource-id=\"com.clarocolombia.miclaro:id/h5_tv_title\"]"));

	public static final Target BTN_Tarjeta_Credito_Tuya = Target.the("Validar que se encuentre en el Tarjeta credito tuya")
			.located(MobileBy.xpath("//*[contains(@text,'Tarjeta Credito Tuya')]"));

	public static final Target WEBVIEW_Tarjeta_Credito_Tuya = Target.the("Validar que se encuentre en el webview de Tarjeta credito tuya")
			.located(MobileBy.xpath("//android.widget.TextView[@resource-id=\"com.clarocolombia.miclaro:id/h5_tv_title\"]"));

	public static final Target BTN_Servicios_Chat = Target.the("Validar que se encuentre en el Servicios Chat")
			.located(MobileBy.xpath("//*[contains(@text,'Servicios Chat')]"));

	public static final Target WEBVIEW_Servicios_Chat = Target.the("Validar que se encuentre en el webview de Servicios Chat")
			.located(MobileBy.xpath("//android.widget.TextView[@text=\"Chat empresarial\"]"));

	public static final Target BTN_Familia_y_Amigos = Target.the("Validar que se encuentre en el Familia y amigos")
			.located(MobileBy.xpath("//*[contains(@text,'Familia y Amigos')]"));

	public static final Target WEBVIEW_Familia_y_Amigos = Target.the("Validar que se encuentre en el webview de Familia y amigos")
			.located(MobileBy.xpath("//android.widget.TextView[@text=\"Familia y Amigos\"]"));










}
