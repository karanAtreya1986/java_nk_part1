package com.day16;

public class employee {
	
	private String name;
	private int age;
	private double salary;
	private boolean isPermanent;
	
	//setter method for name.
	public void setName(String name) {
		this.name=name;
	}
	
	//getter method for name.
	public String getName() {
		return this.name;
	}
	
	//getter for all other variables.
	
	public int getAge() {
		return this.age;
	}
	
	public double getSalary() {
		return salary;
	}
	
	public boolean getIsPermanent() {
		return isPermanent;
	}
	
	//setter method for all other variables.
	
	public void setAge(int age) {
		this.age=age;
	}
	
	public void setSalary(double salary) {
		this.salary=salary;
	}
	
	public void setIsPermanent(boolean isPermanent) {
		this.isPermanent=isPermanent;
	}
	

}
