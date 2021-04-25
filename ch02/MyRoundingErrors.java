public class MyRoundingErrors {

	public static void main(String[] args) {

		// The following two statements should be
		// equivalent:

		System.out.println(0.1 * 10);
		System.out.println(0.1 + 0.1 + 0.1 + 0.1 + 0.1
                		 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1);

		// The output is:
		// 1.0
		// 0.9999999999999999


		System.out.println("\n[Chapter 2.7, Check #1.]");
	}
}
