package com.day18;

public class car2 extends vehicle2 {
	
	int speed =100;
	
	 public void start() {
	        System.out.println("car -- start");
	    }
	 
	 public void start(int a) {
	        System.out.println("car -- start with parameter");
	    }
	 
	 public void applyBreak() {
	        System.out.println("car -- applyBreak");
	    }
	 
	 //static method.
	 public static void billing() {
	        System.out.println("car -- billing");
	    }
	 
	 //private method.
	 private void getCarInfo() {
	        System.out.println("car -- get info");
	    }
	 
	 public final int getdetails(String name) {
		 System.out.println("car ---- get details method");
		 return 98;
	 }


}
