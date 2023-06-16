package stepDefinitions;

import io.cucumber.java.en.Then;
import pages.HomePage;

public class HomeSteps {

    HomePage homePage = new HomePage();

    @Then("verify user is successfully logged into the account")
    public void verifyUserIsSuccessfullyLoggedIntoTheAccount() {
        homePage.verifyPage();
    }

    @Then("user clicks on Transfer Between Accounts")
    public void userClicksOnTransferBetweenAccounts() {
        homePage.clicksOnTransferBetweenAccounts();
    }
}

