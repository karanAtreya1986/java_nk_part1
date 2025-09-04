package com.day16;

public class bank8 {
	
	//when final has no value assigned.
    private final String name;
    private int age;
    private String adhar;
    private String phone;

    // Constructor.
   
    public bank8(String name, int age, String adhar, String phone) {
        this.name = "stone cold";
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
		
		bank8 obj = new bank8(getna, "adhar", "phone"); //we cannot use getname method directly.
		//first we need to create the object then only can access.
		System.out.println(obj.getName());
		System.out.println(obj.getAge());
		System.out.println(obj.getAdhar());
		System.out.println(obj.getPhone());
	}
}

//gorilla
//20
//adhar
//phone

