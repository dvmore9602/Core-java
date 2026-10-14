package swichStatement;

public class DepartmentName {
	public static void main(String[] args) {
		int department = 6;
		switch(department) {
		case 1:
			System.out.println("Computer science");
			break;
		case 2:
			System.out.println("Mechnical");
			break;
		case 3:
			System.out.println("Civil");
			break;
		case 4:
			System.out.println("Electronics");
			break;
			default:
				System.out.println("Invalide output");
		}
	}

}
