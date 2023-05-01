package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.LoginPage;

public class LoginSteps {
    LoginPage loginPage = new LoginPage();
    HomePage homePage = new HomePage();
    @Given("user enters valid {string} and {string}")
    public void user_enters_valid_username_and_password(String username, String password ) {
        loginPage.enterValidLoginInfo(username, password );
    }

        @When("user clicks on sign in button")
        public void userClicksOnSignInButton() {
            loginPage.clickSignInBtn();

    }

    @Then("verify user is successfully logged into the account")
    public void verifyUserIsSuccessfullyLoggedIntoTheAccount() {
        homePage.verifyPage();

    }
}