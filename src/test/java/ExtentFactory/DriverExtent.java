package ExtentFactory;
import org.openqa.selenium.WebDriver;

public class DriverExtent {

	static DriverExtent instance = new DriverExtent();
	
	private static ThreadLocal<WebDriver> driver = new ThreadLocal<WebDriver>();
	
	public DriverExtent() {
		
	}
	

	public static DriverExtent getInstance() {
		return instance;
	}
		
	
	public static WebDriver getDriver() {
		return driver.get();
	}
	
	public static void setDriver(WebDriver driver) {
		DriverExtent.driver.set(driver);
	}
	
	
}
