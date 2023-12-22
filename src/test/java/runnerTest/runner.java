package runnerTest;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(features={"src/test/resources/feature/Data.feature"}, glue = {"stepdefinition"},plugin= {"pretty","html:test-output"})
	
public class runner{
}





