package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;
import pages.RegistrationFirstPage;
import pages.RegistrationSecondPage;

public class RegistrationSteps {

    LoginPage loginPage= new LoginPage();
    RegistrationFirstPage registrationFirstPage= new RegistrationFirstPage();



    @Given("user clicks on sign up here button")
    public void user_clicks_on_sign_up_here_button() {
        loginPage.clickSignUpHere();
       
    }
    @When("user fills out first registration page")
    public void user_fills_out_first_registration_page() {
        registrationFirstPage.fillOutFirstPage();
        registrationFirstPage.clickNextFirstPage();
       
    }
    @Then("user fills out second registration page")
    public void user_fills_out_second_registration_page() {
       
    }
    @Then("verify registration is successful")
    public void verify_registration_is_successful() {
       
    }

//
//    Feature: Register user feature
//
//    Scenario: Verify user is able to register for account
//    Given user clicks on sign up here button
//    When user fills out first registration page
//    Then user fills out second registration page
//    Then verify registration is successful


}
