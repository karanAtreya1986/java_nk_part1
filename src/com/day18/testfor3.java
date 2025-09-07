package com.day18;

public class testfor3 {
	
	public static void main(String[] args) {
			
//			bmw3 b3=new car3();//Type mismatch: cannot convert from car3 to bmw3
			
			bmw3 b4=(bmw3) new car3();
			
			//after running we get this exception:
//Exception in thread "main" java.lang.ClassCastException: class 
			//com.day18.car3 cannot be cast to class com.day18.bmw3 
			//(com.day18.car3 and com.day18.bmw3 are in unnamed module of loader 'app')
//			at com.day18.testfor3.main(testfor3.java:9)
		}
	

}
