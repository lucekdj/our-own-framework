package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.NewSavingsAccountPage;

public class NewSavingsSteps {
HomePage homePage = new HomePage();
NewSavingsAccountPage newSavingsPage = new NewSavingsAccountPage();
    @Given("user clicks on {string} menu")
    public void user_clicks_on_menu(String savingsBtn) {
       // homePage.clickOnMenuItem(savingsBtn);
    }

    @Given("user selects {string} subItem")
    public void user_selects_sub_item(String string) {
        
    }
    @Then("verify user is on new savings page")
    public void verifyUserIsOnNewSavingsPage() {
    }
    @When("user selects {string} on the Savings Account Type")
    public void user_selects_on_the_savings_account_type(String string) {
        
    }

    @When("user selects {string} on the Savings Account Ownership")
    public void user_selects_on_the_savings_account_ownership(String string) {
        
    }

    @When("user enters {string} on the Savings Account Name field")
    public void user_enters_on_the_savings_account_name_field(String string) {
        
    }

    @When("user enters {string} on the Initial Deposit field in Savings")
    public void user_enters_on_the_initial_deposit_field_in_savings(String string) {
        
    }

    @When("user clicks on submit button on Savings Page")
    public void user_clicks_on_submit_button_on_savings_page() {
        
    }
    @Then("verify user is on view savings page")
    public void verifyUserIsOnViewSavingsPage() {
    }

    @Then("verify new savings account was created")
    public void verify_new_savings_account_was_created() {
        
    }
}
