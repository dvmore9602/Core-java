package decisionMakingStatement;

import java.util.Scanner;

public class Nested_if_else_Statement {

	// A nested if-else statement means placing an if-else statement inside another
	// if or else block.
	// It is used when a program needs to make a decision based on multiple levels
	// of conditions.

	//// Syntax :
	/// 
//	if (condition1) {
//	    if (condition2) {
	//// If both conditions are true
//	    } else {
	//// Outer true, inner false
//	    }
//	} else {
	//// Outer condition is false
	// }

	public static void main(String[] args) {

		////		1)loging

//		int age = 20;
//		boolean voterId = true;
//
//		if (age >= 18) {
//			if (voterId) {
//				System.out.println("Eligible to vote");
//			} else {
//				System.out.println("Voter ID required");
//			}
//		} else {
//			System.out.println("Not eligible to vote");
//		}

//        String username = "admin";
//        String password = "1234";
//
//        if (username.equals("admin")) {
//            if (password.equals("1234")) {
//                System.out.println("Login Successful");
//            } else {
//                System.out.println("Wrong Password");
//            }
//        } else {
//            System.out.println("Wrong Username");
//        }

		//// 2)number cheking

//		int number = 10;
//
//		if (number > 0) { // true
//			if (number % 2 == 0) { // true
//				System.out.println("pisitive Even");
//			} else {
//				System.out.println("positive odd");
//			}
//		} else {
//			if (number == 0) {
//				System.out.println("zero");
//			} else {
//				System.out.println("Negative Number");
//			}
		//// } Level 1: Basic Programs (1–15) / 1. Check whether a number is positive or
		/// negative. If positive, check whether it is even or odd. using the
		/// Scanner class
		/// 
		/// 
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enetr the number : ");
//		int n = sc.nextInt();
//		if (n > 0) {
//			if (n % 2 == 0) {
//				System.out.println("Positive Even");
//			} else {
//				System.out.println("Positive Odd");
//			}
//
//		} else {
//			if (n < 0) {
//				if (n % 2 == 0) {
//					System.out.println("Negative Even");
//				} else {
//					System.out.println("Negative Odd");
//				}
//			} else {
//				System.out.println("Zero");
//			}
//		}

		//// 2. Check whether a person is eligible to vote. If eligible, check whether
		/// the person is eligible for a senior citizen benefit (age 60+).
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enetr the Age : ");
//		int age = sc.nextInt();
//		
//		if(age >= 18) {
//			System.out.println("Eligible for voting");
//			
//		
//		if(age <= 60) {
//			System.out.println("Senior citizen");
//		}
//		else {
//			System.out.println("Not senior citizen");
//		}
//	}
//		else {
//			System.out.println("NOt eligible");
//		}

		//// 3. Check whether a number is divisible by 5. If yes, check whether it is
		/// divisible by 10.
//
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the number : ");
//		int n = sc.nextInt();
//
//		if (n % 5 == 0) {
//			if (n % 10 == 0) {
//				System.out.println("Number is divisible by 5 and 10");
//			} else {
//				System.out.println("Number is divisible by 5");
//			}
//		} else {
//			System.out.println("number is not divisible y 5");
//
//		}

		//// 4. Find the largest of two numbers. If both are equal, print equal.
//
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the numbe A :");
//		int a = sc.nextInt();
//		System.out.println("Enter the number B : ");
//		int b = sc.nextInt();
//
//		if (a > b) {
//			System.out.println("A is largest ");
//		} else {
//
//			if (b > a) {
//				System.out.println("B is the largest");
//			} else {
//				System.out.println("Both are equal");
//
//			}
//		}

		//// 5. Check whether a number is zero or non-zero. If non-zero, check whether
		/// it is positive or negative.
//		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Emter the Number : ");
//		int n = sc.nextInt();
//		if(n == 0) {
//			System.out.println("Zero");
//			
//		}
//		else {
//			if(n>0) {
//				System.out.println("Positive");
//			}
//			else {
//				System.out.println("Negative");
//			}
//		}

		//// 6. Check whether a student has passed or failed. If passed, check whether
		/// the student got distinction (75+).
//		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the marks :");
//		int marks= sc.nextInt();
//		if(marks >= 35) {
//			System.out.println("Pass");
//		}
//		else {
//			if(marks <= 75) {
//				System.out.println("Distination");
//			}
//			else {
//				System.out.println("not distinations");
//			}
//		}
//	else {
//		System.out.println("Fail");
//	}
//		

		//// 7. Check whether a character is an alphabet. If yes, check whether it is a
		/// vowel or consonant.
//
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the charecter : ");
//		char ch = sc.next().charAt(0);
//		if ((ch >= 'A' && ch >= 'Z') || (ch >= 'a' && ch >= 'z')) {
//			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
//					|| ch == 'o' || ch == 'U') {
//				System.out.println("Vowel");
//			} else {
//				System.out.println("Consonant");
//			}
//
//		} else {
//			System.out.println("alphabet");
//		}

		//// 8. Check whether a number is divisible by 3. If yes, check whether it is
		/// also divisible by 7.
//		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the number : ");
//		int n = sc.nextInt();
//		
//		if(n % 3== 0) {
//			if(n % 7 ==0) {
//				System.out.println("Divisible both 3 and 7 ");
//			}
//			else {
//				System.out.println("Divisible by 3");
//			}
//			
//		}
//		else {
//			System.out.println("Not divisible ");
//		}

		//// 9. Check whether a person is a minor or adult. If adult, check whether they
		/// are eligible for driving (18+).
//
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the age : ");
//		int age = sc.nextInt();
//
//		if (age >= 18) {
//			System.out.println("Adult");
//
//			if (age <= 18) {
//				System.out.println("Eligible for driving linsence");
//			} else {
//				System.out.println("not Eligible ");
//			}
//		} else {
//			System.out.println("Minor");
//
//		}

////		10. Check whether a year is a leap year. If yes, check whether it is divisible by 400.
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the year : ");
//		int year = sc.nextInt();
//
//		if (year % 4 == 0) {
//			if (year % 100 != 0) {
//				if (year % 400 == 0) {
//					System.out.println("Leap year");
//				}
//
//				else {
//					System.out.println("Not leap year");
//				}
//
//			} else {
//				System.out.println("leap year");
//			}
//		} else {
//			System.out.println("Not leap year");
//		}
		
		
////		11. Find the largest of three numbers using nested if-else.
//		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("Enter the number A : ");
//		int a = sc.nextInt();
//		System.out.print("Enter the number B :");
//		int b = sc.nextInt();
//		System.out.print("Enter the number C :");
//		int c = sc.nextInt();
//		
//		if(a > b && a >c) {
//			if(b> a && b > c) {
//				if(c > a && c > b) {
//					System.out.println("A is largest number");
//				}
//				else {
//					System.out.println("B is largest number ");
//				}
//			}
//			else {
//				System.out.println("C is largest number ");
//			}
//		}
//		else {
//			System.out.println("both equal");
//		}
		
		
////		anothr way run
//
//		Scanner sc = new Scanner(System.in);
//		        int a = sc.nextInt();
//		        int b = sc.nextInt();
//		        int c = sc.nextInt();
//
//		        if(a > b) {
//		            if(a > c) {
//		                System.out.println(a + " is largest");
//		            } else {
//		                System.out.println(c + " is largest");
//		            }
//		        } else {
//		            if(b > c) {
//		                System.out.println(b + " is largest");
//		            } else {
//		                System.out.println(c + " is largest");
//		            }
//		        }
		    
		
//		12. Check whether a number is a single-digit or double-digit number. If double-digit, check whether it is positive or negative.
//		13. Check whether a temperature is hot or cold. If hot, check whether it is extremely hot.
//		14. Check whether a student is eligible for an exam based on attendance (75%). If eligible, check whether fees are paid.
//		15. Check whether a number is within the range 1–100. If yes, check whether it is even or odd.
//		Level 2: Intermediate Programs (16–30)
//		16. Student grading system: Check pass/fail. If passed, assign grade A, B, C or D based on marks.
//		17. Electricity bill: Check units consumed. Calculate the bill based on consumption slabs.
//		18. ATM withdrawal: Check PIN. If correct, check account balance before withdrawal.
//		19. Login system: Check username. If correct, check password.
//		20. Online shopping: Check whether the product is available. If available, check whether the user has sufficient balance.
//		21. Bank loan eligibility: Check age. If eligible, check monthly salary.
//		22. Employee bonus: Check employee experience. If eligible, check performance rating.
//		23. Shopping discount: Check purchase amount. If eligible, check membership status to calculate discount.
//		24. Insurance eligibility: Check age. If eligible, check annual income.
//		25. College admission: Check 12th percentage. If eligible, check entrance exam marks.
//		26. Railway ticket booking: Check seat availability. If available, check payment status.
//		27. Hospital appointment: Check whether the doctor is available. If available, check appointment confirmation.
//		28. Mobile recharge: Check recharge amount. If valid, check available payment balance.
//		29. Password validation: Check password length. If valid, check whether it contains a digit.
//		30. Restaurant ordering: Check food availability. If available, check whether the customer has enough money.
//		Level 3: Advanced Logic Building (31–40)
//		31. Find the largest and smallest among four numbers.
//		32. Check whether three sides form a valid triangle. If valid, check whether it is equilateral, isosceles or scalene.
//		33. Check whether a number is a palindrome. If yes, check whether it is divisible by 5.
//		34. Check whether a number is prime. If prime, check whether it is odd or even.
//		35. Check whether a number is an Armstrong number. If yes, check whether it is greater than 100.
//		36. Check whether a student passed all three subjects. If yes, calculate the average and grade.
//		37. Check whether a person is eligible for a passport based on age. If eligible, check whether all required documents are available.
//		38. Check whether a number is within 1–1000. If yes, identify whether it is a one-digit, two-digit or three-digit number.
//		39. Check whether a date is valid. If valid, check whether the month has 30, 31 or 28/29 days.
//		40. Check whether a number is divisible by both 3 and 5. If yes, check whether it is also divisible by 10.
//		Level 4: Expert-Level Programs (41–50)
//		41. ATM system with PIN validation, account balance, withdrawal amount and minimum balance.
//		42. Banking system with account type (Savings/Current), transaction type (Deposit/Withdraw) and balance validation.
//		43. Employee salary calculation based on department, experience, performance and basic salary.
//		44. Online shopping checkout with login, product availability, discount eligibility and payment validation.
//		45. College admission based on 12th marks, entrance exam marks, category and document verification.
//		46. Hotel room booking based on room availability, customer type, number of days and payment status.
//		47. Railway reservation based on train availability, ticket class, seat availability and payment status.
//		48. Insurance premium calculation based on age, policy type, annual income and health declaration.
//		49. Job recruitment system based on education, technical skills, experience and interview marks.
//		50. Electricity billing system based on customer type, units consumed, meter status and payment status.

	}
}
