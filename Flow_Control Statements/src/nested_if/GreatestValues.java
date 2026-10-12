package nested_if;

public class GreatestValues {
	public static void main(String[] args) {
		
		int a = 10;
		int b = 39;
		
		if(a > b) {
			if(a == b) {
				System.out.println("Both are equal");
			}
			else {
				System.out.println(" A is Greater");
			}
		}
		else {
			System.out.println("B is greater");
		}
	}

}
