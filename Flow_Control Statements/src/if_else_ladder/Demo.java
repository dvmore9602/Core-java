package if_else_ladder;
// An if-else-if ladder is used when we need to check multiple conditions. Java checks the conditions 
// from top to bottom and executes the first block whose condition is true.

////  Syntax :
//if (condition1) {
//    // Code 1
//} else if (condition2) {
//    // Code 2
//} else if (condition3) {
//    // Code 3
//} else {
//    // Default code
//}

public class Demo {
	public static void main(String[] args) {
		
	
	int number = -2;
	if(number > 0) {
		System.out.println("Positive numbers ");
	}
	else if(number < 0) {
		System.out.println("negative number ");
	}
	else {
		System.out.println("Zero");
	}
	}
}

//  Dry run
