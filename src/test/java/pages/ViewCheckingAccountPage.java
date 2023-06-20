package pages;

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ViewCheckingAccountPage extends BasePage{


    @FindBy(xpath = "//h1[contains(text(), 'View Checking Accounts')]")
    WebElement viewCheckingAccountsTitle;

    JavascriptExecutor js= (JavascriptExecutor) driver;
    public void verifyUserIsOnViewCheckingAccount() {
        Assert.assertTrue("User is not on view checking accounts page", viewCheckingAccountsTitle.isDisplayed());
    }

    public void userScrollsDownToTransactionHistoryTable() {
        js.executeScript("arguments[0].scrollIntoView")

    }
}
