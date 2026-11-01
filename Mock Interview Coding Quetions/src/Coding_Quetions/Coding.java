package Coding_Quetions;

public class Coding {

	public static void main(String[] args) {
//		Mock 1

		//// 1) print the number of 1 to 200 print even and odd number using for loop
//		
//		for(int i = 1; i <= 200; i++) {
//			if(i % 2 == 0) {
//				System.out.println("the number is Even " + i);
//			}
//			else {
//				System.out.println("the number is odd");
//			}
//		
//		}

//		using while loop
		int i = 1;
		while (i <= 200) {
			i++;
			if (i % 2 == 0) {
				System.out.println("number is Even " + i);
			}
			else {
				System.out.println("number is odd");
			}
		}
	}
}
