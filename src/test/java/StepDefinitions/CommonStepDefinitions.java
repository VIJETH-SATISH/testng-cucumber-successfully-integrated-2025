package StepDefinitions;

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import ExtentFactory.DriverExtent;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CommonStepDefinitions {
	
	@Before
	public void LaunchBrowser() {
		/*NO NEED TO SET SYSTEM PROPERTY AS WE ARE USING WEBDRIVERMANAGER*/
//		System.setProperty("webdriver.edge.driver", "C:\\Users\\V\\Downloads\\edgedriver_win64 (4)\\msedgedriver.exe");
//		EdgeOptions options = new EdgeOptions();
//		options.addArguments("--disable-gpu");
//		options.addArguments("--no-sandbox");
//		options.addArguments("--disable-dev-shm-usage");
//		options.addArguments("--disable-extensions");
//		options.addArguments("--remote-allow-origins=*");
//		DriverExtent.getInstance().setDriver(driver);
		WebDriverManager.edgedriver().setup();
		EdgeDriver driver = new EdgeDriver();
		DriverExtent.setDriver(driver);
		driver.manage().window().maximize(); 
	}
	
	@After
	public void quitBrowser() {
		////
		///////
//		DriverExtent.getInstance().getDriver().quit();
		DriverExtent.getDriver().quit();
	}
	
}
