package stepDefinitions;

import io.cucumber.java.en.Then;
import pages.BasePage;
import pages.ViewCheckingAccountPage;

public class ViewCheckingAccountSteps {

    ViewCheckingAccountPage viewCheckingAccountPage= new ViewCheckingAccountPage();
    @Then("verify user is on View Accounts Page")
    public void verify_user_is_on_view_accounts_page() {
        viewCheckingAccountPage.verifyUserIsOnViewCheckingAccount();

        
    }
    @Then("verify transaction history is displayed for the new transaction")
    public void verify_transaction_history_is_displayed_for_the_new_transaction() {
        viewCheckingAccountPage.userScrollsDownToTransactionHistoryTable();

        
    }
    @Then("verify transaction details getting updated to the database")
    public void verify_transaction_details_getting_updated_to_the_database() {
        
    }


}
