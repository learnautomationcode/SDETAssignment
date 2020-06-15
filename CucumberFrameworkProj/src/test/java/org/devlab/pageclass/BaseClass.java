package org.devlab.pageclass;

import java.util.concurrent.TimeUnit;

import org.devlab.utility.DriverFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import org.junit.*;

public class BaseClass {
	public  WebDriver driver = null;

	public BaseClass() {
		try {
			if (driver == null) {
				driver = DriverFactory.createDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
				PageFactory.initElements(driver, this);
			}
		} catch (Exception e) {
			Assert.fail("Exception occured while inializing the driver" + e.toString());
		}
	}
}
