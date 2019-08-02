package com.java.practice.misc;

public class NonStaticBlockMethodTest {
	NonStaticBlockMethodTest ns = new NonStaticBlockMethodTest();

	public NonStaticBlockMethodTest() {
		System.out.println("COnstructor");
	}

	public static void main(String[] args) {
		
		System.out.println("2");
		//ns - static method reference will not be available
	}

	static {
		main(new String[] { "3" });
		//ns.nonstatic("static");
		System.out.println(1);
	}
	{
		nonstatic("non-static");
		ns.nonstatic("non-stat");
	}

	public void nonstatic(String data) {
		System.out.println(data);
	}
}
