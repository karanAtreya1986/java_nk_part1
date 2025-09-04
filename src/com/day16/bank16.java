package com.day16;

public class bank16 {
	
	//when final has no value assigned.
    private final String name;
    private int age;
    private String adhar;
    private String phone;

    // Constructor.
    //give value to final variable here also.
    //give as parameter also.
    public bank16(String name, int age, String adhar, String phone) {

		this.name = "lion king";
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
	public bank16() {
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
		bank16 obj1 = new bank16();
		System.out.println(obj1.getName());
		String s1=obj1.getName();
		System.out.println(s1);
		
		//cant change final value from object creation step.
		bank16 obj = new bank16("vince macmahon", 10, "adhar", "phone"); 
		System.out.println(obj.getName()); 
		System.out.println(obj.getAge());
		System.out.println(obj.getAdhar());
		System.out.println(obj.getPhone());
	}
}

//gorilla
//gorilla
//lion king
//10
//adhar
//phone





