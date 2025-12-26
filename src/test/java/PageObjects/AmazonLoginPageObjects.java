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
	
	@FindBy(id="user-name")
	private WebElement userName_saucedemo;
	
	@FindBy(id="password")
	private WebElement password_saucedemo;
	
	@FindBy(id="login-button")
	private WebElement loginbutton_saucedemo;
	
	public void enterSearchItem() {	
		
		String amazon_User = System.getenv("AMAZON_USER_NAME");
		String aws_Password = System.getProperty("aws.password");
		
		/*****
			longWait.get().until(ExpectedConditions.elementToBeClickable(Hello_BTN)).click();
			longWait.get().until(ExpectedConditions.elementToBeClickable(email_TXT)).sendKeys(amazon_User);
			mediumWait.get().until(ExpectedConditions.elementToBeClickable(continue_BTN)).click();
			longWait.get().until(ExpectedConditions.elementToBeClickable(pwd_TXT)).sendKeys(aws_Password);
			mediumWait.get().until(ExpectedConditions.elementToBeClickable(signIn_BTN)).click();		
		****/
		
		//standard_user
		//secret_sauce
		longWait.get().until(ExpectedConditions.elementToBeClickable(userName_saucedemo)).sendKeys("standard_user");
		longWait.get().until(ExpectedConditions.elementToBeClickable(password_saucedemo)).sendKeys("secret_sauce");
		longWait.get().until(ExpectedConditions.elementToBeClickable(loginbutton_saucedemo)).click();
		
		/*
		longWait.get().until(ExpectedConditions.visibilityOf(search_INPUT)).sendKeys("LEGO Speed Champions Ferrari");;
		longWait.get().until(ExpectedConditions.elementToBeClickable(item_TXT)).click();
		*/
	}
	
	public void clickSearchItem() {
		item_TXT.click();
	}
	
}
