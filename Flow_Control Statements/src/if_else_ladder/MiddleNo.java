package if_else_ladder;

public class MiddleNo {
	public static void main(String[] args) {
		int a = 10;
		int b = 38;
		int c = 30;
		
//		if(a > b && a > c) {
//			System.out.println("Print  is the values of  A ");
//		}
//		else if (b > a && b > c)  {
//			System.out.println("Print is the values of  B");
//		}
//		else {
//			System.out.println("Print the value of C");
//		}
//		
//		
		if (a > b && a > c) {
			System.out.println("print  is the value of A");
		}
		else if ((b > a && b < c) || (b < a && b > c)) {
			System.out.println("print is the values of B");
		}
		else {
			System.out.println("print is the of C");
		}
	}

}

// Dry run
//  a = 10 , b =38 , c= 30
// check the condition (10 > 38  && 10 > 30 ) = false && false = false
// check the second conditions ( 38 > 10 && 38 < 30) || (38 < 10 && 38 > 30) = (true && false) || (false && true)
//                                                                           = false || false = false 

//  print is the c 
