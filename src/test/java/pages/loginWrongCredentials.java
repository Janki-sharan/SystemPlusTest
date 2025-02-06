package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.browserUtility;

public class loginWrongCredentials extends browserUtility {
    private WebDriver driver;

    @FindBy(xpath= "//button[@data-atm-button='login']")
    WebElement LoginButton;



    public loginWrongCredentials(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public void wrongLoginCredentials() throws InterruptedException {
        driver.findElement(By.id("username")).sendKeys("sharanjanki2009@gmail.com");
        driver.findElement(By.id("current-password")).sendKeys("1234");
        Thread.sleep(2000);
        LoginButton.click();
        System.out.println("user clicks on login button");
        Thread.sleep(15000);

    }
    public void errormessage() throws InterruptedException {
        WebElement errorMessageElement = driver.findElement(By.xpath("//form//p[@class='bh-alert__header bh-alert__header--error']"));
        String ErrorMessage = errorMessageElement.getText();
        System.out.println("username error = "+ErrorMessage );
        Thread.sleep(5000);
    }

}
