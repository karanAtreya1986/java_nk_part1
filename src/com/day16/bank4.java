package com.day16;

public class bank4 {
	
    private final String name="gorilla";
    private int age;
    private String adhar;
    private String phone;

    // Constructor
    public bank4(int age, String adhar, String phone) {
        this.age = age;
        
        //same setter condition can be set in constructor also.
        //sysout doesnt come in constructor.
        //constructor only for initialising and setting values not returning anything.
        //because constructor doesnt have return type.
        if(age>=16) {
	        this.age=age;
	        sysout.println("hello olders");
        }
        else {
        	sysout.println("grow up to 16 years");
        }
        this.adhar = adhar;
        this.phone = phone;
    }

    public bank4() { 
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
        this.name = name; //The final field bank2.name cannot be assigned
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
}
