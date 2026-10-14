package swichStatement;

public class ATMoptions {
	public static void main(String[] args) {
		int atm = 3;
		switch (atm) {
		case 1:
			System.out.println("Check balence");
			break;
		case 2:
			System.out.println("Withdraw");
			break;
		case 3:
			System.out.println("Deposite");
			break;
		case 4:
			System.out.println("Exit");
			break;
			default:
				System.out.println("Invalide Output");
				
		}
	}

}
