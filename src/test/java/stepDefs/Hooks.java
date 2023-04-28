package stepDefs;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import utilities.DriverUtils;

public class Hooks {

    @Before
    public void setup(){
        DriverUtils.createDriver();

    }
    @After
    public void tearDown(){
        DriverUtils.getDriver().quit();
    }

}
