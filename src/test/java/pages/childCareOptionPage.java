package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.Set;

public class childCareOptionPage {
    private WebDriver driver;

    @FindBy(xpath = "//h4[text()=\"Child Care Center\"]")
    WebElement Childcare;
    @FindBy(xpath = "//h1[@class='bh-login-intro__heading']")
    WebElement LogInLogo;
    @FindBy(id = "username")
    WebElement UsernameField;
    @FindBy(id = "current-password")
    WebElement PasswordField;


    public childCareOptionPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void childCareoptionClick() throws InterruptedException {
        System.out.println("user is on the child care option");
        Childcare.click();
        Thread.sleep(6000);

    }
    public void childCareNewTab() throws InterruptedException {
        String mainWindowHandle = driver.getWindowHandle();
        Set<String> allWindowHandles = driver.getWindowHandles();
        for (String handle : allWindowHandles) {
            if (!handle.equals(mainWindowHandle)) {
                driver.switchTo().window(handle);
                break;
            }
            System.out.println("user is on the childcare window");
            Thread.sleep(10000);
        }
        if (LogInLogo.isDisplayed() && UsernameField.isDisplayed() && PasswordField.isDisplayed()){
            System.out.println("LOGIN lOGO, username and password fields are  PRESENT");
        }
        Thread.sleep(5000);
    }
}
