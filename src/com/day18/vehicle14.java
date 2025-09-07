package com.day18;

public class vehicle14 {
	
	String type = "Generic Vehicle";
	
	//create one simple method here.
	public void startengine() {
		System.out.println("vehicle start engine method");
	}
	
	//call one method with different name and call one method from bmw14 and one method from car14.
	public void karanmethod1() {
		bmw14 b1=new bmw14();
		b1.method5();
		car14 c1=new car14();
		c1.karanmethod();
	}

}
