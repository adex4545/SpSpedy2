package runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features= "src/test/resources/covidupdates.feature",
        glue= "stepDef",
        plugin = {"pretty","html:target/cucumber-reports","json:target/cucumber-reports/cucumber.json"},
        monochrome = true
)
public class TestRunner {
}
