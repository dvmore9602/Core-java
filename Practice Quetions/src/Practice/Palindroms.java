package Practice;

public class Palindroms {
	public static void main(String[] args) {
		int n = 121;
		int rev = 0;
		int original = rev;
		
		while(n > 0) {
			int digit = n % 10;
			n = n/ 10;
			rev = rev * 10 + digit;
			
		}
		if((original == rev)) {
			System.out.println("Palindrom ");
		}
		else {
			System.out.println("Not a palindrom");
		}
	}

}
