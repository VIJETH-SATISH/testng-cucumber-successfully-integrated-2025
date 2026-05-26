package Utils;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class redbusXpath {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.edgedriver().setup();
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://www.redbus.in/");
//		driver.findElement(By.xpath("//search[@role='search']//following::div[contains(@class, 'dateWrapper')]/child::div[1]")).click();
//		Thread.sleep(3500);
////		driver.findElement(By.xpath("//div[contains(@class ,'datePicker')]//ul[contains(@class,'datesWrap')]//span[text()='23']")).click();
//		driver.findElement(By.xpath("//span[text()='24']")).click();
//		Thread.sleep(3500);
//		driver.quit();
//		
		driver.findElement(By.xpath("//div[contains(@class,'inputAndSwapWrapper')]")).click();
		Thread.sleep(3500);
		driver.findElement(By.xpath("//div[contains(@class,'inputAndSwapWrapper')]//input")).sendKeys("Bengaluru");
		Thread.sleep(6000);
//		driver.findElement(By.xpath("//div[contains(@class ,'datePicker')]//ul[contains(@class,'datesWrap')]//span[text()='23']")).click();
		driver.findElement(By.xpath("//div[contains(@role,'heading') and contains(@class,'listHeader') and contains(text(),'Kempegowda International Airport Bengaluru')]")).click();
		Thread.sleep(8000);
		
		
		
		
	}

}
