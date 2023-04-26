package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import utilities.ConfigReader;
import utilities.DriverUtils;

public class BasePage {
    WebDriver driver= DriverUtils.getDriver();

    public BasePage(){
        PageFactory.initElements(driver,this);

        ConfigReader.initialize
    }
}
