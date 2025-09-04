package com.day16;

public class bank17 {
	
    private String name;
    private int age;
    private String adhar;
    private String phone;

    // Constructor
    public bank17(String name, int age, String adhar, String phone) {
    	
    	this.name=name;
    	
        this.age = age;
        
        //same setter condition can be set in constructor also.
        if(age>=16) {
	        this.age=age;
        }
        else {
        	this.age=10;
        }
        this.adhar = adhar;
        this.phone = phone;
    }

    public bank17() { 
		// TODO Auto-generated constructor stub
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

    // Setter
    public void setName(String name) {
        this.name = name; 
    }

    //we can write any damn code inside getters and setters.
//    public void setAge(int age) {
//    	if(age>=16) {
//    		this.age=age;
//    		System.out.println("hello olders");
//    	}
//    	else {
//    		System.out.println("grow up to 16 years");
//    	}
//    }

    public void setAdhar(String adhar) {
        this.adhar = adhar;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
