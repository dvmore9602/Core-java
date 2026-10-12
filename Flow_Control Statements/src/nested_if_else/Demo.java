package nested_if_else;


// A nested if-else statement means placing an if-else statement inside another if or else block.
//It is used when a program needs to make a decision based on multiple levels of conditions.

////Syntax :
//if (condition1) {
//    if (condition2) {
//        // If both conditions are true
//    } else {
//        // Outer true, inner false
//    }
//} else {
//    // Outer condition is false
//}

public class Demo {
	
	    public static void main(String[] args) {
	        int age = 20;
	        boolean voterId = true;

	        if (age >= 18) {
	            if (voterId) {
	                System.out.println("Eligible to vote");
	            } else {
	                System.out.println("Voter ID required");
	            }
	        } else {
	            System.out.println("Not eligible to vote");
	        }
	    }
	}


