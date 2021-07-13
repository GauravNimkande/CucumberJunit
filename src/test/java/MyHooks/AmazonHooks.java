package MyHooks;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;

public class AmazonHooks {
	
	@Before("@Smoke")
	public void setup() {
		System.out.println("Launch the Amazon Application");
	}
	
	/*
	 * @Before(order=2) public void setupURL() {
	 * System.out.println("Enter Amazon URL"); }
	 */

	@After("@Smoke")
	public void close() {
		System.out.println("Close the browser");
	}
	
	
}
