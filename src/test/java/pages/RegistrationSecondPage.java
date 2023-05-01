package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistrationSecondPage {

    @FindBy(css = ".sufee-login")
    WebElement addressBtn;

    @FindBy(id = "#locality")
    WebElement localityBtn;

    @FindBy(xpath = "//input[@id='region']")
    WebElement regionBtn;

    @FindBy(xpath = "//input[@id='postalCode']")
    WebElement postalCodeBtn;

    @FindBy(xpath = "//input[@id='country']")
    WebElement countryBtn;

    @FindBy(xpath = "//input[@name='homePhone']")
    WebElement homePhone;

    @FindBy(xpath = "//input[@id='mobilePhone']")
    WebElement mobilePhone;

    @FindBy(xpath = "//input[@id='workPhone']")
    WebElement workPhone;

    @FindBy(xpath = "//input[@id='agree-terms']")
    WebElement agreeTermsBtn;

    @FindBy(xpath = "//button[@type='submit']")
    WebElement registerBtn;




}
