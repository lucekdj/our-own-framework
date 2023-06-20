package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.Select;
import pages.InternalTransferPage;

public class InternalTransferSteps {

InternalTransferPage internalTransferPage= new InternalTransferPage();
    @Then("verify user is on Internal Transfer Page")
    public void verify_user_is_on_internal_transfer_page() {
        internalTransferPage.verifyInternalTransferPage();
        
    }

    @When("user selects from Account {string}")
    public void user_selects_from_account(String fromAccount) {
       internalTransferPage.selectFromAccount(fromAccount);
        
    }

    @Then("user selects to Account {string}")
    public void user_selects_to_account(String toAccount) {
        internalTransferPage.selectToAccount(toAccount);
        
    }

    @Then("user enters amount {string}")
    public void user_enters_amount(String amount) {
        internalTransferPage.amountTransfer(amount);
        
    }

    @Then("user clicks on submit button")
    public void user_clicks_on_submit_button() {
        internalTransferPage.clickSubmitBtn();
        
    }

    @And("verify transfer amount is less than available balance")
    public void verifyTransferAmountIsLessThanAvailableBalance() {
        internalTransferPage.verifyTransferAmountLessThanAvailableBalance();
    }
}
