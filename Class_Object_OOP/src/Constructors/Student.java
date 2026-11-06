package Constructors;

public class Student{

	    int id;
	    String name;
	    int age;

	    Student(int i, String n, int a) {

	        id = i;
	        name = n;
	        age = a;
	    }

	    void display() {

	        System.out.println("ID: " + id);
	        System.out.println("Name: " + name);
	        System.out.println("Age: " + age);
	    }

	    public static void main(String[] args) {

	        Student s1 = new Student(101, "Rahul", 22);

	        Student s2 = new Student(102, "Priya", 21);

	        s1.display();
	        s2.display();
	    }
	}



