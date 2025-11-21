package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import BasePage.BasePage;

public class GmailLoginPageObjects extends BasePage{

	
	@FindBy(xpath="//input[@name='identifier']")
	private WebElement email_INPUT;
	
	@FindBy(xpath="//span[text()='Next']")
	private WebElement next_BTN;
	
	public void enterEmail() {
		email_INPUT.sendKeys("vijeth2011");
	}
	
	public void clickNextBtn() {
		next_BTN.click();
	}
	
}
