package if_Statement;
//  Definition: The if statement executes a block of code only when the specified condition is true.\

//  if (condition) {
////   Code executes if condition is true
//} 
  

public class Demo {
	public static void main(String[] args) {
		int age = 26;   // age = 26 
//		int age = 16;   // age 16 
//		
////		 coditions is the false  this is not print
		
		if(age > 18) {  //check the condition  age > 18 = true
			System.out.println("you are eligible ");  // print = you are eligible
		}
	}

}
