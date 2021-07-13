package Steps;

import java.util.List;
import java.util.Map;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UserRegistration {
	
	@Given("User is on registration page")
	public void user_is_on_registration_page() {
		System.out.println("User naviget to registration page");
	   
	}

	@When("user enter following user details")
	public void user_enter_following_user_details(DataTable dataTable) {
	  
		/*
		 * List<List<String>> userlist = dataTable.asList(String.class);
		 * 
		 * for(List<String> e : userlist) { System.out.println(e); }
		 */
	}
	
	@When("user enter following user details with column")
	public void user_enter_following_user_details_with_column(DataTable dataTable) {
	  
		List<Map<String, String>> UserList=dataTable.asMaps(String.class, String.class);
		
		System.out.println(UserList);
		System.out.println(UserList.get(0).get("Name"));
		
		
		
	}

	@Then("User registration should be sucessful")
	public void user_registration_should_be_sucessful() {
		System.out.println("User naviget to registration page");	   
	}


}
