package com.day22;

public class application1 {
	
	//builder pattern.
	public application1 login() {
        System.out.println("login to app");
        return this;
    }

    public application1 login(String un, String pwd) {
        System.out.println("login to app with : " + un + " " + pwd);
        return this;
    }

    public application1 search(String productName) {
        System.out.println("searching the product: " + productName);
        return this;
    }

    public application1 search(String productName, int price) {
        System.out.println("searching the product: " + productName + " price: " + price);
        return this;
    }

    public application1 addToCart(String productName) {
        System.out.println("adding to cart: " + productName);
        return this;
    }

    public application1 doPayment(String upi) {
        System.out.println("making payment using upi : " + upi);
        return this;
    }

    public application1 doPayment(String cc, int cvv) {
        System.out.println("making payment using cc : " + cc + " " + cvv);
        return this;
    }

    public application1 generateOrder() {
        System.out.println("your order id is : " + 12345);
        return this;
    }
    
    public application1 logout() {
    	System.out.println("logged out");
    	return this;
    }

}
