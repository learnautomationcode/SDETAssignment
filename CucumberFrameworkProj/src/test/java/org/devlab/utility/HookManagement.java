package org.devlab.utility;

import org.devlab.pageclass.BaseClass;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;

public class HookManagement extends BaseClass {

	@After
	public void afterhookmethod(Scenario scn) {

		// code to embed screen shot to cucumber report
		byte[] varImg = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
		scn.embed(varImg, "image/png", "Screen shot");

		// quit instance of driver
		DriverFactory.closeDriver();

	}

}
