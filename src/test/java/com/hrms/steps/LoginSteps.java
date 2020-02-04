package com.hrms.steps;

import com.hrms.utils.CommonMethods;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class LoginSteps extends CommonMethods {
	@Given("I open browser and navigated to the HRMS")
	public void i_open_browser_and_navigated_to_the_HRMS() {
	   setUp();
	}

	@When("I enter valid username and valid password")
	public void i_enter_valid_username_and_valid_password() {
		sendText(login.username, "Admin");
		sendText(login.password, "Syntax@123");
	}

	@When("I click on login button")
	public void i_click_on_login_button() {
	   click(login.loginBtn);
	}

	@Then("I successfully logged in")
	public void i_successfully_logged_in() {
		// Assert.assertTrue(false);
	}
	
	@When("I enter valid username and invalid password")
	public void i_enter_valid_username_and_invalid_password() {
	 
		sendText(login.username, "Admin");
	    sendText(login.password, "66jhhj");
	}

	@Then("I see error message")
	public void i_see_error_message() {
	   boolean error=login.errorMsg.isDisplayed();
	   Assert.assertTrue("Error message is not displayed", error);
	}
	
	@Then("I close browser")
	public void i_close_browser() {
	    tearDown();
	}
	@When("I enter {string} and {string}")
	public void i_enter_and(String Username, String Password) {
		 //login=new LoginPageElements();
	sendText(login.username,Username);
	sendText(login.password,Password);
//	click(login.loginBtn); its already define in feature file
	}
	@Then("I see {string}")
	public void i_see(String ErrorMessage) {
				String actualErrorMg=login.errorMsg.getText();	
		Assert.assertEquals(ErrorMessage , actualErrorMg);
		
	}
}
