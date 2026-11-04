package loopStatments;

public class Nested_ForLoops {
	public static void main(String[] args) {
		/// 1. Print 5 rows and 5 columns of stars
		/// 
		///    * * * * *
//        * * * * *
//        * * * * *
//        * * * * *
//        * * * * *
		///
		/// 
//		for(int i = 1; i<= 5; i++) {
//			for(int j=1 ; j <=5; j++ ) {
//				System.out.print("* ");
//			}
//			System.out.println();
//		}

		///// 2. Print numbers 1 to 5 in 5 rows
		/// 
		/// 
//         1 2 3 4 5
//         1 2 3 4 5
//         1 2 3 4 5
//         1 2 3 4 5
//         1 2 3 4 5

//     for(int i = 1; i<=5; i++) {
//    	 for(int j = 1; j<=5; j++) {
//    		 System.out.print(j);
//    	 }
//    	 System.out.println();
//     }

		//// 3. Print multiplication table from 1 to 5

//		1 2 3 4 5
//		2 4 6 8 10
//		3 6 9 12 15
//		4 8 12 16 20
//		5 10 15 20 25

//		for(int i = 1; i<= 5; i++) {
//			for(int j = 1; j<=5; j++) {
//				System.out.print((i * j) + " ");
//			}
//			System.out.println();
//		}

		/// 4. Print same row number 5 times
//		1 1 1 1 1
//		2 2 2 2 2
//		3 3 3 3 3
//		4 4 4 4 4
//		5 5 5 5 5
//		
//		for(int i = 1; i<=5; i++) {
//			for(int j = 1; j<=5; j++) {
//				System.out.print(i);
//			}
//			System.out.println();
//		}

		//// 5. Print even numbers in 5 rows 2 4 6 8 10
//                 2 4 6 8 10
//                 2 4 6 8 10
//                 2 4 6 8 10
//                 2 4 6 8 10        
//		
//		for(int i = 1; i<=5; i++) {
//			for(int j = 1; j <=5; j++) {
//				System.out.print((j * 2) + " ");
//			}
//			System.out.println();
//		}

//		6. Print odd numbers in 5 rows

		//  1 3 5 7 9 
		//  1 3 5 7 9 
		//  1 3 5 7 9 
		//   1 3 5 7 9 
		//   1 3 5 7 9
//		
//		for(int i = 1; i<=5; i++) {
//			for(int j = 1; j<=5; j++) {
//				System.out.print((j * 2 -1) + " ");
//			}
//			System.out.println();
//		}

		//// 7. Print reverse numbers in each row
//
//		for (int i = 1; i <= 5; i++) {
//
//			for (int j = 5; j >= 1; j--) {
//				System.out.print(j + " ");
//			}
//
//			System.out.println();
//		}

		//// 8. Print square of numbers	
//		1 4 9 16 25
//		1 4 9 16 25
//		1 4 9 16 25
//		1 4 9 16 25
//		1 4 9 16 25	
		
//		for(int i = 1; i<=5; i++) {
//			for(int j=1; j<=5; j++) {
//				System.out.print(j * j + " ");
//			}
//			System.out.println();
//		}

		//// 9. Print numbers divisible by 3 
		
//		3 6 9 12 15 
//		3 6 9 12 15 
//		3 6 9 12 15 
//		3 6 9 12 15 
//		3 6 9 12 15 

		
		
//		for(int i = 1; i<= 5; i++) {
//			for(int j = 1; j<= 5; j++) {
//				System.out.print( (j * 3) + " ");
//			}
//			System.out.println();
//		}

		//// 10. Print row and column values 
// 1 2 3 4 5 
//1 2 3 4 5 
//1 2 3 4 5 
//1 2 3 4 5 
//1 2 3 4 5
//		
//		for(int i = 1; i <= 5; i++) {
//			for(int j = 1; j<= 5; j++) {
//				System.out.print(j + " ");
//				
//			}
//			System.out.println();
//		}

//		What to print	Variable
//		Row number	i
//		Column number	  j
//		Multiplication	  i * j
//		Even numbers	  j * 2
//		Odd numbers	      j * 2 - 1
//		Reverse numbers   j--

//		Level 2: Triangle and Number Patterns (11–20)

		//// 11. Right-angled star triangle 
		/// 
		//  *
		//  * * 
		//  * * * 
		//  * * * * 
		//  * * * * *
//		
//		for(int i = 1; i<= 5; i++) {
//			for(int j = 1; j<=i; j++) {
//				System.out.print("* ");
//				
//			}
//			System.out.println();
//		}
//		

////		12. Inverted star triangle
//		* * * * *
//		* * * *
//		* * *
//		* *
//		*
//
//		for (int i = 5; i >= 1; i--) {
//			for (int j = 1; j <= i; j++) {
//				System.out.print("* ");
//			}
//			System.out.println();
//		}
		
		
////		13. Increasing number triangle
//		1
//		1 2
//		1 2 3
//		1 2 3 4
//		1 2 3 4 5
//		
//		for(int i = 1; i<= 5; i++) {
//			for(int j = 1; j<= i; j++) {
//				System.out.print(j + " ");
//			}
//			System.out.println();
//		}\
		
//		
////		14. Same number triangle
//		1
//		2 2
//		3 3 3
//      4 4 4 4
//		5 5 5 5 5
//		
//		for(int i = 1; i<= 5; i++ ) {
//			for(int j = 1; j<= i; j++) {
//				System.out.print(i + " ");
//			}
//			System.out.println();
//		}
		
////		 15. Continuous number triangle
//		1
//		2 3
//		4 5 6
//		7 8 9 10
//		11 12 13 14 15
//		int num = 1;
//		for(int i = 1; i<= 5; i++) {
//			for(int j = 1; j<=i; j++) {
//				System.out.print(num + " ");
//				num++;
//			}
//			System.out.println();
//		}
		
////		16. Inverted number triangle
//		
//		1 2 3 4 5
//		1 2 3 4
//		1 2 3
//		1 2
//		1
//		for(int i = 5; i>=1; i--) {
//			for(int j =1; j<=i; j++) {
//				System.out.print(j + " ");
//			}
//			System.out.println();
//		}
		
///		17. Reverse number triangle
//		5 
//		4 5 
//		3 4 5 
//		2 3 4 5 
//		1 2 3 4 5
//		
//		for(int i = 5; i>= 1; i--) {
//			for(int j =i ; j<=5; j++){
//				System.out.print(j + " ");
//			}
//			System.out.println();
//		}

		
///		18. Binary triangle
//		1 
//		0 1 
//		1 0 1 
//		0 1 0 1 
//		1 0 1 0 1 
//
//		for(int i = 1; i<= 5; i++) {
//			for(int j = 1; j<=i; j++) {
//				System.out.print((i + j + 1) %2 + " ");
//			}
//			System.out.println();
//		}
		
///		19. Increasing odd number triangle
//		1  
//		1  3  
//		1  3  5  
//		1  3  5  7  
//		1  3  5  7  9
//		
//		for(int i = 1; i<=5; i++) {
//			for(int j = 1; j<=i ; j++) {
//				System.out.print(j * 2-1 + "  ");
//			}
//			System.out.println();
//		}
		
//		20. Increasing even number triangle
		
//		2 
//		2 4 
//		2 4 6 
//		2 4 6 8 
//		2 4 6 8 10
//		for(int i = 1; i<=5; i++) {
//			for(int j =1; j<=i; j++) {
//				System.out.print(j * 2 + " ");
//			}
//			System.out.println();
//		}
		
		
	}

}
