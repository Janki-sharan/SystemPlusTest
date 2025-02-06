package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BrowserDriver {
    public static WebDriver driver;

    public ChromeOptions options;

    public BrowserDriver(){
        this.driver = driver;
        System.setProperty("webdriver.chrome.driver", "D:\\New\\intelij_project\\EndToEnd\\driver\\chromedriver.exe");
        this.driver = new ChromeDriver();
    }
    public void close(){
        this.driver.close();
    }
}
