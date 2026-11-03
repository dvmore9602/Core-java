package decisionMakingStatement;

public class If_else_ladder {
	public static void main(String[] args) {
		
//		
//		// An if-else-if ladder is used when we need to check multiple conditions. Java checks the conditions 
//		// from top to bottom and executes the first block whose condition is true.
//
////  Syntax :
//		//if (condition1) {
////		    // Code 1
//		} else if (condition2) {
////		    // Code 2
//		} else if (condition3) {
////		    // Code 3
//		} else {
////		    // Default code
//		}
//				
//			
//			int number = -2;
//			if(number > 0) {
//				System.out.println("Positive numbers ");
//			}
//			else if(number < 0) {
//				System.out.println("negative number ");
//			}
//			else {
//				System.out.println("Zero");
//	}
		
////		middle no
//		int a = 10;
//		int b = 38;
//		int c = 30;
		
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
//		if (a > b && a > c) {
//			System.out.println("print  is the value of A");
//		}
//		else if ((b > a && b < c) || (b < a && b > c)) {
//			System.out.println("print is the values of B");
//		}
//		else {
//			System.out.println("print is the of C");
//		}
//	}



// Dry run
//  a = 10 , b =38 , c= 30
// check the condition (10 > 38  && 10 > 30 ) = false && false = false
// check the second conditions ( 38 > 10 && 38 < 30) || (38 < 10 && 38 > 30) = (true && false) || (false && true)
//                                                                           = false || false = false 

//  print is the c
		
//        int x = 10;
//
//        if (x > 20) {
//            System.out.println("A");
//        } 
//        else if (x > 5) {
//            System.out.println("B");
//        } 
//        else if (x > 0) {
//            System.out.println("C");
//        } 
//        else {
//            System.out.println("D");
//        }
//    }
//
////Dry run x = 10 
////check the conditions (10 > 20 ) = false
////check the conditions (10 > 5) = true 
////print = B
			
//		
////	1)	Check positive, negative or zero.
//		
//		int n = -10;
//		if(n > 0) {
//			System.out.println("Positive");
//		}
//		else if(n < 0) {
//			System.out.println("Negative");
//		}
//		else {
//			System.out.println("Zero");
//		}
		
		
////	2)	Check even, odd or zero.
//		int n = 20;
//		if(n % 2 ==0) {
//			System.out.println("Even number");
//		}
//		else if(n % 2!=0) {
//			System.out.println("Odd number");
//		}
//		else {
//			System.out.println("Zero");
//		}
		
		
////	3)	Find largest of two numbers or equal.
//		int a = 29;
//		int b = 23;
//		if( a > b) {
//			System.out.println(" A is largest");
//		}
//		else if(b > a) {
//			System.out.println("B is largest");
//		}
//		else {
//		System.out.println("Equal");
//		}
		
		
////	4)	Find smallest of two numbers or equal.
//		int a = 79;
//		int b = 45;
//		if(a < b) {
//			System.out.println("A is smallest");
//		}
//		else if(b < a) {
//			System.out.println("B is smallest");
//		}
//		else {
//			System.out.println("Equal");
//		}
		
		
////	5)	Check voting eligibility: child, eligible or senior citizen.
//		int age = 12;
//		if(age < 18) {
//			System.out.println("not eligible");
//		}
//		else if(age >= 18 && age < 60) {
//			System.out.println("Eligible for voting");
//		}
//		else {
//			System.out.println("Senior citizen");
//		}
		
		
////	6)	Check marks: fail, pass or distinction.
//		int marks = 67;
//		if(marks > 35) {
//			System.out.println("Pass");
//		}
//		else if(marks < 35) {
//			System.out.println("Fails");
//		}
//		else {
//			System.out.println("Distination");
//		}
		
		
		
////	7)	Check number: one-digit, two-digit or three-digit.
//		int n = 123;
//		if(n >= 0 && n < 9) {
//			System.out.println("One digit");
//			
//		}
//		else if(n >= 10 && n <= 99) {
//			System.out.println("Two digit");
//		}
//		else {
//			System.out.println("three digit");
//		}
		
		
////	8)	Check character: uppercase, lowercase or special character.
//		
//		char ch = 'w';
//		if(ch >'a' && ch <='z') {
//			System.out.println("Lower case");
//		}
//		else if(ch > 'A' && ch <= 'Z') {
//			System.out.println("Upper case");
//		}
//		else {
//			System.out.println("spacial charecter");
//		}
		
		
		
////	9)	Check character: vowel, consonant or not alphabet.
//		
//		char ch = 'a';
//		if(ch >='a' || ch >='e' || ch >='i' || ch >= 'o' || ch >= 'u' ) {
//			System.out.println("Vowel");
//		}
//		else if(ch >= 'a' && ch<= 'z') {
//			System.out.println("Consonant");
//		}
//		else {
//			System.out.println("alphabet");
//		}
		
		
////	10)	Check number: divisible by 2, 3 or 5.
//		int n  = 34;
//		if(n % 2 ==0 ) {
//			System.out.println("divisible by 2");
//		}
//		else if( n % 3 == 0) {
//			System.out.println("divisible  by 3");
//		}
//		else if(n % 5 ==0) {
//			System.out.println("divisible by 5");
//		}
//		else {
//			System.out.println("Not divisible ");
//		}
		
//		
////	11)	Check temperature: cold, normal or hot.
//		int temp = 14;
//		if(temp < 15) {
//			System.out.println("cold");
//		}
//		else if(temp <= 30) {
//			System.out.println("normal");
//		}
//		else {
//			System.out.println("hot");
//		}
		
		
////	12)	Check age: child, teenager, adult or senior.
//		int age = 12;
//		if(age < 15) {
//			System.out.println("child");
//		}
//		else if(age <= 30) {
//			System.out.println("teenager");
//		}
//		else if(age <= 50) {
//			System.out.println("adult");
//		}
//		else {
//			System.out.println("senoir");
//		}
		
		
		
		
////	13)	Check number: greater than, less than or equal to 100.
//		
//		int n = 100;
//		if(n < 100) {
//			System.out.println("less than 100");
//		}
//		else if(n > 100) {
//			System.out.println("greater than 100");
//		}
//		else {
//			System.out.println("equal to 100");
//		}
		
		
////	14)	Check day number: 1 to 7.
//		int day = 3;
//		if(day == 1) {
//			System.out.println("monday");
//		}
//		else if( day == 2) {
//			System.out.println("tuesday");
//		}
//		else if( day == 3) {
//			System.out.println("wensaday");
//		}
//		else if( day == 4) {
//			System.out.println("thusday");
//		}
//		else if( day == 5) {
//			System.out.println("friday");
//		}
//		else if(day == 6) {
//			System.out.println("saturday");
//		}
//		else if(day == 7) {
//			System.out.println("Sunday");
//		}
//		else {
//			System.out.println("invalide day");
//		}
		
		
////	15)	Check month number: 1 to 12.
//		int month = 5;
//
//		if(month == 1) {
//		    System.out.println("January");
//		}
//		else if(month == 2) {
//		    System.out.println("February");
//		}
//		else if(month == 3) {
//		    System.out.println("March");
//		}
//		else if(month == 4) {
//		    System.out.println("April");
//		}
//		else if(month == 5) {
//		    System.out.println("May");
//		}
//		else if(month == 6) {
//		    System.out.println("June");
//		}
//		else if(month == 7) {
//		    System.out.println("July");
//		}
//		else if(month == 8) {
//		    System.out.println("August");
//		}
//		else if(month == 9) {
//		    System.out.println("September");
//		}
//		else if(month == 10) {
//		    System.out.println("October");
//		}
//		else if(month == 11) {
//		    System.out.println("November");
//		}
//		else if(month == 12) {
//		    System.out.println("December");
//		}
//		else {
//		    System.out.println("Invalid Month");
//		}
		
		
//		
////	16)	Find largest of three numbers.
//		int a = 12;
//		int b = 45;
//		int c = 43;
//		if(a > b && a > c ) {
//			System.out.println("A is Largest ");
//		}
//		else if(b > a && b > c) {
//			System.out.println("B is largest");
//		}
//		else if( c > a && c > b) {
//			System.out.println("C is largest");
//		}
//		else {
//			System.out.println("invalid ");
//		}
		
		
////	17) Find smallest of three numbers.
//		int a = 10;
//		int b = 20;
//		int c = 30;
//		if(a < b && a < c) {
//			System.out.println("A is smaller");
//		}
//		else if(b < a && b < c) {
//			System.out.println("B is smaller");
//		}
//		else if (c < a && c < a) {
//			System.out.println(" C is smaller");
//		}
//		else {
//			System.out.println("Invalide");
//		}
//		
		
////	18)	Check whether three numbers are equal, two are equal or all different.
//		
//		int a = 10; 
//		int b = 10;
//		int c = 10;
//		if(a == b && b == c) {
//			System.out.println("two number are equal");
//		}
//		else if(a == b || b == c || a == c) {
//			System.out.println("Three number are equal");
//		}
//		else {
//			System.out.println("All different");
//		}
		
//		
////	19)	Find second largest of three numbers.
//		
//		int a = 23;
//		int b = 24;
//		int c = 17;
//		if((a > b && a > c)|| (a < b && a < c)){
//			System.out.println("Second largest number : " + a);
//		}
//		else if((b > a && b > c)|| (b< a && b < c)) {
//			System.out.println("Second largest number : "+ b);
//		}
//		else if(( c > a && c > b ) ||(c < a && c < b)){
//			System.out.println("Second lagest number : " + c);
//			
//		}
//		else {
//			System.out.println("Invalide");
//		}
		
		
////	200	Check leap year or normal year.
//		int year = 2024;
//		if(year % 400 == 0) {
//			System.out.println("Leap year");
//		}
//		else if(year % 100 !=0) {
//			System.out.println("NOt leap year");
//		}
//		else if(year % 4 == 0) {
//			System.out.println("Leap year");
//		}
//		else {
//			System.out.println("Normal year");
//		}
		
		
////	21)	Check triangle: equilateral, isosceles or scalene.
//		int a = 2;
//		int b = 4;
//		int c = 5;
//		if(a == b && b == c) {
//			System.out.println("Equilateral");
//		}
//		else if(a == b || b == c || a == c) {
//			System.out.println("Isosceles");
//		}
//		else {
//			System.out.println("scanlence");
//		}
		
		
////	22)	Check triangle angle: acute, right or obtuse.
//		int angle = 90;
//
//		if(angle <= 0 || angle >= 180) {
//		    System.out.println("Invalid Angle");
//		}
//		else if(angle == 90) {
//		    System.out.println("Right Angle");
//		}
//		else if(angle < 90) {
//		    System.out.println("Acute Angle");
//		}
//		else {
//		    System.out.println("Obtuse Angle");
//		}
		
		
////   23)	Calculate grade: A, B, C, D or Fail.
//		
//		int marks = 85;
//
//		if(marks >= 90 && marks <= 100) {
//		    System.out.println("Grade A");
//		}
//		else if(marks >= 75) {
//		    System.out.println("Grade B");
//		}
//		else if(marks >= 60) {
//		    System.out.println("Grade C");
//		}
//		else if(marks >= 35) {
//		    System.out.println("Grade D");
//		}
//		else if(marks >= 0) {
//		    System.out.println("Fail");
//		}
//		else {
//		    System.out.println("Invalid Marks");
//		}
		
		
////	24)	Calculate electricity bill using slabs.
//		int units = 250;
//		int bill;
//
//		if(units < 0) {
//		    System.out.println("Invalid Units");
//		}
//		else if(units <= 100) {
//		    bill = units * 2;
//		    System.out.println("Bill: " + bill);
//		}
//		else if(units <= 200) {
//		    bill = 100 * 2 + (units - 100) * 3;
//		    System.out.println("Bill: " + bill);
//		}
//		else {
//		    bill = 100 * 2 + 100 * 3 + (units - 200) * 5;
//		    System.out.println("Bill: " + bill);
//		}
		
		
////	25)	Calculate profit, loss or no profit no loss.
//		int cp = 500;
//		int sp = 700;
//
//		if(sp > cp) {
//		    System.out.println("Profit: " + (sp - cp));
//		}
//		else if(cp > sp) {
//		    System.out.println("Loss: " + (cp - sp));
//		}
//		else {
//		    System.out.println("No Profit No Loss");
//		}
		
		
////	26)	Check whether a character is alphabet, digit or special symbol.
//		char ch = '7';
//
//		if((ch >= 'A' && ch <= 'Z') ||
//		   (ch >= 'a' && ch <= 'z')) {
//
//		    System.out.println("Alphabet");
//		}
//		else if(ch >= '0' && ch <= '9') {
//		    System.out.println("Digit");
//		}
//		else {
//		    System.out.println("Special Symbol");
//		}
		
		
		
////	27)	Check whether a number is divisible by both, only one or neither of 3 and 5.
//		int num = 15;
//
//		if(num % 3 == 0 && num % 5 == 0) {
//		    System.out.println("Divisible by Both");
//		}
//		else if(num % 3 == 0 || num % 5 == 0) {
//		    System.out.println("Divisible by Only One");
//		}
//		else {
//		    System.out.println("Not Divisible by Both");
//		}
		
		
////	28	)Calculate discount based on purchase amount.
//		int amount = 6000;
//		double discount;
//
//		if(amount < 0) {
//		    System.out.println("Invalid Amount");
//		}
//		else if(amount > 5000) {
//		    discount = amount * 0.20;
//		    System.out.println("Discount: " + discount);
//		}
//		else if(amount > 2000) {
//		    discount = amount * 0.10;
//		    System.out.println("Discount: " + discount);
//		}
//		else {
//		    System.out.println("No Discount");
//		}
		
////	29)	Check BMI category.
//		double bmi = 23.5;
//
//		if(bmi < 18.5) {
//		    System.out.println("Underweight");
//		}
//		else if(bmi < 25) {
//		    System.out.println("Normal");
//		}
//		else if(bmi < 30) {
//		    System.out.println("Overweight");
//		}
//		else {
//		    System.out.println("Obese");
//		}
		
		
		
////	30	Check number range: 1–50, 51–100, 101–200 or above 200.
//		
//		int num = 150;
//
//		if(num >= 1 && num <= 50) {
//		    System.out.println("Between 1 and 50");
//		}
//		else if(num <= 100 && num > 50) {
//		    System.out.println("Between 51 and 100");
//		}
//		else if(num <= 200 && num > 100) {
//		    System.out.println("Between 101 and 200");
//		}
//		else if(num > 200) {
//		    System.out.println("Above 200");
//		}
//		else {
//		    System.out.println("Invalid Number");
//		}
		
//		No.	Practice program
//		31	Check whether a number is one-digit, two-digit, three-digit or more than three digits.
//		32	Find the middle number among three numbers.
//		33	Find the second smallest among three numbers.
//		34	Check whether a number is divisible by 2, 3, 5 or 7 and identify the first matching divisor.
//		35	Check whether a number is prime, composite or neither.
//		36	Check whether a number is palindrome or not.
//		37	Check whether a number is Armstrong or not.
//		38	Check whether a number is perfect or not.
//		39	Check whether a number is strong or not.
//		40	Check whether a number is Harshad or not.
//		41	Check whether a number is Spy or not.
//		42	Check whether a number is Neon or not.
//		43	Check whether a number is Automorphic or not.
//		44	Check whether a number is a Duck number or not.
//		45	Check whether a number is a special two-digit number or not.
//		46	Check whether a number is a palindrome, even or odd.
//		47	Check whether a student is eligible for scholarship using marks and income.
//		48	Calculate salary grade using basic salary.
//		49	Calculate tax based on annual income.
//		50	Create a simple calculator using if-else-if ladder.
	}

}
