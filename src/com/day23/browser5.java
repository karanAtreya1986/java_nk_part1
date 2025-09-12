package com.day23;

import javax.management.RuntimeErrorException;

public class browser5 {
	
	public static void main(String[] args) {
		
		//custom exception - user defined exception using throw keyword.
		
		String data=null;
		
		if(data==null) {
			throw new RuntimeException("DATANOTFOUNDEXCEPTION");
		}
		
		System.out.println("byee");//Dead code
	}

}

//search method of amazon
//Cart method of amazon
//bank payment method
//java.lang.ArithmeticException: / by zero
//	at com.day23.browser4.bankpayment(browser4.java:28)
//	at com.day23.browser4.cart(browser4.java:18)
//	at com.day23.browser4.search(browser4.java:10)
//	at com.day23.browser4.main(browser4.java:34)
//arithmetic exception is coming
//tiger
//byee





