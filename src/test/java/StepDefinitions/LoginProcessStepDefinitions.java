package StepDefinitions;

import java.io.FileNotFoundException;
import java.io.IOException;

import ExtentFactory.DriverExtent;
import PageObjects.AmazonLoginPageObjects;
import PageObjects.GmailLoginPageObjects;
import PageObjects.SauceDemoGithubSecretesPageObjects;
import Utils.ConfigUtil;
import io.cucumber.java.en.Given;

public class LoginProcessStepDefinitions {
	AmazonLoginPageObjects amazonLoginPageObjects_obj;
	GmailLoginPageObjects gmailLoginPageObjects_obj;
	SauceDemoGithubSecretesPageObjects sauceDemoGithubSecretesPageObjects_obj;
	
	public LoginProcessStepDefinitions() {
		 amazonLoginPageObjects_obj = new AmazonLoginPageObjects();
		 gmailLoginPageObjects_obj = new GmailLoginPageObjects();
		 sauceDemoGithubSecretesPageObjects_obj = new SauceDemoGithubSecretesPageObjects();
	}

	@Given("I enter creds in Gmail account page")
	public void i_enter_creds_in_gmail_account_page() {
//		DriverExtent.getInstance().getDriver().get("https://accounts.google.com");
		DriverExtent.getDriver().get("https://accounts.google.com");
	}
		
	@Given("I on amazon enter content to be searched")
	public void i_enter_content_to_be_searched() {
		String env ;
//		DriverExtent.getDriver().get("https://www.amazon.in/");		
		System.out.println("env happens to be "+ System.getProperty("env"));
		
		try {
			env = ConfigUtil.getEnvironment(); //QA3
			DriverExtent.getDriver().get(ConfigUtil.getConfigProperty(env + "_URL"));//QA3_URL
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	@Given("I on spicejet enter destination and start point")
	public void i_on_spicejet_enter_destination_and_start_point() {
//		DriverExtent.getInstance().getDriver().get("https://www.spicejet.com/");
		DriverExtent.getDriver().get("https://www.spicejet.com/");
		String apiKey = System.getenv("API_KEY");
		System.out.println("secret happens to be "+apiKey);
	}
	
	
	@Given("I login into saucedemo page using user credentials from Github secrets")
	public void i_login_into_saucedemo_page_using_user_credentials_from_Github_secrets() {
		String env ;
		try {
			env = ConfigUtil.getEnvironment(); //QA3
			DriverExtent.getDriver().get(ConfigUtil.getConfigProperty(env+"_SAUCEDEMO_URL"));//QA3_URL
			sauceDemoGithubSecretesPageObjects_obj.enterTheCredentialsToLogin();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
