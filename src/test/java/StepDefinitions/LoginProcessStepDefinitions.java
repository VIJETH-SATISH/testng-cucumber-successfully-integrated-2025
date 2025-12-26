package StepDefinitions;

import java.io.FileNotFoundException;
import java.io.IOException;

import ExtentFactory.DriverExtent;
import PageObjects.AmazonLoginPageObjects;
import PageObjects.GmailLoginPageObjects;
import Utils.ConfigUtil;
import io.cucumber.java.en.Given;

public class LoginProcessStepDefinitions {
	AmazonLoginPageObjects amazonLoginPageObjects_obj;
	GmailLoginPageObjects gmailLoginPageObjects_obj;
	
	public LoginProcessStepDefinitions() {
		 amazonLoginPageObjects_obj = new AmazonLoginPageObjects();
		 gmailLoginPageObjects_obj = new GmailLoginPageObjects();
	}

	@Given("I enter creds in Gmail account page")
	public void i_enter_creds_in_gmail_account_page() {
//		DriverExtent.getInstance().getDriver().get("https://accounts.google.com");
		DriverExtent.getDriver().get("https://accounts.google.com");
	}
		
	@Given("I on amazon enter content to be searched")
	public void i_enter_content_to_be_searched() {
		String env ;
//		DriverExtent.getInstance().getDriver().get("https://www.amazon.in/");
//		DriverExtent.getDriver().get("https://www.amazon.in/");	
		System.out.println("env happens to be "+ System.getProperty("env"));
		System.out.println("QA3 property happens to be "+ System.getProperty("QA3"));
		System.out.println("Environment happens to be "+ System.getProperty("ENVIRONMENT"));
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

	
	


	
	
}
