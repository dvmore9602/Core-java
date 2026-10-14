package swichStatement;

public class MobileSetting {
	public static void main(String[] args) {
		int mobile = 3;
		switch(mobile) {
		case 1:
			System.out.println("Wi-Fi");
			break;
		case 2:
			System.out.println("Bluetooth");
			break;
		case 3:
			System.out.println("Airoplan mod");
			break;
		case 4:
			System.out.println("Charecter type");
			break;
			default:
				System.out.println("Invalide Output");
		}
	}

}
