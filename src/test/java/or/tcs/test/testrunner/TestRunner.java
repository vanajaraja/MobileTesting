package or.tcs.test.testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\Features", glue="org.tcs.test.StepDefinition", 
monochrome=true, plugin="pretty")


public class TestRunner {

}
