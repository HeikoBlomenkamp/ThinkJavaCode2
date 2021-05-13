public class MyOperatorsForStrings1 {

	public static void main(String[] args) {

		// Since addition is defined for both numbers and strings,
		// Java performs automatic conversions you may not expect:


		System.out.println(1 + 2 + "Hello");
		// the output is 3Hello

		System.out.println("Hello" + 1 + 2);
		// the output is Hello12

		// Java executes these operations from left to right.
		// In the first line, `1 + 2` is `3` , and
		// `3 + "Hello"` is `"3Hello"` . But in the second line,
		// `"Hello" + 1` is `"Hello1"` , and
		// `"Hello1" + 2` is `"Hello12"` .


		System.out.println("\n[Chapter 2.8, Check #2.]");
	}
}
