package org.devlab.pageclass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class RegistrationPage extends BaseClass {
	@FindBy(how = How.NAME, name = "firstName")
	private WebElement elmFrstName;

	@FindBy(how = How.NAME, name = "lastName")
	private WebElement elmLastName;

	@FindBy(how = How.NAME, name = "email")
	private WebElement elmUserName;

	@FindBy(how = How.NAME, name = "password")
	private WebElement elmUserPassword;

	@FindBy(how = How.NAME, name = "confirmPassword")
	private WebElement elmUserCnfrmPassword;

	@FindBy(how = How.NAME, name = "register")
	private WebElement elmSbmtBtn;

	public void enterFirstName(String frstName) {
		elmFrstName.sendKeys(frstName);

	}

	public void enterLastName(String lastname) {
		elmLastName.sendKeys(lastname);

	}

	public void enterUserName(String userName) {
		elmUserName.sendKeys(userName);

	}

	public void enterPassword(String password) {
		elmUserPassword.sendKeys(password);

	}

	public void enterConfirmPWD(String password) {
		elmUserCnfrmPassword.sendKeys(password);

	}

	public boolean isLandedOnregConfirmationPage() {
		return driver.getCurrentUrl().contains("create_account_success");
	}

	public void clickOnSubmit() {
		elmSbmtBtn.click();

	}
	
}
