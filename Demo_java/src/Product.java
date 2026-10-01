
public class Product {
   public static void main(String[] args) {
	    

       byte quantity = 5;
       short productId = 1001;
       int stock = 250;
       long barcode = 8901234567890L;
       float weight = 2.5f;
       double price = 45999.99;
       char category = 'E';
       boolean available = true;
       
       System.out.println("product qauntity : " + quantity);
       System.out.println("product id : " + productId);
       System.out.println("product stock :  " + stock);
       System.out.println("product barcode : " + barcode);
       System.out.println("product weight : " + weight );
       System.out.println("product price : " + price);
       System.out.println("product category :" + category);
       System.out.println("product available : " + available);
       
       
//       size to byte
       
       System.out.println("Byte is :" + Byte.BYTES + "byte");
		System.out.println("short is : " + Short.BYTES + "byte");
		System.out.println("int is : " + Integer.BYTES + "byte");
		System.out.println("long is : " + Long.BYTES + "byte");
		System.out.println(" float is : " + Float.BYTES + "byte");
		System.out.println("double is : " + Double.BYTES + "byte") ;
		System.out.println("char is : " + Short.BYTES + "byte");
		System.out.println("boolean is : " + Boolean.FALSE);
		

       
// size to bites

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
