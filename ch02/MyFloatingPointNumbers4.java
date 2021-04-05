public class MyFloatingPointNumbers4 {

	public static void main(String[] args) {

		double y = 1 / 3;  // common mistake

		// You might expect the variable `y` to get the value 
		// `0.333333`, which is a legal floating-point value.
		// But instead it gets the value `0.0`. The expression
		// on the right divides two integers, so Java does
		// integer division, which yields the **int** value `0`.
		// Converted to **double**, the value assigned to `y` is
		// `0.0`.
		System.out.println("y = " + y);


		System.out.println("[Chapter 2.6, Check #5.]");
	}
}
