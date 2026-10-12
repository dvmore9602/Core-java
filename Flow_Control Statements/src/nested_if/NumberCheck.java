package nested_if;

public class NumberCheck {

	    public static void main(String[] args) {
	        int num = 15;

	        if (num > 0) {
	            if (num % 3 == 0 && num % 5 == 0) {
	                System.out.println("Divisible by both");
	            } else {
	                System.out.println("Not divisible by both");
	            }
	        } else {
	            System.out.println("Number must be positive");
	        }
	    }
	}


