package Class_Object_Program;

public class PerfectNumber {
	void check() {
		int num = 18;
		int sum = 0;
		for (int i = 1; i < num; i++) {
			if (num % i == 0) {
				sum = sum + i;
			}
		}
		if (sum == num) {
			System.out.println("perfetc number");

		} else {
			System.out.println("Not perfect number");
		}

	}

}
