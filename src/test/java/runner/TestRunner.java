package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features= "src/test/resources/features",
        glue= "stepDefinitions",
        tags= "@DB",
        plugin= {"pretty","html:html-report/report.html","json:target/cucumber.json1"},
        dryRun = true
)
public class TestRunner {

}
