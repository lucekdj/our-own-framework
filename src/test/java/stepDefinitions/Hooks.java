package stepDefinitions;


import io.cucumber.java.After;
import io.cucumber.java.Before;
import utilities.ConfigReader;
import utilities.DriverUtils;

public class Hooks {
    @Before
    public void setUp(){
        ConfigReader.initializeProperties();
        DriverUtils.createDriver();


    }
    @After
    public void tearDown(){
        DriverUtils.getDriver().quit();
    }
}
