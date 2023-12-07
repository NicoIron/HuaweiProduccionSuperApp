package recorridoSuperApp.utils.enums;

import static recorridoSuperApp.utils.Utilities.getEnvironments;

public enum AppPackage {
  APP_DEV("Dev", "com.clarocolombia.miclaro"),
  APP_PROD("Prod", "com.clarocolombia.miclaro");

  private final String environment;
  private final String urlPackage;

  AppPackage(String environment, String urlPackage) {
    this.environment = environment;
    this.urlPackage = urlPackage;
  }

  public String getEnvironment() {
    return environment;
  }

  public String getUrlPackage() {
    return urlPackage;
  }

  public static String getAppPackage() {
    String packages = null;
    for (AppPackage appPackage : AppPackage.values()) {
      if (getEnvironments().equals(appPackage.getEnvironment())) {
        packages = appPackage.getUrlPackage();
        break;
      }
    }
    return packages;
  }
}
