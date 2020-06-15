package org.devlab.pageclass;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage extends BaseClass {

	@FindBy(how = How.NAME, name = "userName")
	private WebElement elmUserName;

	@FindBy(how = How.NAME, name = "password")
	private WebElement elmPassword;

	@FindBy(how = How.NAME, name = "login")
	private WebElement elmBtnSbmt;

	@FindBy(how = How.LINK_TEXT, linkText = "SIGN-OFF")
	private WebElement elmlnkSignOff;

	public void enterUserName(String username) {
		elmUserName.sendKeys(username);
	}

	public void enterPassword(String password) {
		elmPassword.sendKeys(password);
	}

	public void clickOnSubmitbtn() {
		elmBtnSbmt.click();
	}

	public boolean isOnAuthenticatedHomePage() {
		try {
			return elmlnkSignOff.isDisplayed();
		} catch (NoSuchElementException e) {
			return false;
		}
	}

}
