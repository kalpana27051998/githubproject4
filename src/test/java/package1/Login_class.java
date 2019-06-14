package package1;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Login_class {
	@Given("I want to enter username")
	public void i_want_to_enter_username() {
	    System.out.println("kalpana");
	}

	@Given("I want to enter password")
	public void i_want_to_enter_password() {
		System.out.println("kalp1234");   
	}

	@When("I click login button")
	public void i_click_login_button() {
		System.out.println("clicked the login button");    
	}

	@Then("loged in successfully")
	public void loged_in_successfully() {
		System.out.println("logged in successfully");   
	}

}
