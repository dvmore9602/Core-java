package Encapsulations;

public class Main {
	public static void main(String[] args) {
		Employee e1 = new Employee();
		e1.setemployeeId(102);
		e1.setemployeeName("Dnyaneshwari");
		e1.setage(24);
		e1.setgender('f');
		e1.setdepartment("IT");
		e1.setdesignation("Java developer");
		e1.setsalary(45000);
		e1.setemail("dnyanu@123gamil.com");
		e1.setphone(7865473883l);
		e1.setcity("Pune");
		e1.setaddress("Akurdi");
		e1.setjoingyear(2025);
		e1.setexperience(2);
		e1.setcompanyName("ABC company");
		e1.setpermanent(true);
		
		System.out.println("Employee ID : " + e1.getemployeeId());
		System.out.println("Employee Name : " + e1.getemployeeName());
		System.out.println("Employee age" +e1.getage());
		System.out.println("gender : " + e1.getgender());
		System.out.println("department : " + e1.getdepartment());
		System.out.println("Designations : " +e1.getdesignation());
		System.out.println("salary : " +e1.getsalary());
		System.out.println("email : " +e1.getemail());
		System.out.println("Phone : " + e1.getcity());
		System.out.println("address : " +e1.getaddress());
		System.out.println("Joining year :" + e1.getjoingyear());
		System.out.println("experince : "+e1.getexperience());
		System.out.println("company name : " + e1.getcompanyName());
		System.out.println("parmanent : " + e1.getpermanent());
		
	}

}
