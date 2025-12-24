package StepDefinitions;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
			plugin = {"html:target/cucumber-html-report"},
			glue = {"StepDefinitions"},
			features = {"src/test/resources/features"},
			monochrome = true,
			dryRun = false					
)

public class CucumberGithubWorkflowTestRunner extends AbstractTestNGCucumberTests{

	@Override
	@DataProvider(parallel=true)
	public Object[][] scenarios(){
		return super.scenarios();
	}
	
}
