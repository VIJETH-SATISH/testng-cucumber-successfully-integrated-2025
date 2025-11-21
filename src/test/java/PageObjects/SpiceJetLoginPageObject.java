package PageObjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import BasePage.BasePage;
import ExtentFactory.DriverExtent;



public class SpiceJetLoginPageObject extends BasePage {

	
	@FindBy(xpath="//*[contains(@value,'Delhi (DEL)')]")
	private WebElement start_Point;
	
	@FindBy(xpath="(//div[contains(text(),'From')])[1]/following-sibling::div/input")
	private WebElement start_Point_input;
	
	@FindBy(xpath="(//*[contains(text(),'To')])[2]/following-sibling::div/input")
	private WebElement to_Point;
	
	@FindBy(xpath="((//div[contains(text(),'Departure Date')])[1]/following-sibling::div/div)[1]")
	private WebElement startDate;
	
	@FindBy(xpath="(//div[text()='24'])[1]")
	private WebElement startDate_TXT;
	
	@FindBy(xpath="//*[@id=\"fare-bundle-val\"]/div[3]")
	private WebElement upgrade_RadioButton;
	
	//*[@id='main-container']/div/div[1]/div[3]/div[2]/div[7]/div[2]/div
	@FindBy(xpath="//*[@id='main-container']/div/div[1]/div[3]/div[2]/div[7]/div[2]/div")
	private WebElement searchFlight;
	
	@FindBy(xpath="//*[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[5]/div[2]/div")
	private WebElement currency;
	
	public void enterStartPoint() {
		start_Point.click();
		start_Point_input.sendKeys("BLR");
	}
	
	public void enterToPoint() {
		to_Point.sendKeys("BOM");
	}
	
	public void enterStartDate() {
		startDate.click();
		JavascriptExecutor js = (JavascriptExecutor)DriverExtent.getDriver();
		WebElement depart_ele = DriverExtent.getDriver().findElement(By.xpath("(//div[contains(@class,'css-76zvg2 css-bfa6kz r-homxoj r-ubezar')])[1]"));
//		WebElement return_ele = DriverExtent.getDriver().getDriver().findElement(By.xpath("(//div[contains(@class,'css-76zvg2 css-bfa6kz r-homxoj r-ubezar')])[2]"));
		js.executeScript("arguments[0].innerText='Tue, 27 May 2025';", depart_ele);

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public void clickSerachFlight() {
		
		JavascriptExecutor js = (JavascriptExecutor)DriverExtent.getDriver();
		WebElement depart_ele = DriverExtent.getDriver().findElement(By.xpath("(//div[contains(@class,'css-76zvg2 css-bfa6kz r-homxoj r-ubezar')])[1]"));
		WebElement return_ele = DriverExtent.getDriver().findElement(By.xpath("(//div[contains(@class,'css-76zvg2 css-bfa6kz r-homxoj r-ubezar')])[2]"));
	
		js.executeScript("arguments[0].innerText='Tue, 27 May 2025';", depart_ele);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		js.executeScript("arguments[0].innerText='Thu, 31 Jan 2025';", return_ele);

		try {	
			WebElement return_ele_Nosuchlement = DriverExtent.getDriver().findElement(By.xpath("(//div[contains(@class,'css-76zvg2 css-bfa6kz r-homxoj r-ubezar')])[2]"));
			return_ele_Nosuchlement.sendKeys("Thu, 31 Jan 2025");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("ElementNotInteractableException with such a path found!! being caught in catch block");
		}
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
//		DriverExtent.getDriver().findElement(By.xpath("//*[@id='main-container']/div/div[1]/div[3]/div[2]/div[7]/div[2]/div")).click();
		/*************/
		WebDriverWait wait = new WebDriverWait(DriverExtent.getDriver(), Duration.ofSeconds(25));
		wait.until(ExpectedConditions.visibilityOf(searchFlight));

		searchFlight.click();
	}
	
	public void clickUpgradeButton() {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(35));
		wait.until(ExpectedConditions.visibilityOf(upgrade_RadioButton));
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		upgrade_RadioButton.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
	
}
