package com.day17;

public class bmw3 extends car3 {
	
	
	//parent class returns.
	//child class does not return.
	//The return type is incompatible with car3.start().
	//override will not work.
//	@Override
//    public void start() {
//        System.out.println("BMW -- start");
//    }
	
	@Override
    public int start() {
        System.out.println("BMW -- start");
        return 200;
    }
	
	public void autoParking() {
        System.out.println("BMW -- auto parking");
    }

}
