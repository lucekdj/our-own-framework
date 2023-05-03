package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.HomePage;
import pages.NewCheckingAccountPage;

public class NewCheckingSteps {

HomePage homePage= new HomePage();
NewCheckingAccountPage newCheckingPage= new NewCheckingAccountPage();

    @Given("user clicks on  {string} dropdown")
    public void user_clicks_on_dropdown(String checkingBtn) {
        homePage.clickOnMenuItem(checkingBtn);
        
    }

    @Then("user clicks on {string}")
    public void user_clicks_on(String newCheckingBtn) {
        homePage.clickOnSubMenuItemOfBankingAccounts(newCheckingBtn);
        
    }

    @Then("verify user is on New Checking page")
    public void verify_user_is_on_new_checking_page() {
        Assert.assertTrue("New Checking Account Page not displayed",);
        
    }

    @Then("user selects {string}")
    public void user_selects(String string) {

    }


    @Then("user enters {string}")
    public void user_enters(String string) {
        
    }

    @Then("user clicks on submit button on checking page")
    public void user_clicks_on_submit_button_on_checking_page() {
        
    }

    @Then("verify user is on Checking View Page")
    public void verify_user_is_on_checking_view_page() {
        
    }
    @And("user selects {string} on the Checking Account Type menu")
    public void userSelectsOnTheCheckingAccountTypeMenu(String arg0) {
    }

    @And("user selects {string} on the Select Account Ownership")
    public void userSelectsOnTheSelectAccountOwnership(String arg0) {
    }
}
