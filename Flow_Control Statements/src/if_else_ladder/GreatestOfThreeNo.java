package if_else_ladder;

public class GreatestOfThreeNo {
	public static void main(String[] args) {
		int a = 90;
		int b = 89;
		int c = 30;
		
		if( a >= b   &&  a >= c) {
			System.out.println("A is the greatest ");
		}
		else if(b >= a &&  b >=c) {
			System.out.println("B is greatest ");
		}
		else {
			System.out.println("C is greatest");
		}
	}

}


//  Dry run 
// value  a= 90 , b = 89 , c = 30
// check the conditions ( a >= b && a > =c) = (90 > 89 && 90 >= 30) = (true && true) = true =  90
// print = A is greatest 

