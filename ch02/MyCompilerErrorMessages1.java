public class MyCompilerErrorMessages1 {

	public static void main(String[] args) {
		// generate some simple output
		System.out.println("Hello, World!");


		// Sometimes the compiler reports the place in the program where the error was
		// *detected*, not where it actually occurred. And sometimes the description of the
		// problem is more confusing than helpful.
		//
		// For example, if you forget the closing brace at the end of **main** (line 6), you
		// might get a message like this:
		//
		// File: Hello.java  [line: 7]
		// Error: reached end of file while parsing


		// ~~~~My compiler error message (if executed):
		//
		// MyCompilerErrorMessages1.java:7: error: reached end of file while parsing
		// }
		//  ^
		// 1 error

		System.out.println("\n[Chapter 2.9, Check #2.]");
	}
}
