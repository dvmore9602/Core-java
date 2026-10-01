
public class Patient {
	public static void main(String[] args) {
		
		byte age = 35;
        short patientId = 501;
        int roomNo = 205;
        long contactNo = 9876543210L;
        float temperature = 98.6f;
        double billAmount = 12500.50;
        char gender = 'F';
        boolean admitted = true;

        System.out.println("patient age :" + age);
        System.out.println("patient patientId : " + patientId);
        System.out.println("patient room number : " + roomNo);
        System.out.println("patient contact number : "+ contactNo);
        System.out.println("patient temperature :" + temperature);
        System.out.println("patient bill amount : " + billAmount);
        System.out.println("gender : " + gender);
        System.out.println("patient admitted : " + admitted);
        
//        size to byte
        
        System.out.println("Byte is :" + Byte.BYTES + "byte");
		System.out.println("short is : " + Short.BYTES + "byte");
		System.out.println("int is : " + Integer.BYTES + "byte");
		System.out.println("long is : " + Long.BYTES + "byte");
		System.out.println("float is : " + Float.BYTES + "byte");
		System.out.println("double is : " + Double.BYTES + "byte") ;
		System.out.println("char is : " + Short.BYTES + "byte");
		System.out.println("boolean is : " + Boolean.FALSE);

		
//		 size to bites
		
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
