package com.day16;

public class bank18 {
	
    private String name;
    private int age;
    private String adhar;
    private String phone;

    // Constructor
    public bank18(String name, int age, String adhar, String phone) {
    	
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

    public bank18() { 
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

    public void setAdhar(String adhar) {
        this.adhar = adhar;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    
    //actual business logic inside methods.
    
    public void openaccount() {
    	if(this.age<=15) {
    		System.out.println("you cannot open account");
    	}
    	else {
    		System.out.println("you can open account");
    	}
    }
}
