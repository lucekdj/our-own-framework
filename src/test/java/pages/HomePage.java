package pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {

    @FindBy (css= ".active")
    WebElement welcomeMessage;

    public void verifyUserOnHomePage(){
        Assert.assertTrue("User is not on the homePage",welcomeMessage.isDisplayed());
    }
}
