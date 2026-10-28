package ForLoop;

public class PracticsQuetions {

	public static void main(String[] args) {

		//// 1) Print No From 1 to 10
		//
//			for(int i = 1; i<= 10; i++) {
//				System.out.println(i);
//				
//			}

		//// 2) Print No From 20 to 1 in reverse No
//			
//			for(int i = 20; i >=1; i--) {
//				System.out.println(i);
//			}

		//// 3) print No From Odd No 1 to 100

//			for(int i = 1; i <= 100 ; i+=2) {
//				System.out.println("Odd No " + i);
//			}

		//// 4) Print No From Even No 2 to 50
//			
//			for (int i = 2; i <= 50; i += 2) {
//				System.out.println( "Even No " + i);
//			}

		//// 5) Print No From Rverse no 100 to 1
//			
//			for(int i = 100; i >=1 ; i--) {
//				System.out.println( "Reverse no " +i);
//			}

		//// 6) Print Multiple of 5 from 1 to 100.
//			
//			for(int i = 1; i <= 100; i+=5) {
//				System.out.println(i);
//			}

		//// 7) Print the Multiplications tables of 7
//			int number =  7;
//			for(int i = 1; i<=10; i ++) {
//				System.out.println(number  + " X "   +  i +  " =  " + (number * i)) ; 
//			}

		//// 8) Find the sum of number from 1 to 10
//			int sum = 0;
//			for(int i = 1; i <= 10; i++) {
//				sum = sum + i;
//				System.out.println("Sum of number = " + sum);
//			}

		//// 9) find the sum of even number from 1 to 50
//			int sum = 0;
//			for(int i =1; i<=50 ; i+=2) {
//				sum += i;
//				System.out.println("Sum Of Even Number " + sum);
//			}

		//// 10) find the sum of odd number From 1 to 50
//			int sum = 0;
//			for(int i=1; i<= 50; i+=2) {
//				sum += i;
//				System.out.println(i);
//			}

		//// 11) print the square of number From 1 to 10.
		/// 
//			for(int i = 1; i <= 10; i++) {
//				int square = i * i;
//				System.out.println("Square of " + i + " = " + square);
//			}

		//// 12) print the cube of numnber from 1 to 10.
//			
//			for(int i = 1; i<=10; i++) {
//				int cube = i * i * i;
//				System.out.println("Cube of " + i + " = " + cube);
//			}

		//// 13) count how many number from 1 to 100 are divisble by 3.
//			for (int i = 1 ; i<=100 ; i++) {
//				int divisibleby3 = i * 3;
//				System.out.println("Divisible by 3 " + i+ " = " + divisibleby3);
//			}

		//// 14) Print the number from 1 to 50 that are divisible by 3 and 5
//			
//			for (int i = 1; i<= 50; i++) {
//				if(i%3 == 0 && i % 5 ==0) {
//					System.out.println(i);
//				}

		//// 15) Find the factorial number
//			
//			int number = 5;
//			long factorial = 1;
//			for(int i= 1; i<=number ; i++) {
//				factorial *= i;
//				System.out.println("Factorial number of " + number + "= " + factorial);
//				
//			}

		//// 16) Count the digit in given positive interger.
		/// 
//			int number = 46732;
//			int count = 0;
//			if (number == 0) {
//				count = 1;
//			} else {
//				for (int i = number; i > 0; i /= 10) {
//					count++;
		//
//				}
		//
//			}
//			System.out.println("count the number " + number + " is " + count);

//			
		//// 16) Calculate the sum of digit of given number .
//			
//			int number = 34563;
//			int originalNumber = number;
//			
//			int sum = 0;
//		for(int i = number ; i >0; i/=10) {
//			int digit = i % 10;
//			sum += digit ;
//			
//		}
//		System.out.println("sum of the digit " + originalNumber + " is " + sum);

		//// 17) print the digit of a number in reverse order.
		/// 
//			int number = 45892;
//			int originalNumber = number;
		//
//			System.out.print("The digits of " + originalNumber + " in reverse order: ");
		//
//			if (number == 0) {
//				System.out.print(0);
//			} else {
		//
//				for (int temp = number; temp > 0; temp /= 10) {
//					int digit = temp % 10;
//					System.out.print(digit + " ");
//				}
//			}

//			
		////		18)
//			for(int i = 1; i<=10; i +=3) {
//				System.out.println(i);
//			}

		////			19)
//			for(int i = 10; i>= 1; i-=3) {
//				System.out.println(i);
//			}

		////		20)
//		  for(int i = 0; i < 5; i++) {
//			  System.out.println(i++);
//		  }

//			
		////		 21)
//			for(int i = 0; i<= 5; i++) {
//				System.out.println("Java");
//			}

		////			22)
//			for(int i= 0; i<=5; i++) {
//				System.out.println(i);
//				i++;
//			}
//			

		////			23)
//			for(int i = 5; i >= 1; i--) {
//				System.out.println(i);
//				--i;
//			}

		////			24)
//			for(int i = 1; i<= 10; i*= 2) {
//				System.out.println(i);
//			}

		//// 25) 1 to 20 number even odd numbers
//			 for (int i = 1; i <= 20; i++) {
//		            if (i % 2 == 0) {
//		                System.out.println(i + " is Even");
//		            } else {
//		                System.out.println(i + " is Odd");
//		            }
//		        }
////			26) print the number is 1 to 100 and divisible by  3 and 5.
//		for (int i = 2; i <= 100; i++) {
//			boolean prime = true;
//
//			for (int j = 2; j <= i; j++) {
//				if (i % j == 0) {
//					prime = false;
//					break;
//
//				}
//				if (prime) {
//					System.out.println(i);
//				}
//			}
		
//		}
//		27)
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
