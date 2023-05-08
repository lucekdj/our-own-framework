package pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilities.ConfigReader;

public class NewCheckingAccountPage extends BasePage{

    @FindBy(css = "//h1[@id='page-title']")
    WebElement NewCheckingAcctPage;

    @FindBy(xpath = "//input[@id='Standard Checking']")
    WebElement standardCheckingIcon;

    @FindBy(xpath = "//input[@id='Interest Checking']")
    WebElement interestCheckingIcon;

    @FindBy(xpath = "//input[@id='Individual']")
    WebElement individualAccountIcon;

    @FindBy(xpath = "//input[@id='Joint']")
    WebElement jointAccountIcon;


    @FindBy(xpath = "//input[@id='name']")
    WebElement accountName;

    @FindBy(xpath = "//input[@id='openingBalance']")
    WebElement initialDepositAmount;

    @FindBy(xpath = "//button[@id='newCheckingSubmit']")
    WebElement submitBtn;
    @FindBy(xpath="//span[@id='new-account-msg']")
    WebElement successfulCheckingAccount;


    public void verifyNewCheckingAcctPage() {
        Assert.assertTrue("New Checking account page is not displayed", NewCheckingAcctPage.isDisplayed());
    }

    public void selectAccountType(String accountType) {
        switch (accountType) {
            case "StandardChecking":
                standardCheckingIcon.click();
                break;
            case "InterestChecking":
                interestCheckingIcon.click();
                break;


        }
    }

        public void selectAcctOwnership(String acctOwnership) {
            switch (acctOwnership) {
                case "Individual":
                    individualAccountIcon.click();
                    break;
                case "Joint":
                    jointAccountIcon.click();
                    break;


            }
        }

    public void userClicksOnSubmitBtn() {
        submitBtn.click();
    }

public void userEntersAcctName(){
        accountName.sendKeys(ConfigReader.getConfigProperty("checking.name"));

    }
    public void userEntersDepositAmount(){
       initialDepositAmount.sendKeys(ConfigReader.getConfigProperty("checking.deposit"));

    }
    public void verifySuccessfulCheckingAccountOpened(){
        successfulCheckingAccount.isDisplayed();

    }




}

