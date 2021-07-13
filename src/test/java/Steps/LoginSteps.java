package Steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
	
	@Given("User is on Application landing page")
	public void user_is_on_application_landing_page() {
	    
	}

	@When("user click on sign in button")
	public void user_click_on_sign_in_button() {
	   
	}

	@Then("User is displayed login screen")
	public void user_is_displayed_login_screen() {
	 
	}

	@When("User enter {string} in username field")
	public void user_enter_in_username_field(String string) {
	 	}

	@When("User enter {string} in Password field")
	public void user_enter_in_password_field(String string) {
	}

	@When("User clicks signIN button")
	public void user_clicks_sign_in_button() {
	}

	@Then("User gets login failed error messages")
	public void user_gets_login_failed_error_messages() {
	}

}
