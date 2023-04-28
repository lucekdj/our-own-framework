package stepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.LoginPage;

public class LoginSteps {

    HomePage homePage= new HomePage();
    LoginPage loginPage= new LoginPage();



    @When("user clicks on sign in button")
    public void user_clicks_on_sign_in_button() {
        loginPage.clickOnSignIn();
    }
    @Then("verify user is successfully logged into the account")
    public void verify_user_is_successfully_logged_into_the_account() {
       homePage.verifyUserOnHomePage();
    }

    @Given("user enters valid {string} and {string}")
    public void userEntersValidAnd(String username, String password) {
        loginPage.enterValidLoginInfo();

    }
}
