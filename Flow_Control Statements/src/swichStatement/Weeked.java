package swichStatement;

public class Weeked {
	public static void main(String[] args) {
		int week = 3;
		switch(week) {
		case 1,2, 3,4,5:
			System.out.println("Weekdays");
		break;
		case 6,7:
			System.out.println("Weekend");
		break;
		default:
			System.out.println("Invalid");
		}
	}

}
