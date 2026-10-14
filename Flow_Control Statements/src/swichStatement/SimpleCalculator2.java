package swichStatement;

public class SimpleCalculator2 {
	public static void main(String[] args) {
		int number = 3;
		
		switch(number) {
		case 1:
			System.out.println("Additions");
			break;
		case 2:
			System.out.println("SubStraction");
			break;
		case 3:
			System.out.println("Multiplications");
			break;
		case 4:
			System.out.println("Division");
			break;
			default:
				System.out.println("Invalide ");
		}
	}

}
