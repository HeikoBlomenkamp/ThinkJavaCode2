public class MyAssigningVariables1 {

	public static void main(String[] args) {

		String message;


		// A common source of confusion is that some strings *look*
		// like integers, but they are not.

		message = "123";        // legal
		// message = 123;       // not legal


		// Compiler message for an uncommented "not legal" line of code:
		//
		// MyAssigningVariables1.java:12: error: incompatible types:
		// int cannot be converted to String
		// message = 123;       // not legal
		//           ^
		// 1 error
		// error: compilation failed

		System.out.println("Chapter 2.2, Check #2.");
	}
}
