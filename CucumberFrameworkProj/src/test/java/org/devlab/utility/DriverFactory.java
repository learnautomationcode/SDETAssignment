package org.devlab.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverFactory {
	private static ThreadLocal<WebDriver> driver = new ThreadLocal<WebDriver>();

	public static WebDriver createDriver() throws Exception {
		if (driver.get() != null) {
			return driver.get();
		}

		setDriver(new ChromeDriver());
		return getDriver();

	}

	private static void setDriver(WebDriver inputdriver) {
		driver.set(inputdriver);
	}

	private static WebDriver getDriver() throws Exception {
		if (driver.get() != null) {
			return driver.get();
		}

		throw new Exception("Driver not initialized");
	}

	public static void closeDriver() {
		driver.get().quit();
		setDriver(null);
	}

}
