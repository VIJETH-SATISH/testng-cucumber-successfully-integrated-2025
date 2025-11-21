package StepDefinitions;

import PageObjects.AmazonLoginPageObjects;
import PageObjects.GmailLoginPageObjects;
import PageObjects.SpiceJetLoginPageObject;
import io.cucumber.java.en.Given;

public class SerachPageStepDefinitions {

	AmazonLoginPageObjects amazonLoginPageObjects_obj;
	GmailLoginPageObjects gmailLoginPageObjects_obj;
	SpiceJetLoginPageObject spiceJetLoginPageObject_obj;
	
	public SerachPageStepDefinitions() {
		 amazonLoginPageObjects_obj = new AmazonLoginPageObjects();
		 gmailLoginPageObjects_obj = new GmailLoginPageObjects();
		 spiceJetLoginPageObject_obj= new SpiceJetLoginPageObject();
		 
	}
	
	@Given("I click on next and enter password")
	public void i_click_on_next_and_enter_password() {		
		try {
			gmailLoginPageObjects_obj.enterEmail();
			Thread.sleep(2000);
			gmailLoginPageObjects_obj.clickNextBtn();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Given("clicked on the needed item")
	public void clicked_on_the_needed_item() {
		try {
			amazonLoginPageObjects_obj.enterSearchItem();
			Thread.sleep(15000);
			amazonLoginPageObjects_obj.clickSearchItem();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Given("I select the Date of travel")
	public void I_on_spicejet_enter_destination_and_start_point() throws InterruptedException {
		spiceJetLoginPageObject_obj.enterStartPoint();
		Thread.sleep(1000);
		spiceJetLoginPageObject_obj.enterToPoint();
		Thread.sleep(1000);
		spiceJetLoginPageObject_obj.enterStartDate();
		Thread.sleep(1000);
		spiceJetLoginPageObject_obj.clickSerachFlight();
		spiceJetLoginPageObject_obj.clickUpgradeButton();
	}
	
	

}
