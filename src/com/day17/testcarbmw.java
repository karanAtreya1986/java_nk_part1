package com.day17;

public class testcarbmw {
	
//	When you create reference of child class and object of child class, 
//	and the same method exist in parent and child class, 
//	then child class method is given preference.
	
	public static void main(String[] args) {
		
		bmw b1=new bmw();
		b1.start();
		b1.stop();
		b1.autoParking();
		b1.refuel();
	}

}

//BMW -- start
//car -- stop
//BMW -- auto parking
//car -- refuel
