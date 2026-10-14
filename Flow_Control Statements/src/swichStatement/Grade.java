package swichStatement;

public class Grade {
	public static void main(String[] args) {
		char grade = 'B';
		switch(grade) {
		
		case 'A':
			System.out.println("Excellent");
			break;
		case 'B':
			System.out.println("Average");
			break;
		case 'C':
			System.out.println("Pass");
			break;
		case 'D':
			System.out.println("Fail");
			break;
			default:
				System.out.println("Invalide output");
		}
	}

}
