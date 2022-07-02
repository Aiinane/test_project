package BDD.TestRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = ".idea/Features/MyTest.feature", glue = {"StepDefinition"})

public class Runner {
}
