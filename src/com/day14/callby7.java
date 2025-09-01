package com.day14;

public class callby7 {
	
	//complex program increased by one level.
	
	String name;
    int age;

    public void m1(int a) {
        System.out.println(a);
    }	
    
    public static void t1(callby7 p1) {
        p1.m1(20);
        System.out.println(p1.name);
        System.out.println(p1.age);
        
        p1.name="harry";
        p1.age=23434;
    }
    
    //another example of overload in call by reference.
    //just changed the reference name and it is overloaded.
    
    //remember method names cannot be same else we get error.
    //Duplicate method t1(callby7) in type callby7.
    //even for overloaded ones, hence the parameter have to be different.
    public static void t2(callby7 p2) {
    	p2.m1(20);
        System.out.println(p2.name);
        System.out.println(p2.age);
        
        p2.name="sejal";
        p2.age=32423434;
    }

	public static void main(String[] args) {
		callby7 c1=new callby7();
		
		System.out.println("after creating the object");
		System.out.println(c1.name); //null
		System.out.println(c1.age); //0
		
		c1.name="tiger";
		c1.age=10;
		
		callby7.t1(c1); //call by reference.
		
		callby7.t2(c1); //call by reference.
		
		System.out.println("print from main method");
		System.out.println(c1.name);
		System.out.println(c1.age);

	}

}


//after creating the object
//null
//0
//20
//tiger
//10
//20
//harry
//23434
//print from main method
//sejal
//32423434