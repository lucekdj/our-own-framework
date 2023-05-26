package pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class HomePage extends BasePage {
    @FindBy(xpath = "//li[@class='active']")
    WebElement welcomeTestMessage;
    @FindBy(xpath= "//a[@id='checking-menu']")
    WebElement checkingDropdown;
    @FindBy(css = "#savings-menu")
    WebElement savingsBtn;
    @FindBy(css = "#external-accounts-menu")
    WebElement externalBtn;
    @FindBy(css = "#deposit-menu-item")
    WebElement depositBtn;
    @FindBy(css = "#withdraw-menu-item")
    WebElement withdrawBtn;
    @FindBy(css = "#transfer-menu-item")
    WebElement transferBtnAccountsBtn;
    @FindBy(css = "#visa-transfer-menu-item")
    WebElement visaDirectTransferBtn;
    @FindBy(css = "#view-checking-menu-item")
    WebElement viewCheckingBtn;

    @FindBy(xpath = "//a[@id='new-checking-menu-item']")
    WebElement newCheckingBtn;
    @FindBy(css = "#view-savings-menu-item")
    WebElement viewSavingsBtn;

    @FindBy(css = "#new-savings-menu-item")
    WebElement newSavingsBtn;
    @FindBy(css = "#link-external-menu-item")
    WebElement linkExternalAccountBtn;
    @FindBy(css = "#view-external-menu-item")
    WebElement viewExternalAccountBtn;


    public void verifyPage() {
        Assert.assertTrue("Welcome test not displayed", welcomeTestMessage.isDisplayed());
    }

    public void clickOnCheckingDropdown() throws InterruptedException {
        checkingDropdown.click();
        Thread.sleep(3000);
    }

    public void clickOnSavingsDropdown(){
        savingsBtn.click();
    }
 
    public void clickOnNewCheckingBtn(){
        newCheckingBtn.click();
    }

    public void clickOnSubmenu(String subMenu){
        switch (subMenu){
            case "view checking":
                viewCheckingBtn.click();
                break;
            case "new checking":
                newCheckingBtn.click();
                break;

        }
    }



}






