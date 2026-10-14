package swichStatement;

public class MonthNumber {
 public static void main(String[] args) {
	
	 int month = 3;
	 switch(month) {
	 case 12,1,2:
		 System.out.println("Winter");
	 break;
	 case 3,4,5:
		 System.out.println("Summer");
	 break;
	 case 6,7,8:
		 System.out.println("Monsoon");
	 break;
	 default:
		 System.out.println("Inavlide Output");
	 }
}
}
