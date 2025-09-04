package com.day16;

public class Login1 {
	
	private String username;
	private String password;

	
	public String getUsername() {
		return username;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
public static void main(String[] args) {
	Login1 l1=new Login1();
	l1.setUsername("admin");
	l1.setPassword("admin@##$23213");
	String s1=l1.getPassword();
	String s2=l1.getUsername();
	
	System.out.println(s1);
	System.out.println(s2);
}

}

//admin@##$23213
//admin

