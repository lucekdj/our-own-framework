package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class RegistrationFirstPage extends BasePage {

    @FindBy(xpath = "//select[@name='title']")
    WebElement title;

    @FindBy(xpath = "//input[@name='firstName']")
    WebElement firstName;

    @FindBy(xpath = "//input[@name='lastName']")
    WebElement lastName;

    @FindBy(xpath = "//label[@for='male']")
    WebElement gender;

    @FindBy(xpath = "//input[@name='dob']")
    WebElement DOB;

    @FindBy(xpath = "//input[@id='ssn']")
    WebElement ssn;

    @FindBy(css = "#emailAddress")
    WebElement email;

    @FindBy(css = "#password")
    WebElement password;

    @FindBy(css = "#confirmPassword")
    WebElement confirmPassword;

    @FindBy(xpath = "//button[contains(text(),'Next')]")
    WebElement nextBtn;


    public void fillOutFirstPage() {
        new Select(title).selectByVisibleText("Mr.");
        firstName.sendKeys("Paula");
        lastName.sendKeys("Smith");
        gender.click();
        DOB.sendKeys("11/19/2012");
        ssn.sendKeys(faker.idNumber().ssnValid());
        email.sendKeys(faker.internet().emailAddress());
        password.sendKeys("Gigigigi1234");
        confirmPassword.sendKeys("Gigigigi1234");
    }

    public void clickNextFirstPage(){
        nextBtn.click();
    }
}

