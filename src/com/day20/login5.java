package com.day20;

public class login5 extends page5 {

	@Override
	public void title() {
		System.out.println("child class login title overridden method");
	}

	@Override
	public String url() {
		System.out.println("child class url overridden method");
		return "gorilla";
	}
	
	@Override
	 public void loading() {
        System.out.println("child Page is loading...");
    }
	
	//override not with static.
	//The method getstatic(String) of type login5 must override 
	//or implement a supertype method
//	@Override
//	public static String getstatic(String name) {
//		System.out.println("static method with return" + name);
//		return "tiger";
//	}
	
	public static String getstatic(String name) {
	System.out.println("static method with return from child" + name);
	return "chimpaanzee";
}
	
//	@Override
//	//cannot use override with final.
//	//Cannot override the final method from page5
//	public final void getfinal(String name) {
//		System.out.println("final method without return" + name);
//	}
	
	//cannot use without annotation also.
	//Cannot override the final method from page5
//	public final void getfinal(String name) {
//		System.out.println("final method without return" + name);
//	}
	
//	@Override
//	//cannot use override.
//	//The method getstaticfinal1(String) of type login5 must override 
//	//or implement a supertype method
//	public static final String getstaticfinal1(String name) {
//		System.out.println("static final method with return" + name);
//		return "tiger";
//	}
	
	//without override also final not allowed.
	//Cannot override the final method from page5
//	public static final String getstaticfinal1(String name) {
//		System.out.println("static final method with return" + name);
//		return "tiger";
//	}

}
