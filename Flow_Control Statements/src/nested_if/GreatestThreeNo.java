package nested_if;

public class GreatestThreeNo {
	
	    public static void main(String[] args) {
	        int a = 10, b = 30, c = 20;

	        if (a > b) {
	            if (a > c) {
	                System.out.println("A is greatest");
	            } else {
	                System.out.println("C is greatest");
	            }
	        } else {
	            if (b > c) {
	                System.out.println("B is greatest");
	            } else {
	                System.out.println("C is greatest");
	            }
	        }
	    }
	}


