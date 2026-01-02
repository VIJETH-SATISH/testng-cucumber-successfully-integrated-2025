package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import BasePage.BasePage;

public class SauceDemoGithubSecretesPageObjects extends BasePage{

	@FindBy(id="user-name")
	private WebElement userName_saucedemo;
	
	@FindBy(id="password")
	private WebElement password_saucedemo;
	
	@FindBy(id="login-button")
	private WebElement loginbutton_saucedemo;
	
	
	public void enterTheCredentialsToLogin() {
		
		String sauceDemo_User = System.getenv("SAUCEDEMO_USER_NAME");
		String sauceDemo_Password = System.getProperty("demoSauce.password");
		
		
		//username:standard_user
		//password:secret_sauce
		longWait.get().until(ExpectedConditions.elementToBeClickable(userName_saucedemo)).sendKeys(sauceDemo_User);
		longWait.get().until(ExpectedConditions.elementToBeClickable(password_saucedemo)).sendKeys(sauceDemo_Password);
		longWait.get().until(ExpectedConditions.elementToBeClickable(loginbutton_saucedemo)).click();
		
	}
}
