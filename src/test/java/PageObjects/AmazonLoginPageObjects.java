package PageObjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import BasePage.BasePage;

public class AmazonLoginPageObjects extends BasePage {

	@FindBy(xpath="//input[@id='twotabsearchtextbox']")
	private WebElement search_INPUT;
	
	@FindBy(xpath="(//span[contains(text(),'LEGO Speed Champions Ferrari SF-24 F1 Race Car Driver')])[1]")
	private WebElement item_TXT;
	
	@FindBy(id="nav-link-accountList")
	private WebElement Sign_In_Drop_Down_BTN;
	
	
	@FindBy(xpath="//span[contains(text(),'Hello')]")
	private WebElement Hello_BTN;
	
	@FindBy(id="ap_email_login")
	private WebElement email_TXT;
	
	@FindBy(xpath="//input[@type='submit']")
	private WebElement continue_BTN;
	
	@FindBy(id="ap_password")
	private WebElement pwd_TXT;
	
	@FindBy(id="signInSubmit")
	private WebElement signIn_BTN;
	
	public void enterSearchItem() {			
		longWait.get().until(ExpectedConditions.elementToBeClickable(Hello_BTN)).click();
		longWait.get().until(ExpectedConditions.elementToBeClickable(email_TXT)).sendKeys("vijeth2011@gmail.com");
		mediumWait.get().until(ExpectedConditions.elementToBeClickable(continue_BTN)).click();
		longWait.get().until(ExpectedConditions.elementToBeClickable(pwd_TXT)).sendKeys("Vij");
		mediumWait.get().until(ExpectedConditions.elementToBeClickable(signIn_BTN)).click();		

		longWait.get().until(ExpectedConditions.visibilityOf(search_INPUT)).sendKeys("LEGO Speed Champions Ferrari");;
		longWait.get().until(ExpectedConditions.elementToBeClickable(item_TXT)).click();
		
	}
	
	public void clickSearchItem() {
		item_TXT.click();
	}
	
}
