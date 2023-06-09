package pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewSavingsAccountPage extends BasePage {
    @FindBy(xpath = "//strong[contains(text(),'New Savings Account')]")
    WebElement newSavingsAcctPage;

    @FindBy(css = "#Savings")
    WebElement savings;

    @FindBy (xpath = "//label[@for='Money Market']")
    WebElement moneyMarket;

    @FindBy (css = "#Individual")
    WebElement individual;

    @FindBy (css = "#Joint")
    WebElement joint;



    public void verifyNewSavingsAcctPage() {
        Assert.assertTrue("New Savings account page is not displayed", newSavingsAcctPage.isDisplayed());
    }






}



