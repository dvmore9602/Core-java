package swichStatement;

public class SimpleCalculation {
	public static void main(String[] args) {
		String  calculation = "Additions";
		
		switch(calculation) {
		case "Additions":
			System.out.println("A+B");
			break;
		case "Substraction":
			System.out.println("A - B");
			break;
		case "Multiplication":
			System.out.println("A * B");
			break;
		case "Division":
			System.out.println("A / B");
			break;
		default:
			System.out.println("Invalide");
			
		}
	}

}
