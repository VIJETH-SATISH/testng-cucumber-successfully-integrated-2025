package StepDefinitions;

import org.openqa.selenium.edge.EdgeDriver;

import ExtentFactory.DriverExtent;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;



public class CommonStepDefinitions {

	
	@Before
	public void LaunchBrowser() {
//		System.setProperty("", "")
		WebDriverManager.edgedriver().setup();
		EdgeDriver driver = new EdgeDriver();
//		DriverExtent.getInstance().setDriver(driver);
		DriverExtent.setDriver(driver);
		driver.manage().window().maximize(); 
	}
	
	@After
	public void quitBrowser() {
//		DriverExtent.getInstance().getDriver().quit();
		DriverExtent.getDriver().quit();
	}
	
}
