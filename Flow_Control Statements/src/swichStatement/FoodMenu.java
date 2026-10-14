package swichStatement;

public class FoodMenu {
	public static void main(String[] args) {
		int menu = 4;
		switch(menu) {
		case 1:
			System.out.println("Pizza");
			break;
		case 2:
			System.out.println("Burgar");
			break;
		case 3:
			System.out.println("Sandwich");
			break;
		case 4:
			System.out.println("Pasta");
			break;
			default:
				System.out.println("Invalide output");
		}
	}

}
