package org.devlab.stepdef;

import org.devlab.pageclass.LoginPage;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.*;

public class LoginStepDef {
	LoginPage page;

	public LoginStepDef() {
		page = new LoginPage();
	}

	@When("I enter username {string} on login page")
	public void i_enter_username_on_login_page(String username) {
		page.enterUserName(username);
	}

	@When("I enter password {string} on login page")
	public void i_enter_password_on_login_page(String password) {
		page.enterPassword(password);
	}

	@When("I click on Submit button on login page")
	public void i_click_on_Submit_button_on_login_page() {
		page.clickOnSubmitbtn();
	}

	@Then("I should land on authenticated home page")
	public void i_should_land_on_authenticated_home_page() {
		Assert.assertTrue("Failed to land on home page", page.isOnAuthenticatedHomePage());
	}

	@Then("I should not land on authenticated home page")
	public void i_should_not_land_on_authenticated_home_page() {
		Assert.assertFalse("landed on Authenticated home page", page.isOnAuthenticatedHomePage());
	}

}
