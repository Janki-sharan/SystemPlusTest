package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.browserUtility;

import java.time.Duration;

public class registerpage extends browserUtility {
    private WebDriver driver;

    @FindBy(xpath= "//a[contains(text(), 'Join Today')]")
    WebElement register;

    @FindBy(xpath = "//body//h1[@class='bh--heading']")
    WebElement registerPage;

    public registerpage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public void clickOnRegister() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 500);");
        Thread.sleep(2000);
        register.click();
        System.out.println("user clicks on register button");
        Thread.sleep(2000);
        System.out.println("user navigates to the new user register page");
        Thread.sleep(2000);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        registerPage = wait.until(ExpectedConditions.visibilityOf(registerPage));
        if (registerPage.isDisplayed()){
            System.out.println("user is on the new user registration page");
        }
        Thread.sleep(10000);

    }
}
