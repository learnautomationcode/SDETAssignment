package org.devlab.stepdef;

import org.devlab.pageclass.RegistrationPage;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.*;

public class RegistrationStepDef {

	RegistrationPage page;

	public RegistrationStepDef() {
		page = new RegistrationPage();
	}

	@When("I enter {string} into firstname text box")
	public void i_enter_into_firstname_text_box(String frstname) {
		page.enterFirstName(frstname);
	}

	@When("I enter {string} into lastname text box")
	public void i_enter_into_lastname_text_box(String lastname) {
		page.enterLastName(lastname);
	}

	@When("I enter {string} into username text box")
	public void i_enter_into_username_text_box(String username) {
		page.enterUserName(username);
	}

	@When("I enter {string} into password testbox")
	public void i_enter_into_password_testbox(String password) {
		page.enterPassword(password);
	}

	@When("I enter {string} into confirm password text box")
	public void i_enter_into_confirm_password_text_box(String cnfrmpassword) {
		page.enterConfirmPWD(cnfrmpassword);
	}

	@Then("I should land on registration confirmation page")
	public void i_should_land_on_registration_confirmation_page() {
		Assert.assertTrue("failed due to error", page.isLandedOnregConfirmationPage());
	}

	@Then("I should not land on registration confirmation page")
	public void i_should_not_land_on_registration_confirmation_page() {
		Assert.assertFalse(page.isLandedOnregConfirmationPage());
	}
	
	@When("I click on submit button")
	public void i_click_on_submit_button() {
		page.clickOnSubmit();
	}
}
