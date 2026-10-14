package swichStatement;

public class Arithmatics {
	public static void main(String[] args) {
		char sign = '+';
		switch(sign) {
		case '-','+','*','/':
			System.out.println("Arithmatics operator");
		break;
		default:
			System.out.println("Invalide output");
		}
	}

}
