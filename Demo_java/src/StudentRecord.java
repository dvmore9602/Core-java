
public class StudentRecord {
	public static void main(String[] args) {
		
		byte studExp = 4;
		short age = 23;
		int studId = 1111;
		long adharNo = 336758858783l;
		
		float height = 5.4f;
		double salary = 55000.00;
		char gender = 'M';
		boolean is_active = false;
		
		System.out.println(" Student exprince : " + studExp);
		System.out.println(" Student age : " + age);
		System.out.println("Student Id : " + studId);
		System.out.println("Student adhar no : " + adharNo);
		System.out.println("Student height : " + height);
		System.out.println("Student salary : " + salary);
		System.out.println("Student gender : " + gender );
		System.out.println("Student Is Active : " + is_active);
		
		
//		size to byte 
		
		System.out.println("Byte is :" + Byte.BYTES + "byte");
		System.out.println("short is : " + Short.BYTES + "byte");
		System.out.println("int is : " + Integer.BYTES + "byte");
		System.out.println("long is : " + Long.BYTES + "byte");
		System.out.println(" float is : " + Float.BYTES + "byte");
		System.out.println("double is : " + Double.BYTES + "byte") ;
		System.out.println("char is : " + Short.BYTES + "byte");
		System.out.println("boolean is : " + Boolean.FALSE);
		
		
//		size to bites
		
		System.out.println("Byte is :" + Byte.SIZE + "bites");
		System.out.println("short is : " + Short.SIZE + "bites");
		System.out.println("int is : " + Integer.SIZE + "bites");
		System.out.println("long is : " + Long.SIZE + "bites");
		System.out.println(" float is : " + Float.SIZE + "bites");
		System.out.println("double is : " + Double.SIZE + "bites") ;
		System.out.println("char is : " + Short.SIZE + "bites");
		System.out.println("boolean is : " + Boolean.FALSE);
		
		
	}

}
