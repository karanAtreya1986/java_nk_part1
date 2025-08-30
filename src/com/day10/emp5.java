package com.day10;

public class emp5 {

	//class variable or global variables or template variables.
	String name;
	int age;
	double salary;
	boolean isPermanent;
	char gender;

	public static void main(String[] args) {

		int i=10; //local variable.

		emp5 e1=new emp5();
		e1=null;
		e1.name="karan";
		System.out.println(e1.name);

	}
//We cannot reassign null to any value, we will always get npe.

}

//Exception in thread "main" java.lang.NullPointerException: Cannot assign field "name" because "e1" is null
//at com.day10.emp5.main(emp5.java:18)


