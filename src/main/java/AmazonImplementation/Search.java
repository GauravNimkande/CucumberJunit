package AmazonImplementation;

public class Search {
	
	public String displayproductname(Product product) {
		if (product.GetProductlist().contains(product.getProductname())) {
			return product.getProductname();
		}
		return null;
		
	}

}
