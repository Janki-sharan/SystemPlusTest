package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.browserUtility;

import java.time.Duration;

public class fillRequiredFields extends browserUtility {
    private WebDriver driver;

    @FindBy(xpath= "//a[contains(text(), 'Join Today')]")
    WebElement register;

    @FindBy(xpath = "//h1[@class='bh--heading']")
    WebElement registerPage;

    @FindBy(xpath = "//select[@id='country']")
    WebElement countryDropdown;

    @FindBy(xpath = "//button[@id='btn_Continue']")
    WebElement countinueButton;



    public fillRequiredFields(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }

    public void userInfo() throws InterruptedException {
        driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Janki sharan");
        driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("mishra");
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("sharanjanki2009@gmail.com");
        driver.findElement(By.xpath("//input[@id='zip']")).sendKeys("411014");
        Select s = new Select(countryDropdown);
        s.selectByValue("IND");
        System.out.println("user enters all mandatory info");
        countinueButton.click();

    }
    public void error() throws InterruptedException {
        WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(3));
        w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@id=\"error-privacy-input-empty\"]")));
        WebElement privacyErrormsg = driver.findElement(By.xpath("//p[@id=\"error-privacy-input-empty\"]"));
        String errormsg= privacyErrormsg.getText();
        System.out.println(errormsg);
        Thread.sleep(5000);

    }

}
