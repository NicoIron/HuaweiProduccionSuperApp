package recorridoSuperApp.interactions;


import recorridoSuperApp.interactions.comunes.GoBack;

import io.appium.java_client.android.AndroidDriver;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.webdriver.WebDriverFacade;
import recorridoSuperApp.models.OpcionesModels;
import recorridoSuperApp.utils.ValidarRecorrido;

import static recorridoSuperApp.Excepciones.Excepciones.ExScrollHorizontal;
import static recorridoSuperApp.userInterfaces.AdminTusProductos.*;

public class AdminTusProductosInteraction implements Interaction {

    static String categoria = "Administra tus productos";
    static String instancia = "2";

    OpcionesModels OpcionesInterccion;

    public AdminTusProductosInteraction(OpcionesModels opcionesInterccion) {
        this.OpcionesInterccion = opcionesInterccion;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        switch (OpcionesInterccion.getAdminProductos()) {
            case "Paga tu factura":
                PagaTuFactura(actor);
                break;
            case "Paga, recarga y envía dinero":
                PagaRecargaEnviaDinero(actor);
                break;
            case "Pedir Tarjeta Tuya":
                PedirTarjetaTuya(actor);
                break;
            case "Detalle de consumos":
                Detalledeconsumos(actor);
                break;
            case "Certificación cuenta al día":
                CertificaciónCuentaDia(actor);
                break;
            case "Promocion 2x1":
                Promocion2x1(actor);
                break;
            case "Detalle de tu plan":
                DetalleDeTuPlan(actor);
                break;
            case "Actualizar datos de contacto":
                break;
            case "Gestiona tu Equipo":
                break;
            case "Portabilidad Postpago":
                break;
            case "Cambia tu número":
                break;
            case "Equipos financiados":
                break;
            case "Activa Roaming":
                break;
            case "Datos Compartidos":
                break;
            case "Familia y Amigos":
                break;
            case "Adelanta tu saldo":
                break;
            case "Desasociar cuenta":
                break;
            case "All":
                PagaTuFactura(actor);
             //   PagaRecargaEnviaDinero(actor);
              //  PedirTarjetaTuya(actor);
              //  Detalledeconsumos(actor);
                CertificaciónCuentaDia(actor);
                Promocion2x1(actor);
                DetalleDeTuPlan(actor);

                break;

        }

    }

    @Step
    public static void PagaTuFactura(Actor actor) {
        try {
            try {
                driver(actor).findElementByAndroidUIAutomator("new UiSelector().text(\"" + PagaTuFactura + "\")").isDisplayed();
                driver(actor).findElementByAndroidUIAutomator("new UiSelector().text(\"" + PagaTuFactura + "\")").click();

            } catch (Exception e) {
                ExScrollHorizontal(actor, PagaTuFactura, instancia, categoria);
            }
            driver(actor).findElementByAndroidUIAutomator("new UiSelector().text(\"" + PagatuFacturaAqui + "\")").isDisplayed();

            GoBack.DoWhileForBacKPage(actor, PagaTuFactura_id, PagaTuFactura);

        } catch (Exception e) {
            Serenity.takeScreenshot();
            ValidarRecorrido.verificacionErrores.append("\n- No fue posible validar el botón de " + PagaTuFactura
                    + " en la categoría de " + categoria);

            Serenity.recordReportData().withTitle("Error").andContents("Ocurrió un problema con el botón de " + PagaTuFactura +
                    " Detalle del error: " + e.getMessage());

            GoBack.DoWhileForBacKPage(actor, PagaTuFactura_id, PagaTuFactura);

        }
    }

    public static void PagaRecargaEnviaDinero(Actor actor) {

        try {
            try {
                driver(actor).findElementByAndroidUIAutomator("new UiSelector().text(\"" + PagaRecargaEnviaDinero + "\")").isDisplayed();
                driver(actor).findElementByAndroidUIAutomator("new UiSelector().text(\"" + PagaRecargaEnviaDinero + "\")").click();

            } catch (Exception e) {
                ExScrollHorizontal(actor, PagaRecargaEnviaDinero, instancia, categoria);

            }

            GoBack.DoWhileForBacKPage(actor, PagaRecargaEnviaDinero_id, PagaRecargaEnviaDinero);
        } catch (Exception e) {
            Serenity.takeScreenshot();
            ValidarRecorrido.verificacionErrores.append("- No fue posible validar el botón de " + PagaRecargaEnviaDinero
                    + " en la categoría de " + categoria);
            Serenity.recordReportData().withTitle("Error").andContents("Ocurrió un problema con el botón de " + PagaRecargaEnviaDinero +
                    " Detalle del error: " + e.getMessage());

            GoBack.DoWhileForBacKPage(actor, PagaRecargaEnviaDinero_id, PagaRecargaEnviaDinero);

        }
    }

    public static void PedirTarjetaTuya(Actor actor) {
        try {
            try {
                driver(actor)
                        .findElementByAndroidUIAutomator("new UiSelector().text(\"" + PedirTarjetaTuya + "\")").isDisplayed();
                driver(actor)
                        .findElementByAndroidUIAutomator("new UiSelector().text(\"" + PedirTarjetaTuya + "\")").click();
            } catch (Exception e) {
                ExScrollHorizontal(actor, PedirTarjetaTuya, instancia, categoria);

            }
            GoBack.DoWhileForBacKPage(actor, PedirTarjetaTuya_id, PedirTarjetaTuya);
        } catch (Exception e) {
            Serenity.takeScreenshot();
            ValidarRecorrido.verificacionErrores.append("- No fue posible validar el botón de " + PedirTarjetaTuya
                    + " en la categoría de " + categoria);
            Serenity.recordReportData().withTitle("Error").andContents("Ocurrió un problema con el botón de " + PedirTarjetaTuya +
                    " Detalle del error: " + e.getMessage());

            GoBack.DoWhileForBacKPage(actor, PedirTarjetaTuya_id, PedirTarjetaTuya);

        }
    }

    public static void Detalledeconsumos(Actor actor) {
        try {
            try {
                driver(actor).findElementByAndroidUIAutomator("new UiSelector().text(\"" + DetalleDeConsumo + "\")").isDisplayed();
                driver(actor).findElementByAndroidUIAutomator("new UiSelector().text(\"" + DetalleDeConsumo + "\")").click();

            } catch (Exception e) {
                ExScrollHorizontal(actor, DetalleDeConsumo, instancia, categoria);
            }

            GoBack.DoWhileForBacKPage(actor, DetalleDeConsumo_id, DetalleDeConsumo);
        } catch (Exception e) {
            Serenity.takeScreenshot();
            ValidarRecorrido.verificacionErrores.append("- No fue posible validar el botón de " + DetalleDeConsumo
                    + " en la categoría de " + categoria);
            Serenity.recordReportData().withTitle("Error").andContents("Ocurrió un problema con el botón de " + DetalleDeConsumo +
                    " Detalle del error: " + e.getMessage());
            GoBack.DoWhileForBacKPage(actor, DetalleDeConsumo_id, DetalleDeConsumo);

        }
    }

    public static void CertificaciónCuentaDia(Actor actor) {
        try {
            try {
               //driver(actor).findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().resourceId(\"com.clarocolombia.miclaro.debug:id/tvItem\")).getChildByDescription("+ "new UiSelector().className(\"android.widget.TextView\"),\""+CertificacionCuentaDia+"\")");

                driver(actor).findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().resourceId(\"com.clarocolombia.miclaro.debug:id/tvItems\")).setAsHorizontalList().scrollIntoView("+  "new UiSelector().text(\""+CertificacionCuentaDia+"\"))");
            } catch (Exception e) {

                ExScrollHorizontal(actor, CertificacionCuentaDia, instancia, categoria);

            }
            driver(actor).findElementByAndroidUIAutomator("new UiSelector().text(\"" + CertificacionCuentaDia + "\")").isDisplayed();
        } catch (Exception e) {
            Serenity.takeScreenshot();
            ValidarRecorrido.verificacionErrores.append("- No fue posible validar el botón de " + CertificacionCuentaDia
                    + " en la categoría de " + categoria);
            Serenity.recordReportData().withTitle("Error").andContents("Ocurrió un problema con el botón de " + CertificacionCuentaDia +
                    " Detalle del error: " + e.getMessage());

        }
    }

    public static void Promocion2x1(Actor actor) {
        try {
            try {
                driver(actor).findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().resourceId(\"com.clarocolombia.miclaro.debug:id/rvItems\")).setAsHorizontalList().scrollIntoView("+  "new UiSelector().text(\""+Promocion2x1+"\"))");


            } catch (Exception e) {
                ExScrollHorizontal(actor, Promocion2x1, instancia, categoria);
            }
            driver(actor).findElementByAndroidUIAutomator("new UiSelector().text(\"" + Promocion2x1 + "\")").isDisplayed();

        } catch (Exception e) {
            Serenity.takeScreenshot();
            ValidarRecorrido.verificacionErrores.append("- No fue posible validar el botón de " + Promocion2x1
                    +" en la categoría de " + categoria);
            Serenity.recordReportData().withTitle("Error").andContents("Ocurrió un problema con el botón de " + Promocion2x1 +
                    " Detalle del error: " + e.getMessage());

        }
    }

   public static void DetalleDeTuPlan(Actor actor) {
        try {
            try {
                driver(actor).findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().resourceId(\"com.clarocolombia.miclaro.debug:id/rvItems\")).setAsHorizontalList().scrollIntoView("
                        +  "new UiSelector().text(\""+DetalleDeTuPlan+"\"))");

            } catch (Exception e) {
                ExScrollHorizontal(actor, DetalleDeTuPlan, instancia, categoria);
            }

            driver(actor).findElementByAndroidUIAutomator("new UiSelector().text(\"" + DetalleDeTuPlan + "\")").isDisplayed();
            driver(actor).findElementByAndroidUIAutomator("new UiSelector().text(\"" + DetalleDeTuPlan + "\")").click();
            driver(actor).findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().resourceId(\"com.clarocolombia.miclaro.debug:id/textDescDetallePlan\")).getChildByDescription("+ "new UiSelector().className(\"android.widget.TextView\"),\""+DescripcionPlan+"\")");


            GoBack.DoWhileForBacKPage(actor, PantallaPrincipalAdministraProductos, DetalleDeConsumo);

        } catch (Exception e) {
            Serenity.takeScreenshot();
            ValidarRecorrido.verificacionErrores.append("- No fue posible validar el botón de " + DetalleDeTuPlan
                    +" en la categoría de " + categoria);
            Serenity.recordReportData().withTitle("Error").andContents("Ocurrió un problema con el botón de " + DetalleDeTuPlan +
                    " Detalle del error: " + e.getMessage());

            GoBack.DoWhileForBacKPage(actor, PantallaPrincipalAdministraProductos, DetalleDeConsumo);

        }
    }

   /*  public static void(Actor actor) {
        try {
            try {

            } catch (Exception e) {

            }
        } catch (Exception e) {
            Serenity.takeScreenshot();
            ValidarRecorrido.verificacionErrores.append("- No fue posible validar el botón de " +
                    +" en la categoría de " + categoria);
            Serenity.recordReportData().withTitle("Error").andContents("Ocurrió un problema con el botón de " + +
                    " Detalle del error: " + e.getMessage());

        }
    }*/


    public static AndroidDriver getAndroidDriver(Actor actor) {
        return driver(actor);
    }

    private static AndroidDriver driver(Actor actor) {
        return (AndroidDriver) ((WebDriverFacade) getdriver(actor)).getProxiedDriver();
    }

    private static WebDriverFacade getdriver(Actor actor) {
        return (WebDriverFacade) BrowseTheWeb.as(actor).getDriver();
    }


}
