package clase5.ejemplo;

public class Test {
	static void dispResult(int[] num) {
		try {
			System.out.println(num[0] / (num[0] - num[1]));
		} catch (ArithmeticException ex) {
			System.out.println("First exception "+ex.getMessage());
		}
		System.out.println("Done");
	}

	public static void main(String[] args) {
		try {
			int[] arr = { 100, 100 };
			dispResult(arr);
		} catch (IllegalArgumentException ex) {
			System.out.println("Second exception");
		} catch (Exception ex) {
			System.out.println("Third exception");
		}
	}
}
