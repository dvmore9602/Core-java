 package Encapsulations;

public class ProductStock {
	private int productId;
	private String productName;
	private double price;
	private  int quantity;
	
	
	void setproductId(int id) {
		productId = id;
		
	}
	public int getproductId() {
		return productId;
	}
	void setproductName(String name) {
		productName  = name;
	}
	public String getproductName() {
		return productName;
	}
	void setprice(double p) {
		if(price > 0) {
			
		price = p;
		}else {
			System.out.println("Invalide price");
		}
	}
	public double getprice() {
		return price;
	}
	void setquantity(int q) {
		if(quantity > 0) {
		quantity = q;
		}
		else {
			System.out.println("Invalide quantity");
		}
	}
	public int getquantity() {
		return quantity;
	}

}
