package Class_Object_Program;

public class SumDigit {
	void sum() {
		int n = 1234;
		int total = 0;
		while (n > 0) {
			total = total + 10;
			n = n / 10;

		}
		System.out.println("sum = " + total);
	}

	public static void main(String[] args) {

	}

}
