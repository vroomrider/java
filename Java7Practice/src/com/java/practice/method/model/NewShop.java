package com.java.practice.method.model;

public class NewShop extends OldShop {

	/**
	 ********************************************************************************************************
	 * C.O.N.S.T.R.U.C.T.O.R Methods
	 ********************************************************************************************************
	 */

	/**
	 * PRIVATE @Constructor
	 * 
	 * @Parameterized.Constructor
	 * @param str
	 */
	private NewShop(String str) {
		printInConsole("private.Constructor(String)." + str);
	}

	/**
	 * DEFAULT @Constructor
	 * 
	 * @Parameterized.Constructor
	 * @param str
	 */
	NewShop(double id) {
		printInConsole("default.Constructor(double)." + id);
		// printInConsole("OldShop defaultConstructor");
	}

	/**
	 * PROTECTED @Constructor
	 * 
	 * @Parameterized.Constructor
	 * @param str
	 */
	protected NewShop(int id) {
		printInConsole("protected.Constructor(int)." + id);
		// printInConsole("OldShop privateConstructor");
	}

	/**
	 * PUBLIC @Constructor
	 */
	public NewShop() {
		printInConsole("public.Constructor");
	}

	public NewShop(Long id) {
		printInConsole("public.Constructor(Long)." + id);
	}

	/**
	 ********************************************************************************************************
	 * PRIVATE Methods
	 ********************************************************************************************************
	 */
	// ****************** S.T.A.T.I.C ***************
	private static void privateStaticBathroom() {
		printInConsole("private.static.Bathroom");
	}

	// ********** N.O.N - S.T.A.T.I.C ***************
	private void privateBathroom() {
		printInConsole("private.Bathroom");
	}

	private void privateAdditionalBathRoom() {
		/**
		 * New Infrastructure in NewShop
		 */
		printInConsole("private.AdditionalBathroom");
	}

	/**
	 ********************************************************************************************************
	 * DEFAULT Methods
	 ********************************************************************************************************
	 */
	// ****************** S.T.A.T.I.C ***************
	static void defaultStaticHall() {
		printInConsole("default.static.Hall");
	}

	// ********** N.O.N - S.T.A.T.I.C ***************
	void defaultHall() {
		printInConsole("default.Hall()");
	}

	void defaultAdditionalHall() {
		printInConsole("default.AdditionalHall()");
	}

	/**
	 ********************************************************************************************************
	 * PROTECTED Methods
	 ********************************************************************************************************
	 */
	// ****************** S.T.A.T.I.C ***************
	protected static void protectedStaticReception() {
		printInConsole("proptected.static.Reception");
	}

	// ********** N.O.N - S.T.A.T.I.C ***************
	protected void protectedReception() {
		printInConsole("proptected.Reception");
	}

	protected void protectedAdditionalReception() {
		printInConsole("proptected.AdditionalReception");
	}

	// @see *specifiers* Method.Visibility is *Default, Actual should be *Protected
	// void protectedReception() {
	// printInConsole("proptected.Reception");
	// }

	/**
	 ********************************************************************************************************
	 * PUBLIC Methods
	 ********************************************************************************************************
	 */
	// ********** N.O.N - S.T.A.T.I.C ***************
	public void publicStairCase() {
		printInConsole("public.stairCase");
		// defaultBathroom();
	}

	// ********** PRIMITIVE t y p e s ***************
	public void publicStairCase(boolean primitive_boolean) {
		printInConsole("public.stairCase(boolean)." + primitive_boolean);
	}

	public void publicStairCase(byte primitive_byte) {
		printInConsole("public.stairCase(byte)." + primitive_byte);
	}

	public void publicStairCase(char primitive_char) {
		printInConsole("public.stairCase(char)." + primitive_char);
	}

	public void publicStairCase(short primitive_short) {
		printInConsole("public.stairCase(short)." + primitive_short);
	}

	public void publicStairCase(int primitive_int) {
		printInConsole("public.stairCase(int)." + primitive_int);
	}

	public void publicStairCase(long primitive_long) {
		printInConsole("public.stairCase(long)." + primitive_long);
	}

	public void publicStairCase(float primitive_float) {
		printInConsole("public.stairCase(float)." + primitive_float);
	}

	public void publicStairCase(double primitive_double) {
		printInConsole("public.stairCase(double)." + primitive_double);
	}

	// ********** NON-PRIMITIVE types ***************
	public void publicStairCase(Boolean nonprimitive_Boolean) {
		printInConsole("public.stairCase(Boolean)." + nonprimitive_Boolean);
	}

	public void publicStairCase(Byte nonprimitive_Byte) {
		printInConsole("public.stairCase(Byte)." + nonprimitive_Byte);
	}

	public void publicStairCase(Character nonprimitive_Character) {
		printInConsole("public.stairCase(Character)." + nonprimitive_Character);
	}

	public void publicStairCase(Short nonprimitive_Short) {
		printInConsole("public.stairCase(Short)." + nonprimitive_Short);
	}

	public void publicStairCase(Integer nonprimitive_Integer) {
		printInConsole("public.stairCase(Integer)." + nonprimitive_Integer);
	}

	public void publicStairCase(Long nonprimitive_Long) {
		printInConsole("public.stairCase(Long)." + nonprimitive_Long);
	}

	public void publicStairCase(Float nonprimitive_Float) {
		printInConsole("public.stairCase(Float)." + nonprimitive_Float);
	}

	public void publicStairCase(Double nonprimitive_Double) {
		printInConsole("public.stairCase(Double)." + nonprimitive_Double);
	}

	// *********** Exceptional Case ***********
	public void publicStairCase(Object nonprimitive_Object) {
		printInConsole("public.stairCase(Object)." + nonprimitive_Object);
	}

	// ****************** S.T.A.T.I.C ***************
	// ********** PRIMITIVE t y p e s ***************
	public static void publicStaticStairCase(int primitive_int) {
		printInConsole("public.static.stairCase(int)." + primitive_int);
	}

	// ********** NON-PRIMITIVE types ***************
	public static void publicStaticStairCase(Integer nonprimitive_Integer) {
		printInConsole("public.static.stairCase(Integer)." + nonprimitive_Integer);
	}

	/**
	 ********************************************************************************************************
	 * PUBLIC Methods throws EXCEPTION
	 ********************************************************************************************************
	 */
	// ********** N.O.N - S.T.A.T.I.C ***************
	/**
	 * @NonStatic.Method throws Exception*
	 * @param int
	 *            input
	 * @return Long value
	 * @throws Exception
	 */
	// Scenario.1.ReturnType.ShouldBeSame
	// public Long publicStairCase(int primitive_int) {
	// printInConsole("public.Long.stairCase(int) throws Exception." +
	// primitive_int);
	// return 0L;
	// }

	// Scenario.2.If.throwsException.isAvailable.in.SuperClass.then.Subclass.it.is.not.mandatory
	// public void publicStairCase(int primitive_int) throws Exception {
	// printInConsole("public.stairCase(int)." + primitive_int);
	// }

	/**
	 * @NonStatic.Method throws Exception*
	 * @param Integer
	 *            input
	 * @return Long value
	 * @throws Exception
	 * 
	 * @Check The method will be OverRided with exceptions or without Exceptions
	 * @see OverLoading even with Exception
	 */
	// public Long stairCase(Integer data) {
	// printInConsole("String Integer OverLoaded");
	// return 0L;
	// }

	// public Long publicStairCase(Integer nonprimitive_Integer) throws Exception {
	// printInConsole("public.Long.stairCase(Interger) throws Exception." +
	// nonprimitive_Integer);
	// return 0L;
	// }

	// ****************** S.T.A.T.I.C ***************
	/**
	 * @NonStatic.Method throws Exception*
	 * @param int
	 *            input
	 * @return Long value
	 * @throws Exception
	 */
	// public static Long publicStairCase(int primitive_int) throws Exception {
	// printInConsole("public.Long.stairCase(int) throws Exception." +
	// primitive_int);
	// return 0L;
	// }

	/**
	 ********************************************************************************************************
	 * PRIVATE Methods throws EXCEPTION
	 ********************************************************************************************************
	 */
	/**
	 * @Printing.Logs.In.Console
	 * @param str
	 */
	private static void printInConsole(String str) {
		System.out.println("NewShop - " + str);
	}
	// /**
	// ********************************************************************************************************
	// ********************************************************************************************************
	// * PRIVATE Methods
	// ********************************************************************************************************
	// ********************************************************************************************************
	// * Executing N.O.N - S.T.A.T.I.C Methods
	// ********************************************************************************************************
	// */
	// /**
	// * PRIVATE @NonStatic.Method
	// *
	// * @return
	// * @throws Exception
	// */
	// private void noStairCase(int id) throws Exception {
	// printInConsole("NewShop publicNoStairCase-" + id);
	// }
	//
	// /**
	// * DEFAULT @NonStatic.Method
	// *
	// * @param int
	// * input
	// * @return Long value
	// * @throws Exception
	// */
	// Long publicStairCase(int data) throws Exception {
	// printInConsole("NewShop publicLongPublicStairCase");
	// return 0L;
	// }
	//
	// // /**
	// // * PROTECTED @NonStatic.Method
	// // *
	// // * @return
	// // */
	// // protected void publicStairCase() {
	// // // printInConsole("OldShop publicStairCase()");
	// // printInConsole("NewShop publicStairCase");
	// // defaultBathroom();
	// // }
	//
	// // public static void items() {
	// // printInConsole("NewShop items()");
	// // }
	//
	// // public void doors() {
	// // printInConsole("NewShop doors()");
	// // }
	//
	// /**
	// ********************************************************************************************************
	// ********************************************************************************************************
	// * PRIVATE Methods
	// ********************************************************************************************************
	// ********************************************************************************************************
	// * Executing N.O.N - S.T.A.T.I.C Methods
	// ********************************************************************************************************
	// */
	// private void privateBathroom() {
	// printInConsole("NewShop privateBathroom()");
	// }
	//
	// /**
	// ********************************************************************************************************
	// * Executing S.T.A.T.I.C Methods
	// ********************************************************************************************************
	// *
	// */
	// private static void staticPrivateBathroom() {
	// printInConsole("NewShop StaticPrivateBathroom");
	// }
	//
	// /**
	// ********************************************************************************************************
	// ********************************************************************************************************
	// * DEFAULT Methods
	// ********************************************************************************************************
	// ********************************************************************************************************
	// * Executing N.O.N - S.T.A.T.I.C Methods
	// ********************************************************************************************************
	// */
	// void defaultBathroom() {
	// printInConsole("NewShop privateDefaultBathroom()");
	// }
	//
	// /**
	// ********************************************************************************************************
	// * Executing S.T.A.T.I.C Methods
	// ********************************************************************************************************
	// *
	// */
	// static void staticDefaultBathroom() {
	// printInConsole("NewShop staticDefaultBathroom");
	// }
	//
	// /**
	// ********************************************************************************************************
	// ********************************************************************************************************
	// * PUBLIC Methods
	// ********************************************************************************************************
	// ********************************************************************************************************
	// * Executing N.O.N - S.T.A.T.I.C Methods
	// ********************************************************************************************************
	// */
	// /**
	// * @NonStatic.Method
	// * @return
	// */
	// public void publicStairCase() {
	// // printInConsole("OldShop publicStairCase()");
	// printInConsole("NewShop publicStairCase()");
	// defaultBathroom();
	// }
	//
	// /**
	// * @NonStatic.Method
	// * @param Integer
	// * input
	// * @return
	// */
	// // public void publicStairCase(Integer intVal) {
	// // printInConsole("OldShop publicStairCase()");
	// // }
	//
	// /**
	// * @NonStatic.Method
	// * @param String
	// * input
	// * @return String value
	// */
	// public String stairCase(String data) {
	// printInConsole("String OverLoaded");
	// return data;
	// }
	//
	// /**
	// * @NonStatic.Method
	// * @param Long
	// * input
	// * @return String value
	// */
	// public String stairCase(Long data) {
	// printInConsole("String OverLoaded");
	// return "";
	// }
	//
	// /**
	// * @NonStatic.Method
	// * @param Integer
	// * input
	// * @return Long value
	// * @throws Exception
	// */
	// public Long stairCase(Integer data) throws Exception {
	// printInConsole("String Integer OverLoaded");
	// return 0L;
	// }
	//
	// /**
	// * @NonStatic.Method
	// * @param int
	// * input
	// * @return Long value
	// * @throws Exception
	// */
	// public Long stairCase(int data) throws Exception {
	// printInConsole("String int OverLoaded");
	// return 0L;
	// }
	//
	// /**
	// * @NonStatic.Method
	// * @return
	// * @throws Exception
	// */
	// public void noStairCase() throws Exception {
	// printInConsole("OldShop noStairCase()");
	// }
	//
	// /**
	// * @NonStatic.Method
	// * @return
	// * @param String
	// * input
	// */
	// public void noStairCase(String reason) {
	// printInConsole("OldShop noStairCase(str) - MethodOverLoading");
	// }
	//
	// /**
	// * @NonStatic.Method
	// * @return
	// */
	// public void doors() {
	// printInConsole("OldShop doors()");
	// }
	//
	// /**
	// ********************************************************************************************************
	// * Executing S.T.A.T.I.C Methods
	// ********************************************************************************************************
	// */
	//
	// public static void items() {
	// printInConsole("OldShop items()");
	// }
	//
	// /**
	// ********************************************************************************************************
	// ********************************************************************************************************
	// * PROTECTED Methods
	// ********************************************************************************************************
	// ********************************************************************************************************
	// * Executing N.O.N - S.T.A.T.I.C Methods
	// ********************************************************************************************************
	// */
	// protected void protectedBathroom() {
	// printInConsole("OldShop privateBathroom()");
	// }
	//
	// /**
	// * @Printing.Logs.In.Console
	// * @param str
	// */
	// public static void printInConsole(String str) {
	// printInConsole("NewShop - " + str);
	// }
}
