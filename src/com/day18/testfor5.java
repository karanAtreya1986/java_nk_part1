package com.day18;

public class testfor5 {
	
	public static void main(String[] args) {
		
		//Type mismatch: cannot convert from vehicle5 to bmw5
//		bmw5 b1=new vehicle5();
		
		//after running we get:
		//Exception in thread "main" java.lang.ClassCastException: 
		//class com.day18.vehicle5 cannot be cast to class com.day18.bmw5 
		//(com.day18.vehicle5 and com.day18.bmw5 are in unnamed module of loader 'app')
		//at com.day18.testfor5.main(testfor5.java:11)

		bmw5 b1=(bmw5) new vehicle5();
		System.out.println(b1);
		b1.activateSportMode();
		b1.fuelUp();
		b1.openTrunk();
		b1.start();
		b1.stop();
		
	}

}
