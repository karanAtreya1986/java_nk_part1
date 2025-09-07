package com.day18;

public class bmw2 extends car2{
	
	@Override
	 public void start() {
	        System.out.println("bmw -- start");
	    }
	 
	@Override
	 public void start(int a) {
	        System.out.println("bmw -- start with parameter");
	    }
	
	public void autoparking() {
		System.out.println("bmw auto parking");
	}
	
	@Override
	public void applyBreak() {
        System.out.println("bmw -- applyBreak");
    }
	
	public void getspeedfrombmw() {
		System.out.println("bmw only method");
	}
	
	public int getnamefrombmw(String name) {
		System.out.println("bmw only method");
		return 878;
	}
	
	public static int getcarlocation(String name) {
		System.out.println("bmw static method car location");
		return 78;
	}

}
