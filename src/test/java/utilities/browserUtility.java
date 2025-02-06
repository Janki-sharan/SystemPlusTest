package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class browserUtility {

    private static WebDriver driver;

    // Initialize the WebDriver
    public static WebDriver getDriver() {
        if (driver == null) {
            // Assuming you are using ChromeDriver
            System.setProperty("webdriver.chrome.driver", "src/test/resources/driver/chromedriver.exe"); // Update this path
            driver = new ChromeDriver();
        }
        return driver;
    }

    // Quit the WebDriver
    public static void quitDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}
