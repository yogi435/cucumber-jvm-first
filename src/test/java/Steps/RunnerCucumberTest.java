package Steps;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(plugin= {"json:target/cucumber-reports/report.json","html:target/cucumber-reports"},glue="Steps",features="src/test/resources/Features")
public class RunnerCucumberTest {

}
