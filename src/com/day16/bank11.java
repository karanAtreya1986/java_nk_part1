package com.day16;

public class bank11 {
	
	//when final has no value assigned.
    private final String name;
    private int age;
    private String adhar;
    private String phone;

    // Constructor.
    //initialise final variable blank here.
    public bank11(int age, String adhar, String phone) {

		this.name = "";
		this.age = age;
      
        if(age>=16) {
	        this.age=age;
        }
        else {
        	this.age=10;
        }
        this.adhar = adhar;
        this.phone = phone;
    }

    //create default constructor to initialise final variable.
	public bank11() {
		this.name = "gorilla";
	}
	
	// Getter
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAdhar() {
        return adhar;
    }

    public String getPhone() {
        return phone;
    }

    //we can write any damn code inside getters and setters.
    public void setAge(int age) {
    	if(age>=16) {
    		this.age=age;
    		System.out.println("hello olders");
    	}
    	else {
    		System.out.println("grow up to 16 years");
    	}
    }

    public void setAdhar(String adhar) {
        this.adhar = adhar;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    
    public static void main(String[] args) {
    	
    	//create object of empty constructor.
		bank11 obj1 = new bank11();
		System.out.println(obj1.getName());
		
		bank11 obj = new bank11(10, "adhar", "phone"); 
		System.out.println(obj.getName()); //blank
		System.out.println(obj.getAge());
		System.out.println(obj.getAdhar());
		System.out.println(obj.getPhone());
	}
}

//gorilla
//
//10
//adhar
//phone

