package Steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinations {
	@Given("^I want to write a step with precondition$")
	public void i_want_to_write_a_step_with_precondition() {
		System.out.println("given step1");
	}

	@Given("^some other precondition$")
	public void some_other_precondition() {
		System.out.println("given step2");
	}

	@When("^I complete action$")
	public void i_complete_action() {
		System.out.println("when step1");
	}

	@When("^some other action$")
	public void some_other_action() { 
	System.out.println("when step2");
	
	}

	@When("^yet another action$")
	public void yet_another_action(){ 
		System.out.println("when step1");
	}

	@Then("^I validate the outcomes$")
	public void i_validate_the_outcomes() { 
		System.out.println("when step1");
			
		}
	@Then("^check more outcomes$")
	public void check_more_outcomes(){ 
		System.out.println("when step1");
	}

	@Given("^I want to write a step with name(\\d+)$")
	public void i_want_to_write_a_step_with_name(int arg1){ 
		System.out.println("when step1");
	}

	@When("^I check for the (\\d+) in step$")
	public void i_check_for_the_in_step(int arg1){ 
		System.out.println("when step1");
	}

	@Then("^I verify the success in step$")
	public void i_verify_the_success_in_step(){ 
		System.out.println("when step1");
	}

	@Then("^I verify the Fail in step$")
	public void i_verify_the_Fail_in_step(){ 
		System.out.println("Then step1");
	}
}
