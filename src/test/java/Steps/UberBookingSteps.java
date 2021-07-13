package Steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UberBookingSteps {
	
	@Given("User want to select a car type {string} from uber app")
	public void user_want_to_select_a_car_type_from_uber_app(String cartype) {
		System.out.println("Step 1 " +cartype);
	    
	}

	@When("User select car as {string} and pick up point {string} and drop location {string}")
	public void user_select_car_as_and_pick_up_point_and_drop_location(String cartype, String pickuppoint, String droplocation) {
		System.out.println("Step 2 "+cartype +"pickup location " +pickuppoint+ "drop location "+droplocation);
	}

	@Then("Driver sarts the journey")
	public void driver_sarts_the_journey() {
		System.out.println("Step 3");
	}

	@Then("Driver ends the journey")
	public void driver_ends_the_journey() {
		System.out.println("Step 4");
	}

	@Then("user pays {int} USD")
	public void user_pays_usd(Integer price) {
		System.out.println("Step 5 "+price);
	}


}
