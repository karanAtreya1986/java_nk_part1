package com.day23;

public class browser4 {
	
	//remove throws and handle exception.
	
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
	
	public void bankpayment(){
		System.out.println("bank payment method");
		int i=9/0;		
	}
	
	public static void main(String[] args) throws ArithmeticException {
		
		browser4 b1=new browser4();
		b1.search();
		System.out.println("byee");
	}

}

//Exception in thread "main" java.lang.RuntimeException: DATANOTFOUNDEXCEPTION
//at com.day23.browser5.main(browser5.java:14)






