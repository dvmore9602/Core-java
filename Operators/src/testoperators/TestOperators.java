package testoperators;

public class TestOperators {
	public static void main(String[] args) {

//	   //Q1
//	   int a = 10;
//	a+=5;  // a = a + 5 = 10 + 5 =15
//	a-=3;  // a = a - 3 = 15 - 3 = 12
//	a*=2;  // a = a * 2 = 12 * 2 = 24
//	a/=4;  //a = a / 4 = 24 / 4 = 6
//	System.out.println(a);

		// Q2

//	   int a = 5, b = 10, c = 15;
//	   System.out.println((a < b) && (b < c));
		//// (5 < 10) && (10 < 15) / true && true = true

//		Q3
//	   System.out.println((a > b) || (b < c)); 
		//// (5>10)||(10<15) / false || true / true

//      Q4
//	   System.out.println(!(a < c));
		/// (5<15) / !(true )= false

//	    Q5
//	   int x = 10, y = 20; 
//	   System.out.println(x++ + ++y);
		//// (10 + 21)= 31

//		Q6
//		int a = 5, b = 2; 
//		System.out.println(a % b); //
		//// 5 % 2 = 1

//		Q7
//		int p = 7, q = 3; 
//		System.out.println(p * q + p / q);
		//// 7* 3 + 7 / 3 = 21 +2 = 23
//		
//	    Q8
//		 int n = 5; 
//		System.out.println(++n + n++); 
		//// 6 + 6 = 12
//		
//		Q9
//		int x = 5, y = 10; 
//		System.out.println(x > y ? x : y);  
		////		 false  

//		 Q10
//		 int a = 10,  b = 5 , c; 
//		 c = a++ + --b + a * b;  
//		 System.out.println(c);
		//// 10 + 4 + 11 * 4 = 14 + 44 = 59

//		Q12
//		 int a = 4, b = 2; 
//		 System.out.println(a << b);// bitwise 
		//// left shift / a = 4 bit 16 8 4 2 1 / 1 0 0 / b = 2 1 0 0 / = 16

//		 Q13
//		 int a = 8, b = 2; 
//		 System.out.println(a >> b); //bitwise operators 
		//// right shift / a = 8 bit 16 8 4 2 1 / 1 0 0 0 / 1 1 0 / ans = 2

//		 Q14
//		 int a = 10; 
//		 System.out.println(~a);
		//// -(n+1) = -(10 + 1) = -(11) = -11

//		Q15
//		 int a = 5, b = 7; 
//		 System.out.println(a & b);
		//// a = 5 8 4 2 1 / 1 0 1 / b=7 1 1 1
//		              
		//// 1 0 1 ( 4 + 1 =5)

//		  
//		 Q16

//		 int a = 5, b = 7; 
//		 System.out.println(a | b);
		//// / a = 5 8 4 2 1 / 1 0 1 / b = 7 1 1 1
//		           
		//// 1 1 1 / 4 + 2 + 1 = 7

//		Q17
//		 int a = 5, b = 7; 
//		 System.out.println(a ^ b);
//		 
		//// a = 5 8 4 2 1 / 1 0 1 / b = 7 1 1 1
//		 
		//// 0 1 0 / 2

//		 int a = 10; 
//		 System.out.println(a++ + ++a + a--);
		//// 10 + 12 + 12 = 34
//		
//		 int a = 1; a += a++ + ++a; 
//		 System.out.println(a);
		//// a = a + 1= 2 / 2 + 3 = 5

//
//		 int a = 5, b = 10;
//		 boolean result = (a < b) ? true : false; 
//		 System.out.println(result);
		////		 true

//		 int a = 5, b = 10; 
//		 System.out.println(a == b);
		////		 false 

//		 int a = 3, b = 2; 
//		 System.out.println(a * b + a / b);
		//// (3 * 2 + 3 / 2) / 6 + 1 = 7

//		 int a = 5; 
//		 a = a++ + ++a; 
//		 System.out.println(a);
		//// 5 + 7 = 12

//		 int a = 10, b = 5; 
//		 System.out.println(a > b && a != b);
		//// true && true = true

//		 int x = 2, y = 3; 
//		 x *= y + 1;
//		 System.out.println(x);
		//// x = 2 + 2 + 3 + 1 = 8

//	
//		 int a = 5;
//		 a += a -= a *= a;
//		 System.out.println(a);
////		 a = a + a - a * a 
////		 5 * 5 = 25 
////		 5+ 5 = 10
////		 10 - 25 = -15
		 
//		 int a = 4, b = 3; 
//		 System.out.println(a > b ? a++ : ++b);
////		 true = 4
/// 
//		 int a = 5;
//		 System.out.println(a++ + a++ + ++a);
////		 5 + 6 + 8 = 19
		 
//		 int a = 2, b = 3;
//		 System.out.println(a + b * a / b);
////		 (2 + 3 * 2 / 3) = 3 * 2 = 6
////		 2 + 6 / 3 = 2 + 2 = 4
//		 
//		 int a = 10, b = 20; 
//		 System.out.println(a < b && b > a);
////		 true && true = true 
		 
//		  int a = 6, b = 2; 
//		  System.out.println((a / b) * (a % b));
////		  (6/2) * (6 % 2) 
////		  3 * 0 = 0
		  
		  int a = 5, b = 10, c = 15;
		  System.out.println((a < b && b > c) || !(b < c));
//		  true && false || false
//		  false|| false  = false
//

	}
}
