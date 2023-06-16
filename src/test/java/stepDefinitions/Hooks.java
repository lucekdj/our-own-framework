package stepDefinitions;


import io.cucumber.java.After;
import io.cucumber.java.Before;
import utilities.ConfigReader;
import utilities.DataBaseUtils;
import utilities.DriverUtils;

public class Hooks {
    @Before
    public void setUp(){
        ConfigReader.initializeProperties();
        DataBaseUtils.InitializeDataBaseProperties();
        DriverUtils.createDriver();


    }
    @After
    public void tearDown(){
        DataBaseUtils.closeDataBaseConnection();
        DriverUtils.getDriver().quit();
    }
}
