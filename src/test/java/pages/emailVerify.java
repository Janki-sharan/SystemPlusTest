package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.browserUtility;


public class emailVerify extends browserUtility {
    private WebDriver driver;

    @FindBy(xpath= "//a[contains(text(), 'Join Today')]")
    WebElement register;

    @FindBy(xpath = "//h1[@class='bh--heading']")
    WebElement registerPage;

    @FindBy(xpath = "//select[@id='country']")
    WebElement countryDropdown;

    @FindBy(xpath = "//button[@type='submit']")
    WebElement countinueButton;

    @FindBy(xpath = "//input[@id='checkbox-input']")
    WebElement checkbox;

    @FindBy(xpath = "//input[@value='selfemployer']")
    WebElement radioButton;



    public emailVerify(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public void userinfo() throws InterruptedException {

            driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Janki sharan");
            driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("mishra");
            driver.findElement(By.xpath("//input[@id='email']")).sendKeys("sharanjanki2009@gmail.com");
            Select s = new Select(countryDropdown);
            s.selectByValue("IND");
            driver.findElement(By.xpath("//input[@id='zip']")).sendKeys("411014");
            Thread.sleep(5000);
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("arguments[0].click();", checkbox);
            System.out.println("user enters all mandatory info");
            Thread.sleep(5000);
            js.executeScript("arguments[0].click();", countinueButton);
            countinueButton.click();
            Thread.sleep(2000);
            countinueButton.click();
            System.out.println("countinue button is working");
            Thread.sleep(10000);
    }

    public void verifyemail() throws InterruptedException {
        radioButton.click();
        Thread.sleep(2000);
        countinueButton.click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//p[text()='We sent you an email']")).isDisplayed();
        Thread.sleep(15000);

    }
}
