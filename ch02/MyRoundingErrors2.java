public class MyRoundingErrors2 {

	public static void main(String[] args) {

		int balance = 12345;      // total number of cents


		// You can avoid the problem of MyRoundingErrors1 by representing the
		// balance as an integer:

		System.out.println(balance * 10);
		System.out.println(balance + balance + balance + balance + balance
				 + balance + balance + balance + balance + balance);

		// The output is:
		// 123450
		// 123450

		System.out.println("\n[Chapter 2.7, Check #3.]");
	}
}
