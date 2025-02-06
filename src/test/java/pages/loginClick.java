package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.browserUtility;

public class loginClick extends browserUtility {
    private WebDriver driver;

    @FindBy(xpath= "//button[@id='btn_Login']")
    WebElement LoginButton;
    @FindBy(xpath = "//p[@id='error-username-input-empty']")
    WebElement UsernameError;
    @FindBy(xpath = "//p[@id='error-password-input-empty']")
    WebElement PasswordError;



    public loginClick(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public void loginButtonClick() throws InterruptedException {
        Thread.sleep(2000);
        JavascriptExecutor js = (JavascriptExecutor) driver ;
        js.executeScript("window.scrollBy(0, 500);");
        LoginButton.click();
        Thread.sleep(5000);

    }
    public void captureError() throws InterruptedException {
        WebElement usernameerrorMessageElement = driver.findElement(By.id("error-username-input-empty"));
        String usernameErrorMessage = usernameerrorMessageElement.getText();
        System.out.println("username error = "+usernameErrorMessage );
        WebElement passworderrorMessageElement = driver.findElement(By.id("error-username-input-empty"));
        String passwordErrorMessage = passworderrorMessageElement.getText();
        System.out.println("password error = "+passwordErrorMessage);
        Thread.sleep(5000);

    }

}
