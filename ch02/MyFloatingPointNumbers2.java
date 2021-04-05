public class MyFloatingPointNumbers2 {

	public static void main(String[] args) {

		// The following is illegal because the variable on the left
		// is an **int** and the value on the right is a **double**:

		/*
		int x = 1.1;  // compiler error
		*/

		// Compiler message (if executed):
		//
		// MyFloatingPointNumbers2.java:8: error: incompatible types:
		// possible lossy conversion from double to int
		// int x = 1.1;  // compiler error
		//         ^
		// 1 error
		// error: compilation failed


		System.out.println("[Chapter 2.6, Check #3.]");
	}
}
