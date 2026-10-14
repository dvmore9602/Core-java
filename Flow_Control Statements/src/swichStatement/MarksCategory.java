package swichStatement;

public class MarksCategory {
	public static void main(String[] args) {
		int marks = 78;
		
		switch(marks) {
		case 1:
			System.out.println("Pass");
			break;
		case 2:
			System.out.println("Distinction");
			break;
			default:
				System.out.println("Invalide output");
		
		}
	}

}
