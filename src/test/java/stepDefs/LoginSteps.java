package stepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
    @When("user clicks on sign in button")
    public void user_clicks_on_sign_in_button() {
    }
    @Then("verify user is successfully logged into the account")
    public void verify_user_is_successfully_logged_into_the_account() {
    }

    @Given("user enters valid {string} and {string}")
    public void userEntersValidAnd(String username, String password) {
    }
}
