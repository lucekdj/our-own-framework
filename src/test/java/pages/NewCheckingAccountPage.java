package pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilities.ConfigReader;

public class NewCheckingAccountPage extends BasePage{

    @FindBy(xpath = "//h1[@id='page-title']")
    WebElement newCheckingAcctPage;

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
        Assert.assertTrue("New Checking account page is not displayed", newCheckingAcctPage.isDisplayed());
    }

    public void selectAccountType(String accountType ) {
        if(accountType.contains("Standard")){
            standardCheckingIcon.click();
        }else{
            interestCheckingIcon.click();
        }
    }
    public void selectAcctOwnership(String ownershipType){
        if(ownershipType.contains("Individual")){
            individualAccountIcon.click();
        }else{
            jointAccountIcon.click();
        }
    }


    public void userClicksOnSubmitBtn() {
        submitBtn.click();
    }

    public void userEntersAcctName(String acctName){

        accountName.sendKeys(acctName);


    }
    public void userEntersDepositAmount(String initDeposit){
       initialDepositAmount.sendKeys(initDeposit);

    }
    public void verifySuccessfulCheckingAccountOpened(){
        successfulCheckingAccount.isDisplayed();

    }





}

