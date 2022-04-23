package com.edu3;

class DemoStatic{
	static int i; 
	int j; 
	static String college_name;
	static {
		college_name="KIOT";
	}
	
	DemoStatic(){
		System.out.println("constructor");
	}
	
	static void myMethod() {
		System.out.println("College name="+college_name);
	}
}
public class StaticMethod {
   
	public static void main(String[] args) {
		System.out.println("Sri Vidhya");
		
		
		DemoStatic.myMethod();//way to access static method
	}

}