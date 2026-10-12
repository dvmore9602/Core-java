package nested_if;

public class JobEligiblility {

	    public static void main(String[] args) {
	        int age = 22;
	        boolean hasDegree = true;

	        if (age >= 18) {
	            if (hasDegree) {
	                System.out.println("Eligible to apply");
	            } else {
	                System.out.println("Degree required");
	            }
	        } else {
	            System.out.println("Age criteria not satisfied");
	        }
	    }
	}


