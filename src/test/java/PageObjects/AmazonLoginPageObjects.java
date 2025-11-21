package PageObjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import BasePage.BasePage;

public class AmazonLoginPageObjects extends BasePage {

	@FindBy(xpath="//input[@id='twotabsearchtextbox']")
	private WebElement search_INPUT;
	
	@FindBy(xpath="(//span[contains(text(),'LEGO Speed Champions Ferrari SF-24 F1 Race Car Driver')])[1]")
	private WebElement item_TXT;
	
	public void enterSearchItem() {
		search_INPUT.sendKeys("lego speed champions");
		search_INPUT.sendKeys(Keys.ENTER);
	}
	
	public void clickSearchItem() {
		item_TXT.click();
	}
	
}
