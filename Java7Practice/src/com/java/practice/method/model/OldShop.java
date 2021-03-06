package com.java.practice.method.model;

public class OldShop {

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
	private OldShop(String str) {
		printInConsole("private.Constructor - " + str);
	}

	/**
	 * DEFAULT @Constructor
	 * 
	 * @Parameterized.Constructor
	 * @param str
	 */
	OldShop(double id) {
		printInConsole("default.Constructor");
		// printInConsole("OldShop defaultConstructor");
	}

	/**
	 * PROTECTED @Constructor
	 * 
	 * @Parameterized.Constructor
	 * @param str
	 */
	protected OldShop(int id) {
		printInConsole("protected.Constructor");
		// printInConsole("OldShop privateConstructor");
	}

	/**
	 * PUBLIC @Constructor
	 */
	public OldShop() {
		printInConsole("public.Constructor");
	}

	public OldShop(Long id) {
		printInConsole("public.Constructor-" + id);
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

	private static void privateStaticOldBathroom() {
		printInConsole("private.static.OldBathroom");
	}

	// ********** N.O.N - S.T.A.T.I.C ***************
	private void privateBathroom() {
		printInConsole("private.Bathroom");
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

	static void defaultStaticOldHall() {
		printInConsole("default.static.OldHall");
	}

	// ********** N.O.N - S.T.A.T.I.C ***************
	void defaultHall() {
		printInConsole("default.Hall()");
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

	protected static void protectedStaticOldReception() {
		printInConsole("proptected.static.OldReception");
	}

	// ********** N.O.N - S.T.A.T.I.C ***************
	protected void protectedReception() {
		printInConsole("proptected.Reception");
	}

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

	public static void publicStaticOldStairCase(int primitive_int) {
		printInConsole("public.static.stairCase(int)." + primitive_int);
	}

	// ********** NON-PRIMITIVE types ***************
	public static void publicStaticStairCase(Integer nonprimitive_Integer) {
		printInConsole("public.static.stairCase(Integer)." + nonprimitive_Integer);
	}

	public static void publicStaticOldStairCase(Integer nonprimitive_Integer) {
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
	// public Long publicStairCase(int primitive_int) throws Exception {
	// printInConsole("public.Long.stairCase(int) throws Exception." +
	// primitive_int);
	// return 0L;
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
		System.out.println("OldShop - " + str);
	}
}
