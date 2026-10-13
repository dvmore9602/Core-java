package practicequetions;

public class Temperature2 {
	public static void main(String[] args) {
		int temperature = 34;
		if(temperature >=35 ) {
			System.out.println("Temperature is the Hot");
		}
		else if (temperature >=25 && temperature <=34) {
			System.out.println("Temperature is Warm");
		}
		else if(temperature >= 15 && temperature <= 24) {
			System.out.println("Temperature is Cool");
		}
		else {
			System.out.println("Temperature is Cold");
		}
	}

}
