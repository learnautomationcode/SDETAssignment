package StepDef;

import java.io.File;
import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SeleniumCode {
	public static ChromeDriver driver = new ChromeDriver();

	@Given("I launch the application")
	public void i_launch_the_application() {

		driver.get("http://newtours.demoaut.com/mercurywelcome.php");

	}

	@When("I click on {string} link")
	public void i_click_on_Register_link(String linktxt) {
		driver.findElement(By.linkText(linktxt)).click();
	}

	@When("I click on submit button")
	public void i_click_on_submit_button() {

		driver.findElement(By.name("register")).click();
	}

	@Then("I should land on registration confirmation page")
	public void i_should_land_on_registration_confirmation_page() throws InterruptedException {

		Thread.sleep(2000);
		Assert.assertTrue("Failed to register",
				driver.getCurrentUrl().equalsIgnoreCase("http://newtours.demoaut.com/create_account_success.php"));

//		driver.quit();
	}

	@Then("I should not land on registration confirmation page")
	public void i_should_notland_on_registration_confirmation_page() throws InterruptedException {
		Assert.fail();
//		Thread.sleep(2000);
//		Assert.assertFalse("Failed to register",
//				driver.getCurrentUrl().equalsIgnoreCase("http://newtours.demoaut.com/create_account_success.php"));

//		driver.quit();
	}

	@When("I enter {string} into firstname text box")
	public void i_enter_into_firstname_text_box(String string) {
		driver.findElement(By.name("firstName")).sendKeys(string);
	}

	@When("I enter {string} into lastname text box")
	public void i_enter_into_lastname_text_box(String string) {
		driver.findElement(By.name("lastName")).sendKeys(string);
	}

	@When("I enter {string} into username text box")
	public void i_enter_into_username_text_box(String username) {
		driver.findElement(By.name("email")).sendKeys(username);
	}

	@When("I enter {string} into password testbox")
	public void i_enter_into_password_testbox(String password) {
		driver.findElement(By.name("password")).sendKeys(password);
	}

	@When("I enter {string} into confirm password text box")
	public void i_enter_into_confirm_password_text_box(String password) {
		driver.findElement(By.name("confirmPassword")).sendKeys(password);
	}

	@After("@Seldemo")
	public void afterhookForSel(Scenario scn) throws IOException {
		String str = "Additional Information" + "\n" + "Browser name: Chrome" + "\n" + "Browser name: Chrome" + "\n"
				+ "APP url: http://newtours.demoaut.com/mercurywelcome.php" + "\n" + "App environment: Stage";
//		if (scn.getStatus().toString().equalsIgnoreCase("FAILED")) {
		scn.write(str);

		byte[] varImg = driver.getScreenshotAs(OutputType.BYTES);

		scn.embed(varImg, "image/png", "Screen shot");
//			File img = driver.getScreenshotAs(OutputType.FILE);
//
//			File fle = new File(scn.getName().replace(" ", "_") + ".png");
//
//			Files.copy(img, fle);
//		

	}

}
