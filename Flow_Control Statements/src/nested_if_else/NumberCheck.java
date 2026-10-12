package nested_if_else;

public class NumberCheck {
	public static void main(String[] args) {
		
		int number = 10;
		
		if(number > 0 ) { // true
			if(number % 2 ==0) { //true
				System.out.println("pisitive Even");
			}
			else {
				System.out.println("positive odd");
			}
		}
		else {
			if(number == 0) {
				System.out.println("zero");
			}
			else {
				System.out.println("Negative Number");
			}
		}
	}

}


