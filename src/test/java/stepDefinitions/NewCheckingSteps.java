package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.HomePage;
import pages.NewCheckingAccountPage;

public class  NewCheckingSteps {

HomePage homePage= new HomePage();
NewCheckingAccountPage newCheckingPage= new NewCheckingAccountPage();

    @Given("user clicks on Checking dropdown")
    public void user_clicks_on_dropdown() throws InterruptedException {
        homePage.clickOnCheckingDropdown();

    }




    @Then("user clicks on New Checking")
    public void user_clicks_on(String newCheckingBtn) {
        homePage.clickOnSubmenuChecking(newCheckingBtn);
        
    }

    @Then("verify user is on New Checking page")
    public void verify_user_is_on_new_checking_page() {
        newCheckingPage.verifyNewCheckingAcctPage();
        
    }
    @And("user selects {string} on the Checking Account Type menu")
    public void userSelectsOnTheCheckingAccountTypeMenu(String accountType) {
        newCheckingPage.selectAccountType();
    }
    @And("user selects {string} on the Select Account Ownership")
    public void userSelectsOnTheSelectAccountOwnership(String acctOwnership) {
        newCheckingPage.selectAcctOwnership(acctOwnership);
    }
    @Then("user enters {string}")
    public void user_enters(String accountName) {
        newCheckingPage.userEntersAcctName(accountName);


    }

    @Then("user clicks on submit button on checking page")
    public void user_clicks_on_submit_button_on_checking_page() {
        newCheckingPage.userClicksOnSubmitBtn();
        
    }

    @And("user enters {string} Amount")
    public void userEntersInitialDepositAmount(String initialDeposit) {
        newCheckingPage.userEntersDepositAmount(initialDeposit);
    }

    @Then("verify user successfully created a checking account")
    public void verifyUserSuccessfullyCreatedACheckingAccount() {
        newCheckingPage.verifySuccessfulCheckingAccountOpened();
    }
}


