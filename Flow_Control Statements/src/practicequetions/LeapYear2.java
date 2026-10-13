package practicequetions;

public class LeapYear2 {
	public static void main(String[] args) {
		int year = 1996;
		if(year % 400 == 0 || (year % 100 != 0 && year % 4 ==0 )) {
			System.out.println("Leap year");
			if (year % 100 == 0) {
				System.out.println("Century year");
			}else {
				System.out.println();
			}
			
		}
	}

}
