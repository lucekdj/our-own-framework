package stepDefs;

import org.junit.After;
import org.junit.Before;
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
