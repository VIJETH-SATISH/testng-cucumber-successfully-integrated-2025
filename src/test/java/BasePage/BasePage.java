package BasePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import ExtentFactory.DriverExtent;

public class BasePage {

	public WebDriver driver;
	
	public BasePage() {
		
//		this.driver = DriverExtent.getInstance().getDriver();
		this.driver = DriverExtent.getDriver();
//		DriverExtent.getInstance().setDriver(this.driver);
		DriverExtent.setDriver(this.driver);
		PageFactory.initElements(this.driver, this);
		
	}
	
	
	
	
}
