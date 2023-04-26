package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{
      @FindBy (css="#username")
      WebElement username;

      @FindBy (xpath = "//input[@type='password']")
      WebElement password;

      @FindBy(xpath = "//div[@class='checkbox']")
      WebElement rememberMeCheckbox;

      @FindBy (xpath = "//button[contains(text(),'Sign in')]")
      WebElement signInBtn;


      public void enterValidLoginInfo(){
            username.sendKeys("paulinagigi@gmail.com");
            password.sendKeys("Gigigigi1234");

      }

      public void clickOnSignIn(){
            signInBtn.click();

      }




}

