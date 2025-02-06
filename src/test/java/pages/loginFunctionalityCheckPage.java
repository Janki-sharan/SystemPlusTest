package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import utilities.browserUtility;
import java.time.Duration;
import java.util.Set;

public class loginFunctionalityCheckPage extends browserUtility {

    private WebDriver driver;

    @FindBy(xpath = "(//a[@class = 'nav-link-login global_header_login track_cta_click'])[2]")
    WebElement loginBtn;

    @FindBy(xpath = "//h4[text()=\"Child Care Center\"]")
    WebElement childcare;

    @FindBy(xpath = "//h4[text()=\"Employee Benefits\"]")
    WebElement employeecare;



    public loginFunctionalityCheckPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickOnLoginBtn() {
        loginBtn.click();
        System.out.println("user clicks on the login button");
    }

    public void getoptions() throws InterruptedException {
        String mainWindowHandle = driver.getWindowHandle();
        Set<String> allWindowHandles = driver.getWindowHandles();
        for (String handle : allWindowHandles) {
            if (!handle.equals(mainWindowHandle)) {
                // Switch to the new popup window
                driver.switchTo().window(handle);
                break;
            }
            System.out.println("user is on the popup window");
            Thread.sleep(3000);
        }
        try {
            System.out.println("user enters try block");
            if (childcare.isDisplayed() && employeecare.isDisplayed()){
                System.out.println("childcare and employee benifit tabs are present");
            }
        }
        catch (Exception e){
            Assert.fail("Element is not present");
        }
    }

}
