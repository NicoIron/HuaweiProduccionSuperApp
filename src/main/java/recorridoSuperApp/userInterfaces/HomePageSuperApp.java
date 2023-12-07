package recorridoSuperApp.userInterfaces;

import io.appium.java_client.MobileBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class HomePageSuperApp extends PageObject {

    public static final Target BTN_FLECHA = Target.the("Flecha Beneficios").located(MobileBy.id("imgNextHeader"));
    public static final Target LOADING = Target.the("Logo de espera Claro").located(MobileBy.id("logoClaroLoading"));
    public static final Target LOGO_ESPERA_CLARO = Target.the("Logo de espera Claro en la seccion de categorias")
            .located(MobileBy.id("com.clarocolombia.miclaro:id/imgLoadingInfoTitle"));
    public static final Target IMG_LOADING = Target.the("Imagen de espera de CLaro")
            .located(MobileBy.id("com.clarocolombia.miclaro:id/imgLoading"));
    public static final Target CBX_NUMERO_CELULAR = Target.the("Combo seleccion de numero celular")
            .located(MobileBy.id("contentSpinnerInicio"));
    public static final Target BTN_REGISTRATE_AQUI = Target.the("Botón Registrate Aquí")
            .located(MobileBy.xpath("//*[@text='Registrate aquí']"));
    public static final Target TXT_FORM_REGISTRO = Target.the("Texto formulario registro")
            .located(MobileBy.xpath("//*[@text='Beneficios de registrarte']"));
    public static final Target LOADING_ESPERA_MOMENTO = Target.the("Logo de espera un momento")
            .located(MobileBy.id("imgLoadingInfoTitle"));
    public static final Target LOADING_CARGANDO = Target.the("Logo de cargando").located(MobileBy.id("imgLoading"));
    public static final Target CATEGORIA_5 = Target.the("Categoria 5").located(MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[5]/androidx.recyclerview.widget.RecyclerView"));


}
