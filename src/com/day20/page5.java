package com.day20;

public abstract class page5 {
	
	//class with abstract and non abstract methods.
	
	// Abstract methods
    public abstract void title();       // without return
    public abstract String url();       // with return
    
    // Non-abstract method without return
    public void loading() {
        System.out.println("Page is loading...");
    }
    
    // Non-abstract method with return
    public boolean unloading() {
        System.out.println("Page is unloading...");
        return true;
    }
    
    //create static method without return.
	public static void test() {
		System.out.println("test static without return method");
	}
	
	//create static method with return.
	public static String getstatic(String name) {
		System.out.println("static method with return" + name);
		return "tiger";
	}
	
	//create final method without return.
	public final void getfinal(String name) {
		System.out.println("final method without return" + name);
	}
	
	//create final method with return.
	public final String getfinal1(String name) {
		System.out.println("final method with return" + name);
		return "lion";
	}
	
	//create static final method without return.
	public static final void getstaticfinal(String name) {
		System.out.println("static final method without return" + name);
	}
	
	//create static final method with return.
	public static final String getstaticfinal1(String name) {
		System.out.println("static final method with return" + name);
		return "tiger";
	}
	
	//create default method in abstract with return.
	//Default methods are allowed only in interfaces.
//	default String getdefault(String name) {
//		System.out.println("default method with return" + name);
//		return "tiger";
//	}
//	
//	//create default method in abstract without return.
//	Default methods are allowed only in interfaces.
//	default void getdefault1(String name) {
//		System.out.println("default method without return" + name);
//	}
}
