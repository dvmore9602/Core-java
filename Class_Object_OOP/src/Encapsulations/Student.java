package Encapsulations;

public class Student {
	private int rollNo;
	private String stdName;
	private int age;
	private String course;
	private String college;
	private int m1, m2, m3, m4, m5;
	private int total;
	private double percentage;

	void setrollNo(int rollnumber) {
		rollNo = rollnumber;

	}

	public int getrollNo() {
		return rollNo;
	}

	void setstdName(String Name) {
		stdName = Name;
	}

	public String getstdName() {
		return stdName;
	}

	void setage(int stdage) {
		age = stdage;

	}

	public int getage() {
		return age;
	}
	void setcourse (String courseName) {
		course = courseName;
	}
	public String getcourse() {
		return course;
	}
	void setcollege(String collegeName) {
		college = collegeName;
	}
	public String getcollege() {
		return college;
	}
	void setmarks(int a,int b,int c,int d , int e) {
		if(a >=0 && a<=100 &&
		   b>= 0 && b <=100 &&
		   c >=0 && c <= 100 &&
		   d >=0 && d<= 100 &&
		   e >= 0 && e <= 100) {
			
			
			m1 = a;
			m2 = b;
			m3 = c;
			m4 = d;
			m5 = e;
			
			total = a + b+ c + d +e;
			percentage = total /0.5;
			
		}
		else {
			System.out.println("Invalide marks ");
		}
	  
		 
	}

}
