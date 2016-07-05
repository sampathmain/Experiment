package com.apple.stringprograms;

public class ConstructorClass {

	public ConstructorClass() {

	}

	public static void main(String[] args) {
		AnotherClass an=AnotherClass.getInstanceMet();

	}

}

class AnotherClass {
	static AnotherClass a=new AnotherClass();

	private AnotherClass() {
		System.out.println("NewClass");
	}
	public static AnotherClass getInstanceMet() {
		return a;
		
	}

}
