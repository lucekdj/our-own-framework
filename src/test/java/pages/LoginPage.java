package pages;

import jdk.nashorn.internal.runtime.regexp.joni.Config;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;
import utilities.ConfigReader;

public class LoginPage extends BasePage {

    //@FindBy() annotation takes in a type of locator and the actual locator String itself in order to find and initialize that element to the WebElement variable created below it
    @FindBy(id = "username")
    WebElement usernameInput;

    @FindBy(id = "password")
    WebElement passwordInput;

    @FindBy(id = "submit")
    WebElement submitBtn;


    public void enterValidLoginInfo() {
        usernameInput.sendKeys("kotapka21@yahoo.com");
        passwordInput.sendKeys("1234567Test");
    }

    public void enterValidLoginInfo(String username, String password) {
        usernameInput.sendKeys(ConfigReader.getConfigProperty(username));
        passwordInput.sendKeys(ConfigReader.getConfigProperty(password));
    }

        public void clickSignInBtn () {
            submitBtn.click();

    }
}

