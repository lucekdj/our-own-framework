package pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

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

    public void clickSignInBtn(){
        submitBtn.click();
    }


}