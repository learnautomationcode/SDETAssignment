package org.devlab.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources", glue = {"org.devlab.stepdef","org.devlab.utility"}, plugin = {"pretty","html:target/htmlreport", "json:target/jsonreport/report.json"})
public class TestRunner {

	
	@AfterClass
	public static void reportgenerate() {
		// in case any custom report need to be generated 
	}
}
