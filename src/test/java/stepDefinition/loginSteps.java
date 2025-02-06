package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class loginSteps {
    WebDriver driver;

    public loginSteps() {
        driver = hook.driver;  // Get the driver from Hooks
    }
    @Given("User navigate to the login page")
    public void user_navigates_to_the_login_page() {
        driver.get("https://www.brighthorizons.com/");
    }
}
