package pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class InternalTransferPage extends BasePage{

    @FindBy(xpath = "//h1[contains(text(),'Internal Transfer')]")
    WebElement verifyTransferPage;
    @FindBy(xpath = "//select[@id='fromAccount']")
    WebElement fromAccountDropdown;
    @FindBy(xpath = "//select[@id='toAccount']")
    WebElement toAccountDropdown;
    @FindBy(css = "#amount")
    WebElement transferAmount;
    @FindBy(css = "#notification")
    WebElement submitBtn;


    public void verifyInternalTransferPage() {
        Assert.assertTrue("User is not on Transfer Page",verifyTransferPage.isDisplayed());

    }

    public void selectFromAccount(String fromAccount) {
        new Select(fromAccountDropdown).selectByV;
    }
}
