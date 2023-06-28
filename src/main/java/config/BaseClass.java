package config;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;


public class BaseClass {
   public static WebDriver driver;


   public static void BeforeParent() {
      driver = ConfigurationWebDriver.createDriver(Webdrivers.CHROME);
   }


   public static void AfterParent() throws InterruptedException {
         Thread.sleep(3000);
         driver.quit();
      }

   }

