package test_runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
features = "src/test/java/features/testScenarios.feature"
,glue= {"stepDefinition"}
)

public class testrunner {

}