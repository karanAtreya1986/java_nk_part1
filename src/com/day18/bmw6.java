package com.day18;

//Syntax error on token(s), misplaced construct(s)
//public class bmw6 extends car6, truck6{

public class bmw6 extends car6{
	
	@Override
    public void start() {
		System.out.println("====method from car class====");
        System.out.println("BMW is starting with push-button and advanced system...");
        System.out.println("====method from car class====");
    }

    @Override
    public void fuelUp() {
    	System.out.println("====method from vehicle class====");
        System.out.println("BMW requires premium fuel.");
        System.out.println("====method from vehicle class====");
    }

    public void activateSportMode() {
        System.out.println("BMW is now in Sport Mode!");
    }
    
    //how to call sibling class methods and variables.
    public void callsibling() {
    	truck6 t1=new truck6();
    	int v1= t1.truck;
    	System.out.println(v1);
    	t1.loadCargo();
    	t1.loadCargo("karan");
    }

}
