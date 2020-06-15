package org.devlab.pageclass;

import org.devlab.utility.ReadTestData;
import org.openqa.selenium.By;

public class CommonMethod extends BaseClass {

	public void clickOnlink(String lnkText) {
		driver.findElement(By.linkText(lnkText)).click();

	}

	public void launchApp() {

		
		// if using xml file format for test data
		driver.get(ReadTestData.getTestDataFromXMLFile("Common/AppURL"));
		
		// if using json file format for test data
		//driver.get(ReadTestData.getTestdataFromJson("Common.AppURL"));
	}

}
