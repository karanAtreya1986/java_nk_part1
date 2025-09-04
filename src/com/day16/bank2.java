package com.day16;

public class bank2 {
	
	//create final variable but dont give value.
    private final String name;
    private int age;
    private String adhar;
    private String phone;

    // Constructor
    public bank2(String name, int age, String adhar, String phone) {
        this.name = name; //The final field bank2.name cannot be assigned
        this.age = age;
        this.adhar = adhar;
        this.phone = phone;
    }

    public bank2() { //The blank final field name may not have been initialized
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
