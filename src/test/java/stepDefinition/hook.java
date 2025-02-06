package stepDefinition;

import io.cucumber.java.Before;
import io.cucumber.java.After;
import org.openqa.selenium.WebDriver;
import utilities.browserUtility;

public class hook {

    static WebDriver driver;

    @Before
    public void setUp() throws InterruptedException {
        driver = browserUtility.getDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
    }

    @After
    public void tearDown() {
        browserUtility.quitDriver();
    }
}
