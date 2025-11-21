package StepDefinitions;

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import ExtentFactory.DriverExtent;
import io.cucumber.java.After;
import io.cucumber.java.Before;



public class CommonStepDefinitions {

	
	@Before
	public void LaunchBrowser() {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\V\\Downloads\\edgedriver_win64 (4)\\msedgedriver.exe");
//		WebDriverManager.edgedriver().setup();
		EdgeOptions options = new EdgeOptions();
		options.addArguments("--headless=new");
		options.addArguments("--disable-gpu");
		options.addArguments("--no-sandbox");
		options.addArguments("--disable-dev-shm-usage");
		options.addArguments("--disable-extensions");
		options.addArguments("--remote-allow-origins=*");
		EdgeDriver driver = new EdgeDriver(options);
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
