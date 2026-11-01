package method_progran;

public class Main {

	public static void main(String[] args) {
		Student s1 = new Student();
		s1.stdID = 12;
		s1.name = "Dnyanu";
		s1.age = 24;
		s1.marks = 89;
		s1.is_passed = true;
		
		s1.displayDetails();
		

  System.out.println(s1.marks);
  
  int updatedM =  s1.updatedmarks();
  System.out.println("Updated marks is : " + updatedM);
  
  s1.result(true);
	}
	
}
