package stepDefinition;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.*;
import utilities.browserUtility; // Assuming this is where you handle WebDriver initialization

public class loginFunctionalityCheck {

    private loginFunctionalityCheckPage lg;
    private handleCookie cookie;
    private childCareOptionPage child;
    private loginClick click;
    private loginWrongCredentials wrong;
    private registerpage rg;
    private fillRequiredFields info;
    private emailVerify email;
    private searchFunctionality sr;

    @Then("User clicks on the search icon")
    public void User_clicks_on_the_search_icon() throws InterruptedException {
        cookie = new handleCookie(browserUtility.getDriver());
        sr = new searchFunctionality(browserUtility.getDriver());
        cookie.acceptCookies();
        sr.searchIconVisibility();
        sr.searchresults();
    }

    @When("User clicks on login button")
    public void User_clicks_on_login_button() throws InterruptedException {
        lg = new loginFunctionalityCheckPage(browserUtility.getDriver());
        cookie = new handleCookie(browserUtility.getDriver());
        cookie.acceptCookies();
        lg.clickOnLoginBtn();


    }

    @Then("User validates child care and employee benifit portal option available")
    public void User_validates_child_care_and_employee_benifit_portal_option_available() throws InterruptedException {
        lg.getoptions();

    }

    @When("User clicks on child care center")
    public void User_clicks_on_child_care_center() throws InterruptedException {
        child = new childCareOptionPage(browserUtility.getDriver());
        lg = new loginFunctionalityCheckPage(browserUtility.getDriver());
        cookie = new handleCookie(browserUtility.getDriver());
        cookie.acceptCookies();
        lg.clickOnLoginBtn();
        lg.getoptions();
        child.childCareoptionClick();


    }

    @Then("User verifies new tab gets open with login details")
    public void User_verifies_new_tab_gets_open_with_login_details() throws InterruptedException {
        child.childCareNewTab();

    }

    @Then("User clicks on the Login Button")
    public void User_clicks_on_the_Login_Button() throws InterruptedException {
        click = new loginClick(browserUtility.getDriver());
        child.childCareNewTab();
        click.loginButtonClick();
        click.captureError();
    }

    @Then("User enters the login credentials")
    public void User_enters_the_login_credentials() throws InterruptedException {
        wrong = new loginWrongCredentials(browserUtility.getDriver());
        child.childCareNewTab();
        wrong.wrongLoginCredentials();
        wrong.errormessage();
    }

    @Then("User clicks on the new register page")
    public void User_clicks_on_the_new_register_page() throws InterruptedException {
        rg = new registerpage(browserUtility.getDriver());
        child.childCareNewTab();
        rg.clickOnRegister();
    }

    @Then("User clicks on the new register page and fill the mandatory info without acknowledgment")
    public void User_clicks_on_the_new_register_page_and_fill_the_mandatory_info_without_acknowledgment() throws InterruptedException {
        info = new fillRequiredFields(browserUtility.getDriver());
        rg = new registerpage(browserUtility.getDriver());
        child.childCareNewTab();
        rg.clickOnRegister();
        info.userInfo();
        info.error();
    }

    @Then("User clicks on new resister and will fill all the details")
    public void User_clicks_on_new_resister_and_will_fill_all_the_details() throws InterruptedException {
        rg = new registerpage(browserUtility.getDriver());
        email = new emailVerify(browserUtility.getDriver());
        child.childCareNewTab();
        rg.clickOnRegister();
        email.userinfo();
    }

    @Then("verify the email")
    public void verify_the_email() throws InterruptedException {
        email.verifyemail();


    }
}