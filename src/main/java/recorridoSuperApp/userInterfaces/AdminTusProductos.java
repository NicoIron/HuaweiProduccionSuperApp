package recorridoSuperApp.userInterfaces;

import io.appium.java_client.MobileBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class AdminTusProductos {

    public static final String PagaTuFactura = "Paga tu factura";

    public static final Target PagaTuFactura_id = Target.the("Paga tu factura").located(MobileBy.xpath("//*[@resource-id=\"com.clarocolombia.miclaro.debug:id/tvItem\" and contains(@text,'Paga tu factura')]"));

    public static final String PagatuFacturaAqui= "Paga tu factura aquí";

    public static final String PagaRecargaEnviaDinero = "Paga, recarga y envía dinero";

    public static final Target PagaRecargaEnviaDinero_id = Target.the("Paga, recarga y envia dinero").located(MobileBy.xpath("//*[@resource-id=\"com.clarocolombia.miclaro.debug:id/tvItem\" and contains(@text,'Paga, recarga y envía dinero')]"));

    public static final String PedirTarjetaTuya = "Pedir Tarjeta Tuya";

    public static final Target PedirTarjetaTuya_id = Target.the("Paga, recarga y envia dinero").located(MobileBy.xpath("//*[@resource-id=\"com.clarocolombia.miclaro.debug:id/tvItem\" and contains(@text,'Pedir Tarjeta Tuya')]"));

    public static final String DetalleDeConsumo = "Detalle de consumos";

    public static final Target DetalleDeConsumo_id = Target.the("Detalle De Consumo").located(MobileBy.xpath("//*[@resource-id=\"com.clarocolombia.miclaro.debug:id/tvItem\" and contains(@text,'Detalle de consumos')]"));

    public static final String CertificacionCuentaDia = "Certificación cuenta al día";

    public static final String Promocion2x1 = "Promocion 2x1";

    public static final String DetalleDeTuPlan = "Detalle de tu plan";

    public static final String DescripcionPlan = "Descripción del plan";

    public static final Target PantallaPrincipalAdministraProductos = Target.the("Pantalla Principal Admin Productos").located(MobileBy.id("com.clarocolombia.miclaro.debug:id/rvItems"));





}
