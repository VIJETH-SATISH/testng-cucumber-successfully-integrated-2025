package BasePage;

import java.io.IOException;
import java.util.Locale;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import ExtentFactory.DriverExtent;
import Utils.ConfigUtil;

public class BasePage {
	public static final int smallWaitTime = 10;
	public static final int mediumWaitTime = 20;
	public static final int longWaitTime = 30;
	public static ThreadLocal<WebDriverWait> smallWait = new ThreadLocal<WebDriverWait>();
	public static ThreadLocal<WebDriverWait> mediumWait = new ThreadLocal<WebDriverWait>();
	public static ThreadLocal<WebDriverWait> longWait = new ThreadLocal<WebDriverWait>();
	public WebDriver driver;
	
	public BasePage() {
		
//		this.driver = DriverExtent.getInstance().getDriver();
		this.driver = DriverExtent.getDriver();
//		DriverExtent.getInstance().setDriver(this.driver);
		PageFactory.initElements(this.driver, this);
		
	}
	
//	public void launchBrowserWithURL() {
//		String env;
//		try {
//			env = ConfigUtil.getEnvironment();
//			this.driver.get(ConfigUtil.getConfigProperty(env.toUpperCase(Locale.ROOT)+"_URL"));
////			this.driver.get("https://google.co.in");
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	
//	}
	
	
	
	
	
}
