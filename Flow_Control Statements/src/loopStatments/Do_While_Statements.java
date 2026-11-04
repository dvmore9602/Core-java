package loopStatments;

public class Do_While_Statements {
	public static void main(String[] args) {
		/// syntax
//		do {
//		    // Statements
//		} while (condition);
//
//
//		How does it work?
//		1. First, the do block executes.
//		2. Then the condition is checked.
//		3. If the condition is true, the loop executes again.
//		4. If the condition is false, the loop stops

		/// Level 1: Basic (1–15) / 1. Print numbers from 1 to 10.
//		int i = 1;
//		do {
//			System.out.println(i);
//			i++;
//		}
//		while(i<= 10);

		//// 2. Print numbers from 10 to 1.
//		
//		int i = 10;
//		do {
//			System.out.println(i);
//			i--;
//		}
//		while(i >=1);

		//// 3. Print even numbers from 1 to 100.
//		int i  = 1;
//		do {
//			System.out.println(i);
//			i++;
//		}
//		while(i<= 100);

		//// 4. Print odd numbers from 1 to 100.
//		int i = 1;
//		do {
//			if(i % 2!=0){
//				System.out.println("Odd number " +i);
//				
//			}
//			i++;
//		}
//		while(i<= 100);

		//// 5. Print numbers from 50 to 100.
//		int i = 50;
//		do {
//			System.out.println(i);
//			i++;
//		}
//		while(i<=100);

		//// 6. Print numbers from 100 to 200.
//		
//		int i = 100;
//		do {
//			System.out.println(i);
//			i++;
//		}
//		while(i <= 200);

		//// 7. Print multiples of 5 from 1 to 100.
//		
//		int i = 1;
//		do {
//			
//			System.out.println(i);
//			i+=5;
//			
//		}
//		while(i <=100);

		//// 8. Print multiples of 7 from 1 to 100.
//		int i = 1;
//		do {
//			System.out.println(i);
//			i += 7;
//
//		} while (i <= 100);

		//// 9. Print the multiplication table of 2.
//		
//		int i = 1;
//		do {
//			System.out.println("2 X " + i + " = "+ (2 * i));
//			i++;
//		}
//		while(i<=10);

		//// 10. Print the multiplication table of any number.
//		int i = 1;
//		do {
//			System.out.println("8 x " + i + " = " + (8 * i));
//			i++;
//		}
//		while(i <= 10);

		//// 11. Find the sum of numbers from 1 to 50.
//		int i = 1;
//		int sum = 0;
//		do {
//			sum = sum +i;
//			i++;
//		}
//		while(i <=50);
//		System.out.println(sum);

		//// 12. Find the sum of odd numbers from 1 to 100.
//
//		int i = 1;
//		int sum = 0;
//		do {
//			System.out.println(i);
//			sum = sum + i;
//			i += 2;
//
//		} while (i <= 100);

		//// 13. Find the sum of even numbers from 1 to 100.
//		
//		int i = 1;
//		int sum = 0;
//		do {
//			sum = sum +i;
//			i+=2;
//			
//		}
//		while(i<= 100);
//		System.out.println("sum = " + sum);

		//// 14. Count numbers from 1 to 100.
//		int i = 1;
//		int count = 0;
//		do {
//			count++;
//			i++;
//			
//		}
//		while(i <=100);
//		System.out.println("count = " + count);

		//// 15. Print squares of numbers from 1 to 20.
//		
//		int i = 1;
//		do {
//			System.out.println(i * i);
//			i++;
//		}
//		while(i<= 20);

		//// 15. Print cube of numbers from 1 to 20.
//		
//		int i = 1;
//		do {
//			System.out.println(i * i * i);
//			i++;
//		}
//		while(i <=20);

		//// Level 2: Number Logic (16–30)
		/// 
		/// 
////		16. Find the factorial of a number.
//		int n = 5;
//		int i = 1;
//		int fact = 1;
//
//		do {
//			fact = fact * i;
//			i++;
//
//		} while (i <= n);
//		System.out.println("fact = " + fact);
		
//		int n = 5;
//		int i = 1;
//		int fact = 1;
//
//		do {
//		    fact = fact * i;
//		    i++;
//		} while (i <= n);
//
//		System.out.println("Factorial = " + fact);
		
		

////		17. Find the reverse of a number.
//		
//		int n = 1234;
//		int rev = 0;
//		do {
//			int digit = n  % 10;
//			rev = rev * 10 +digit;
//			n = n / 10;	
//		}
//		while(n >0);
//		System.out.println("reverse " + rev);
		
		
		
		
////		18. Count the digits of a number.
//		 int n = 123456;
//		 int count = 0;
//		 do {
//			 count++;
//			 n = n/10;
//			 
//		 }
//		 while(n >0);
//		 System.out.println("Count number : " + count);
		
		
////		19. Find the sum of digits of a number.
//		   int n = 12345;
//		   int sum = 0;
//		   
//		   do {
//			   int digit = n % 10;
//			   sum = sum + digit;
//			   n = n / 10;
//		   }
//		   while(n>0);
//		   System.out.println("sum = " + sum);
		
		
////		20. Find the product of digits of a number.
//		
//		int n = 1234567;
//		int product = 0;
//		do {
//			int digit = n % 10;
//			product = product + digit;
//			n = n/ 10;
//			
//		}
//		while(n >0);
//		System.out.println("Prosuct :" + product);
		
		
////		21. Check whether a number is palindrome.
//		
//		int n = 121;
//		int original = n;
//		int rev = 0;
//		
//		do {
//			int digit = n % 10;
//			rev = rev  * 10 + digit;
//			n = n/10;	
//		}while(n >0);
//		if(original == rev) {
//			System.out.println("palindrome ");
//		}
//		else {
//			System.out.println("Not palindrome");
//		}
		
//		
////		22. Check whether a number is prime.
//		
//	     int n = 7;
//	      int i = 1;
//	      int count = 0;
//	      do {
//	    	  if(n % i==0) {
//	    		  count++;
//	    		  
//	    	  }
//	    	  i++;
//	      }
//	      while(i <=n);
//	      if(n % 2==0) {
//	    	  System.out.println("Prime number");
//	      }
//	      else {
//	    	  System.out.println("Not prime number");
//	      }
		
		
	
////		23. Print prime numbers from 1 to 100
//		int n = 2;
//
//		do {
//		    int i = 1;
//		    int count = 0;
//
//		    do {
//		        if (n % i == 0) {
//		            count++;
//		        }
//		        i++;
//		    } while (i <= n);
//
//		    if (count == 2) {
//		        System.out.println(n);
//		    }
//
//		    n++;
//
//		} 
//		while (n <= 100);
		
		
////		24. Check whether a number is Armstrong.
//		int n = 153;
//		int tem= n;
//		int sum = 0;
//		do {
//			int digit = n % 10;
//			sum = sum + ( digit * digit * digit);
//			n = n/10;
//		}
//		while(n >0);
//		if( tem == sum) {
//			System.out.println("Armstrong number");
//		}
//		else {
//			System.out.println("Not Armsrong number");
//		
//	}
		
		
////		25. Print Fibonacci series up to 10 terms.
//		
//		int a = 0;
//		int b = 1;
//		int i = 1;
//		do {
//			System.out.println(a+ " ");
//			int c = a +b;
//			a = b;
//					b = c;
//					i++;
//		}
//		while(i <= 10);
		
		
///		26. Find all factors of a number.
//		int n = 12;
//		int i = 1;
//
//		do {
//		    if (n % i == 0) {
//		        System.out.println(i);
//		    }
//		    i++;
//		} while (i <= n);
		
		
//		27. Check whether a number is perfect.
//		28. Check whether a number is strong.
//		29. Find GCD of two numbers.
//		30. Find LCM of two numbers.
//		Level 3: Intermediate (31–40)
//		31. Find the largest digit in a number.
//		32. Find the smallest digit in a number.
//		33. Count even and odd digits in a number.
//		34. Find the sum of squares from 1 to 10.
//		35. Find the sum of cubes from 1 to 10.
//		36. Print numbers from 100 to 1 in reverse.
//		37. Print numbers divisible by both 3 and 5 between 1 and 500.
//		38. Find the first and last digit of a number.
//		39. Find the sum of first and last digits.
//		40. Calculate the power of a number without using Math.pow().
	}

}
