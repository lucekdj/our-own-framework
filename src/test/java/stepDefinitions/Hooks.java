package stepDefinition;


import io.cucumber.java.After;
import io.cucumber.java.Before;
import utilities.DriverUtils;

public class Hooks {
    @Before
    public void setUp(){
        DriverUtils.createDriver();

    }
    @After
    public void tearDown(){
        DriverUtils.getDriver().quit();
    }
}
