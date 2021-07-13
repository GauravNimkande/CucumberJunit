package AmazonImplementation;

import java.util.ArrayList;
import java.util.List;

public class Product {
	
private String Productname;
private int price;


public String getProductname() {
	return Productname;
}

public void setProductname(String productname) {
	Productname = productname;
}

public int getPrice() {
	return price;
}

public void setPrice(int price) {
	this.price = price;
}



public Product(String productname, int price) {
	
	this.Productname = productname;
	this.price = price;
}

public List<String> GetProductlist(){
	List<String> ProductList=new ArrayList<>();
	ProductList.add("Apple mackbook Pro");
	ProductList.add("Apple mackbook Air");
	ProductList.add("Apple iphone 12");
	
	return ProductList;
	
	
	
}



}
