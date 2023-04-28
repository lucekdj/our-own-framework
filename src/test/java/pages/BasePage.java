package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import utilities.DriverUtils;

public class BasePage {
    WebDriver driver = DriverUtils.getDriver();  // other classes will inherit this driver

    public BasePage(){                            // creating constructor

        //    //The page factory class is essentially what makes Page Object Model easy and worthwhile to implement
        //    //It will essentially dynamically initialize the WebElements on the page
        //    //The .initElements() method is used to initialize the elements and we need to pass the driver and the object
        //    //page that we want to initialize the elements on

        PageFactory.initElements(driver, this);              // class help creating object model  this: passing page
    }
}
