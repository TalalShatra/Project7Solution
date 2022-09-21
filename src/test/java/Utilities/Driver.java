package Utilities;

import POM.BasePOM;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {
    public static WebDriver driver;

    public static WebDriver getDriver() {
        // if the driver object is equal to null (there is no active driver instance) then we'll create a new driver instance
        if (driver == null) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        }
        return driver;
    }

    public static void quitDriver() {
        BasePOM.delay(5);

        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}
