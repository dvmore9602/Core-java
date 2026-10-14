package swichStatement;

public class TrafficSignal {
	public static void main(String[] args) {
		String signal = "Red";
		
		switch(signal) {
		case "Red":
			System.out.println("Stop...!");
			break;
		case "Yellow":
			System.out.println("Ready to go ...!");
			break;
		case "Green":
			System.out.println("Go..!");
			break;
			default:
				System.out.println("Invalide output");
			
		}
	}

}
