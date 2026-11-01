package method_progran;

public class Student {
	int stdID;
	int age;
	String name;
	int marks;
	boolean is_passed;


	// Non-parametrized with no return type

	public void displayDetails() {
		System.out.println("Student id : " + stdID);
		System.out.println("Student name :  " + name);
		System.out.println("Student age : " + age);
		System.out.println("Student marks : " + marks);
		System.out.println("Student is passed" + is_passed);
		
	}
	
//	Non parameterized with return types
	public int callmarks() {
		return marks;
		
	}
//	 Parameterized with return type
	public  int updatedmarks() {
		marks += callmarks();
		return marks;
		
		
	}
	
	//Parameterized without return type
	public void result(boolean isPassed) {
		if (isPassed) {
			System.out.println("Student is passed");
		}else {
			System.out.println("Student is fail");
		}
	}


	
	

}
