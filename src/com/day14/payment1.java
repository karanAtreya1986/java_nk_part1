package com.day14;

public class payment1 {
	
	public void payment(String upiid) {
		if((upiid).equalsIgnoreCase("card")){
			System.out.println("use your cc");
		}
		else {
			System.out.println("use your upi");
		}
	}
	
	public static void payment(String upiid,int amount) {
		if((upiid).equalsIgnoreCase("card")){
			System.out.println("use your cc");
		}
		else if ((upiid).equalsIgnoreCase("cash")) {
			System.out.println("pay by cash");
		}
	}

	public static void main(String[] args) {
		payment1 p1=new payment1();
		payment1.payment("cash", 3234);

	}

}

//pay by cash

