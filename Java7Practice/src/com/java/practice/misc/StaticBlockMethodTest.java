package com.java.practice.misc;

public class StaticBlockMethodTest {

	static int a = 5;
	static {
		System.out.println("1");
		main(new String[] { "Ashish" });
		System.out.println("3");
	}
	static {
		System.out.println("4");
	}

	public static void main(String[] args) {
		System.out.println(a);
		System.out.println("2");
	}
}
