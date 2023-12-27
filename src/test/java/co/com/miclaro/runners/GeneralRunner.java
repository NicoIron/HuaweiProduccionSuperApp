package co.com.miclaro.runners;

import recorridoSuperApp.utils.BeforeSuite;
import recorridoSuperApp.utils.DataToFeature;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import java.io.IOException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.junit.runner.RunWith;

@CucumberOptions(
    features = "src/test/resources/features",
    glue = {"co.com.miclaro/stepDefinitions"},
    snippets = SnippetType.CAMELCASE,
    tags = {"@Produccion_Pagos_y_cosutlas"}

)


@RunWith(CustomRunner.class)
public class GeneralRunner {
  @BeforeSuite
  public static void test() throws InvalidFormatException, IOException {
    DataToFeature.overrideFeatureFiles("src/test/resources/features");
  }
}
