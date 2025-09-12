package com.day23;

public class browser3 {
	
	//throws and handling exception together.
	
	//amazon app search
	public void search() {
		System.out.println("search method of amazon");
		String s1=cart();
		System.out.println(s1);
	}
	
	public String cart() {
		System.out.println("Cart method of amazon");
		
		try {
			bankpayment();
		}catch(ArithmeticException e) {
			e.printStackTrace();
			System.out.println("arithmetic exception is coming");
		}
		return "tiger";
	}
	
	public void bankpayment() throws ArithmeticException {
		System.out.println("bank payment method");
		int i=9/0;		
	}
	
	public static void main(String[] args) throws ArithmeticException {
		
		browser3 b1=new browser3();
		b1.search();
		System.out.println("byee");
	}

}

//search method of amazon
//Cart method of amazon
//bank payment method
//java.lang.ArithmeticException: / by zero
//	at com.day23.browser3.bankpayment(browser3.java:28)
//	at com.day23.browser3.cart(browser3.java:18)
//	at com.day23.browser3.search(browser3.java:10)
//	at com.day23.browser3.main(browser3.java:34)
//arithmetic exception is coming
//tiger
//byee




