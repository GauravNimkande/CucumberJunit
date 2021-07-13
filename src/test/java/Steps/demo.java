package Steps;

import org.junit.Assert;

import AmazonImplementation.Product;
import AmazonImplementation.Search;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class demo {
	Product product;
	Search search;
		@Given("I have a search field on Amazon page")
	public void i_have_a_search_field_on_amazon_page() {
			System.out.println("Step 1 : i am on search page");
	}
	@When("I search for a product with name {string} and price {int}")
	public void i_search_for_a_product_with_name_and_price(String productname, Integer price) {
		System.out.println("Step 2: Search the product with name : "+productname+" and Price :"+price);
		product=new Product(productname, price);
	}
	@Then("Product with name {string} Should be dispalyed")
	public void product_with_name_should_be_dispalyed(String productnamee) {
		System.out.println("Step 3: Search the product name is  : "+productnamee);
		
		search=new Search();
		String name=search.displayproductname(product);
		Assert.assertEquals(product.getProductname(),name);	
		}




}
