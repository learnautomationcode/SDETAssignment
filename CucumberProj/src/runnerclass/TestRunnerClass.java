package runnerclass;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(monochrome = true, strict = true, features = "src/feature", glue = { "StepDef" }, plugin = { "pretty",
		"html:target/htmlreport", "json:target/jsonreport/report.json" },tags = {"@Seldemo"})
public class TestRunnerClass {

}
