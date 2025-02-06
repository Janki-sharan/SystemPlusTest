Feature:Verify Login Functionality

  Scenario: Verify Search Functionality
    Given User navigate to the login page
    Then User clicks on the search icon

  Scenario: Verify Login portal option
    Given User navigate to the login page
    When User clicks on login button
    Then User validates child care and employee benifit portal option available

  Scenario: Verify User should navigate to another tab when click on child
    Given User navigate to the login page
    When User clicks on child care center
    Then User verifies new tab gets open with login details

  Scenario: Verify alert message when user clicks on Login Button without providing credentials
    Given User navigate to the login page
    When User clicks on child care center
    Then User clicks on the Login Button

  Scenario: Verify alert message when user enters wrong crendentials
    Given User navigate to the login page
    When User clicks on child care center
    Then User enters the login credentials
    Then User clicks on the Login Button

  Scenario: Verify New user can registed in the portal
    Given User navigate to the login page
    When User clicks on child care center
    Then User clicks on the new register page

  Scenario: Verify Privacy acknowledgment is mandatory while new user registration
    Given User navigate to the login page
    When User clicks on child care center
    Then User clicks on the new register page and fill the mandatory info without acknowledgment

  Scenario: Verify Email functionality while new registration
    Given User navigate to the login page
    When User clicks on child care center
    Then User clicks on new resister and will fill all the details
    And verify the email


