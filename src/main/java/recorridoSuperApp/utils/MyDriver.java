package recorridoSuperApp.utils;

import static recorridoSuperApp.utils.enums.AppPackage.getAppPackage;


import io.appium.java_client.android.AndroidDriver;
import java.io.IOException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import net.thucydides.core.webdriver.DriverSource;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class MyDriver implements DriverSource {
  private static AndroidDriver driver;

  @Override
  public AndroidDriver newDriver() {
    try {
      ChromeOptions options = new ChromeOptions();
      options.addArguments("test-type");
      DesiredCapabilities capabilities = new DesiredCapabilities();
      capabilities.setCapability("appActivity", ".activities.Splash");
      capabilities.setCapability("appPackage", getAppPackage());
     // capabilities.setCapability("udid", "192.168.0.5:5555");
      capabilities.setCapability(
          "chromedriverExecutable", "src/test/resources/webdriver/windows/chromedriver.exe");
//     capabilities.setCapability("deviceName", MOTO_E20.getDeviceName());
//      capabilities.setCapability("platformVersion", MOTO_E20.getVersion());
//      capabilities.setCapability("platformName", MOTO_E20.getOperatingSystem());
      capabilities.setCapability("automationName", "UiAutomator2");
      capabilities.setCapability("autoGrantPermissions", "true");
      capabilities.setCapability("reset", "false");
      capabilities.setCapability("noReset", "false");
      capabilities.setCapability("autoDismissAlerts", "true");
      // return new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
      driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
      driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
      return driver;
    } catch (IOException e) {
      throw new Error(e);
    }
  }

  @Override
  public boolean takesScreenshots() {
    return true;
  }
}
