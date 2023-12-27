package recorridoSuperApp.userInterfaces.solucionesEmpresariales;

import io.appium.java_client.MobileBy;
import net.serenitybdd.screenplay.targets.Target;

public class SolucionesEmpresarialesInterface {

    public static final Target BTN_VER_MAS_MP = Target.the("Ver mas Apps en Soluciones empresariales").
            located(MobileBy.xpath("(//*[@text='Ver más'])[2]"));

    public static final String BTN_VER_XPATH = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.LinearLayout[2]/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[3]";

    public static final Target BTN_CHAT_EMPRESARIAL = Target.the("Mini Programa Chat Empresarial").
            located(MobileBy.xpath("//*[@text='Chat Empresarial']"));

    public static final Target CERRAR_CHAT_EMPRESARIAL = Target.the("Mini Programa Chat Empresarial").
            located(MobileBy.xpath("(//*[@class='android.widget.TextView'])[7]"));

    public static final Target BTN_PAGOS_EN_LINEA = Target.the("Mini Programa Pagos en línea").
            located(MobileBy.xpath("//*[@text='Pagos en línea']"));

    public static final Target CERRAR_PAGOS_EN_LINEA = Target.the("Mini Programa Pagos en línea").
            located(MobileBy.xpath("(//*[@class='android.widget.TextView'])[3]"));

    public static final Target BTN_GUIA_Y_NOVEDADES = Target.the("Mini Programa Guía y Novedades").
            located(MobileBy.xpath("//*[@text='Guía y Novedades']"));

    public static final Target CERRAR_GUIA_Y_NOVEDADES = Target.the("Mini Programa Guía y Novedades").
            located(MobileBy.xpath("(//*[@class='android.widget.TextView'])[5]"));

    public static final Target BTN_INFORMACION_DE_TRAMITES = Target.the("Mini Programa Información de tramites").
            located(MobileBy.xpath("//*[@text='Información de tramites']"));

    public static final Target CERRAR_INFORMACION_DE_TRAMITES = Target.the("Mini Programa Información de tramites").
            located(MobileBy.xpath("(//*[@class='android.widget.TextView'])[8]"));

    public static final Target BTN_PORTAFOLIO_DE_SOLUCIONES = Target.the("Mini Programa Portafolio de soluciones").
            located(MobileBy.xpath("//*[@text='Portafolio de soluciones']"));

    public static final Target CERRAR_PORTAFOLIO_DE_SOLUCIONES = Target.the("Mini Programa Portafolio de soluciones").
            located(MobileBy.xpath("(//*[@class='android.widget.TextView'])[11]"));

    public static final Target BTN_CONSULTA_CONSUMOS = Target.the("Mini Programa Consulta consumos").
            located(MobileBy.xpath("//*[@text='Consulta consumos']"));

    public static final Target CERRAR_CONSULTA_CONSUMOS = Target.the("Mini Programa Consulta consumos").
            located(MobileBy.xpath("(//*[@class='android.widget.TextView'])[12]"));

    public static final Target BTN_INICIO_DE_SESION = Target.the("Mini Programa Inicio de Sesión").
            located(MobileBy.xpath("//*[@text='Inicio de Sesión']"));
    public static final Target BTN_CERTIFICADO_IP_S = Target.the("Mini Programa CERTIFICADO IPS").
            located(MobileBy.xpath("//*[@text='Certificado IP’s']"));
    public static final Target VISUALIZACION_CERTIFICADO_IP = Target.the("Mini Programa CERTIFICADO IPS").
            located(MobileBy.xpath("//*[@text='Certificado IPs']"));

    public static final Target BTN_GESTION_DE_LA_CUENTA = Target.the("Mini Programa CERTIFICADO IPS").
            located(MobileBy.xpath("//*[@text='PROD_Gestión de la cuenta']"));

    public static final Target VISUAL_GESTION_DE_LA_CUENTA = Target.the("Mini Programa CERTIFICADO IPS").
            located(MobileBy.xpath("//*[@text='Gestión de la cuenta']"));
    public static final Target CERRAR_INICIO_DE_SESION = Target.the("Mini Programa Inicio de Sesión").
            located(MobileBy.xpath("(//*[@class='android.widget.TextView'])[7]"));

    public static final Target BTN_DEVOLUCION_EQUIPOS = Target.the("Mini Programa Devolución equipos").
            located(MobileBy.xpath("//*[@text='Devolución equipos']"));

    public static final Target CERRAR_DEVOLUCION_EQUIPOS = Target.the("Mini Programa Devolución equipos").
            located(MobileBy.xpath("(//*[@class='android.widget.TextView'])[3]"));

}
