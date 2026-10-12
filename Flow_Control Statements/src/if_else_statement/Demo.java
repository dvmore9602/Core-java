package if_else_statement;

// Definition: The if-else statement executes one block if the condition is true and another block if it is false.


//Syntax:
// if (condition) {
//    // Executes when true
// } else {
//    // Executes when false
//}
public class Demo { 
	public static void main(String[] args) {
//		int age = 19; // age = 19 
		
		int age = 11; // age = 11
		
		
		if( age > 18 && age < 85) {  // check the conditions (age > 18 && age < 85) = ( true && true ) = true 
			                         // check the conditions (age > 18 && age < 85) = (false && true) = false
			System.out.println("you are eligible"); //print you are eligible
		}
		else {
			System.out.println("you are not eligible"); // print = you are not eligibles
		}
	}

}
