package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class handleCookie {
    private WebDriver driver;

    public handleCookie(WebDriver driver) {
        this.driver = driver;
    }

    public void acceptCookies() {
        try {
            WebElement acceptButton = driver.findElement(By.id("onetrust-accept-btn-handler"));
            if (acceptButton.isDisplayed() && acceptButton.isEnabled()) {
                acceptButton.click();
                System.out.println("Cookie consent accepted.");
            }
        } catch (Exception e) {
            System.out.println("Cookie consent button not found or already accepted.");
        }
    }
}
