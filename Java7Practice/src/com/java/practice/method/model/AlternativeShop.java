package com.java.practice.method.model;

/**
 * @purpose *Constructor.*Chaining
 * 
 *          OldShop.NewShop.AlternativeShop
 * 
 *          A Total of THREE Objects are created.
 * 
 * @author pradeep_ramesh
 *
 */
public class AlternativeShop extends NewShop {

	/**
	 * @Description.The reason the constructor doesn't return a value is because
	 *                  it's not called directly by your code, it's called by the
	 *                  memory allocation and object initialization code in the
	 *                  runtime. Its return value (if it actually has one when
	 *                  compiled down to machine code) is opaque to the user -
	 *                  therefore, you can't specify it.
	 */
	public AlternativeShop() {
		System.out.println("AlternativeShop Constructor");
		return;
	}
}
