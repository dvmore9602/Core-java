package Encapsulations;

public class Employee {

	private int employeeId;
	private String employeeName;
	private int age;
	private char gender;
	private String department;
	private String designation;
	private double salary;
	private String email;
	private long phone;
	private String city;
	private String address;
	private int joiningYear;
	private int experience;
	private String companyName;
	private boolean permanent;

	void setemployeeId(int id) {
		employeeId = id;

	}

	public int getemployeeId() {
		return employeeId;
	}

	void setemployeeName(String Name) {
		employeeName = Name;
	}

	public String getemployeeName() {
		return employeeName;
	}

	public void setage(int Age) {
		age = Age;

	}

	public int getage() {
		return age;
	}

	public void setgender(char emp_gender) {
		gender = emp_gender;
	}

	public char getgender() {

		return gender;
	}

	void setdepartment(String emp_Dempartment) {
		department = emp_Dempartment;
	}

	public String getdepartment() {
		return department;
	}

	void setdesignation(String emp_designation) {
		designation = emp_designation;
	}

	public String getdesignation() {
		return designation;
	}

	void setsalary(double emp_salary) {
		salary = emp_salary;
	}

	public double getsalary() {
		return salary;
	}

	void setemail(String emp_email) {
		email = emp_email;
	}

	public String getemail() {
		return email;
	}

	void setphone(long emp_phone) {
		phone = emp_phone;
	}

	public long getphone() {
		return phone;
	}

	void setcity(String emp_city) {
		city = emp_city;
	}

	public String getcity() {
		return city;
	}
	void setaddress(String emp_address) {
		address = emp_address;
	}
	public String getaddress() {
		return address;
	}
	void setjoingyear(int year) {
		joiningYear= year;
	}
	public int getjoingyear() {
		return joiningYear;
		
	}
	void setexperience (int emp_experience) {
		experience = emp_experience;
	}
	public int getexperience() {
		return experience;
	}
	void setcompanyName(String emp_companyName) {
		companyName = emp_companyName;
	}
	public String getcompanyName() {
		return companyName;
	}
	void setpermanent (boolean is_permanent) {
		permanent = is_permanent;
	}
	public boolean getpermanent() {
		return permanent;
	}

}
