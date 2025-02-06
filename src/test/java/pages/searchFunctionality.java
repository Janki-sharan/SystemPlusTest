package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.browserUtility;

import javax.xml.transform.Source;
import java.time.Duration;
import java.util.List;
import java.util.Set;

public class searchFunctionality extends browserUtility {
    private WebDriver driver;

    @FindBy(xpath= "(//span[@class='icon-search bhc-icon-search-rounded'])[4]")
    WebElement search;

    @FindBy(xpath = "(//input[@id='search-field'])[2]")
    WebElement searchField;

    @FindBy(xpath = "(//*[text()='Search'])[2]")
    WebElement searchButton;

    public searchFunctionality(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        this.w = new WebDriverWait(driver, Duration.ofSeconds(3));

    }
    private WebDriverWait w;


    public void searchIconVisibility() throws InterruptedException {
        Thread.sleep(5000);
        w.until(ExpectedConditions.elementToBeClickable(search)).click();
        System.out.println("user clicks on the search icon");
        Thread.sleep(2000);
        w.until(ExpectedConditions.visibilityOf(searchField));
        System.out.println("Search field is visible");
        searchField.sendKeys("Employee Education in 2018: Strategies to Watch");
        searchButton.click();
        Thread.sleep(5000);
    }
    public void searchresults() throws InterruptedException {
        w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='search-result']")));
        List<WebElement> results = driver.findElements(By.xpath("//a[@class='search-result']"));
        for (WebElement result : results){
            if (result.getText().contains("Employee Education in 2018: Strategies to Watch")) {
                System.out.println("the searched result is present");
                break;
            }
            else {
                System.out.println("search result is not present");
            }
        }
        Thread.sleep(5000);
    }

}
