package StepDefinitions;

import ExtentFactory.DriverExtent;
import PageObjects.AmazonLoginPageObjects;
import PageObjects.GmailLoginPageObjects;
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
//		DriverExtent.getInstance().getDriver().get("https://www.amazon.in/");
		DriverExtent.getDriver().get("https://www.amazon.in/");
	}
	
	
	
	@Given("I on spicejet enter destination and start point")
	public void i_on_spicejet_enter_destination_and_start_point() {
//		DriverExtent.getInstance().getDriver().get("https://www.spicejet.com/");
		DriverExtent.getDriver().get("https://www.spicejet.com/");
	}

	
	


	
	
}
