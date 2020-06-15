package StepDef;

import java.util.List;

import org.junit.Assert;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

//import org.junit.*;

public class Stepdef {

	public static int a, b, c;

	@Given("this is given statement")
	public void this_is_given_statement() {

		System.out.println(" i m in given statement");
		// Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
	}

	@When("this is when statement")
	public void this_is_when_statement() {
		// Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();

		System.out.println(" i m in when statement");
	}

	@Then("this is the validation statement")
	public void this_is_the_validation_statement() {
		// Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
		System.out.println(" i m in then statement");
	}

	@Given("I have two number {int} and {int}")
	public void i_have_two_number_and(Integer int1, Integer int2) {
		a = int1;
		b = int2;
	}

	@When("I add those two number")
	public void i_add_those_two_number() {
		c = a + b;
	}

	@Then("I should get the value as {int}")
	public void i_should_get_the_value_as(Integer int1) {
		Assert.assertTrue(c == int1);
	}

	@When("I multiply those two number")
	public void i_multiply_those_two_number() {
		c = a * b;
	}

	@Given("I multiply the number from below table")
	public void i_multiply_the_number_from_below_table(List<List<Integer>> dataTable) {
		// Write code here that turns the phrase above into concrete actions
		// For automatic transformation, change DataTable to one of
		// E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
		// Map<K, List<V>>. E,K,V must be a String, Integer, Float,
		// Double, Byte, Short, Long, BigInteger or BigDecimal.
		//
		// For other transformations you can register a DataTableType.

		for (int row = 0; row < dataTable.size(); row++) {

			for (int clmn = 0; clmn < dataTable.get(row).size(); clmn++) {

				System.out.println("row " + row + " column" + clmn + "   :  " + dataTable.get(row).get(clmn));

			}
		}

	}

	@Before("not @add")
	public void beforehookmethod() {

		System.out.println("I am in before hook");

	}

	@After("not @add")
	public void afterhookmethod() {
		System.out.println("I am in after hook");
	}

	
	
	
	
	
	
}
