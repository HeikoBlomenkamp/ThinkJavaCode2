public class MyRoundingErrors1 {

	public static void main(String[] args) {

		double balance = 123.45;  // potential rounding error


		// In this example, balances will become inaccurate over
		// time as the variable is used in
		// arithmetic operations like deposits and withdrawals.

		System.out.println(balance * 10);
		System.out.println(balance + balance + balance + balance + balance
				 + balance + balance + balance + balance + balance);

		// The output is:
		// 1234.5
		// 1234.5000000000002

		System.out.println("\n[Chapter 2.7, Check #2.]");
	}
}
