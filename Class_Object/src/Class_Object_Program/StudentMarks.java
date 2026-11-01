package Class_Object_Program;

public class StudentMarks {
	String name;
	int marks;

	public void display() {
		System.err.println("marks" + marks);
		System.out.println("Name " + name);

		if (marks >= 90) {
			System.out.println("Grade A");

		} else if (marks >= 75) {
			System.out.println("Grade B");
		} else if (marks >= 60) {
			System.out.println("Grade c");
		} else if (marks >= 50) {
			System.out.println("Grade D");

		} else {
			System.out.println("FAil");
		}
	}

}
