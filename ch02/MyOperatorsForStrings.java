public class MyOperatorsForStrings {

	public static void main(String[] args) {

		// In general, you cannot perform mathematical operations
		// on strings, even if the strings look like numbers.
		// The following expressions are illegal:

		// "Hello" - 1     "World" / 123     "Hello" * "World"


		// System.out.println("Hello" - 1);

		// ~~~~Compiler message (if executed):
		//
		// MyOperatorsForStrings.java:12: error: bad operand types for binary operator '-'
		//                 System.out.println("Hello" - 1);
		//                                            ^
		//   first type:  String
		//   second type: int
		// 1 error


		// System.out.println("World" / 123);

		// ~~~~Compiler message (if executed):
		//
		// MyOperatorsForStrings.java:24: error: bad operand types for binary operator '/'
		//                 System.out.println("World" / 123);
		//                                            ^
		//   first type:  String
		//   second type: int
		// 1 error


		// System.out.println("Hello" * "World");

		// ~~~~Compiler message (if executed);
		//
		// MyOperatorsForStrings.java:37: error: bad operand types for binary operator '*'
		//                 System.out.println("Hello" * "World");
		//                                            ^
		//   first type:  String
		//   second type: String
		// 1 error


		// System.out.println("Hello, " + "World!");

		// The output is (if executed):
		//
		// Hello, World!


		String name = "Jack";
		System.out.println("Hello, " + name);

		// The output is:
		//
		// Hello, Jack
		//

		System.out.println("\n[Chapter 2.8, Check #1.]");
	}
}
