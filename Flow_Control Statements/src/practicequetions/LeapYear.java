package practicequetions;

public class LeapYear {
	public static void main(String[] args) {
		
		int year = 2025;
		if(year % 400 ==0  || (year % 100 !=0 && year % 4 == 0 )) {
			System.out.println("This is theleap year");
			
		}
		else {
			System.out.println("this is not leap years");
		}
	}

}
