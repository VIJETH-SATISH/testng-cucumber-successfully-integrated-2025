package StepDefinitions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
			plugin = {"html:target/cucumber-html-report"},
			glue = {"StepDefinitions"},
			features = {"src/test/resources/features"},
			tags = "@Amazon",
			monochrome = true,
			dryRun = false

					
)

public class CucumberJunitTestRunner {

}
