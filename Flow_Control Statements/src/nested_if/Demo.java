package nested_if;

//  A nested if statement means writing one if statement inside another if statement.
//It is useful when we want to check a second condition only after the first condition is satisfied.

// Syntax :

//if (condition1) {
//    if (condition2) {
//        // Executes when both conditions are true
//    } else {
//        // Inner condition is false
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
			} 
			else {
				System.out.println("Voter ID required");
			}
		} 
		else {
			System.out.println("Not eligible to vote");
		}
	}
}
