package StepDefinitions;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;

import org.testng.annotations.DataProvider;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
			plugin = {"html:target/cucumber-html-report"},
			glue = {"StepDefinitions"},
			features = {"src/test/resources/features"},
			tags = "@saucedemo_GithubWorkflow_secret",
			monochrome = true,
			dryRun = false					
)

public class CucumberTestRunner extends AbstractTestNGCucumberTests{

	@Override
    @DataProvider(parallel = true)
    public Object[][] scenarios() {
        return super.scenarios();
    }
				
}
