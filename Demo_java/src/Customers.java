
public class Customers {
	public static void main(String[] args) {
		
		byte age = 27;
        short customerId = 501;
        int branchCode = 1234;
        long accountNumber = 123456789012L;
        float interest = 7.25f;
        double accountBalance = 85000.50;
        char accountType = 'S';
        boolean loanAvailable = false;
        
        System.out.println("customer age : " + age );
        System.out.println("customerId : " + customerId);
        System.out.println("customer brach code : " + branchCode);
        System.out.println("customer Account No : " + accountNumber);
        System.out.println("customer Interest : " + interest);
        System.out.println("customer account Balence : " + accountBalance);
        System.out.println("customer account Type : " + accountType);
        System.out.println("customer loan available : " + loanAvailable);

//        size to byte 
        
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
