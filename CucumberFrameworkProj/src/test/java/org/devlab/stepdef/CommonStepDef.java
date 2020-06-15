package org.devlab.stepdef;

import org.devlab.pageclass.CommonMethod;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class CommonStepDef {
  CommonMethod commonmethod;
	public CommonStepDef() {
		commonmethod=new CommonMethod();
	}
	
	@Given("I launch the application")
	public void i_launch_the_application() {
		commonmethod.launchApp();
	}

	@When("I click on {string} link")
	public void i_click_on_link(String string) {
		commonmethod.clickOnlink(string);
	}
	
	
}
