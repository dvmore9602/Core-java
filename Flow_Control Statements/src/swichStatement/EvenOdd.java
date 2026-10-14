package swichStatement;

public class EvenOdd {
	public static void main(String[] args) {
		int number = 6;
		switch(number % 2 ) {
		case 0:
			System.out.println("Number is Even");
			break;
			default:
				System.out.println("NUmber is Odd");
			
		}
	}

}
