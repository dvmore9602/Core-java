package Class_Object_Program;

public class Palindrome {
	void check() {
		int n = 121;
		int original = n;
		int rev = 0;

		while (n > 0) {
			int digit = n % 10;
			rev = rev * 10 + digit;
			n = n / 10;

		}
		if (original == rev) {
			System.out.println("palindrome no ");

		} else {
			System.out.println("Not palindrome no");
		}

	}
}
