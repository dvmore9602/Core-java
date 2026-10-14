package swichStatement;

public class AreaCalculator {
	public static void main(String[] args) {
		int choic = 2;
		
		switch(choic) {
		case 1:
			double radius = 5;
			double circleArea = 3.14 * radius * radius;
			System.out.println("Area of Circle = " + circleArea);
			break;
		case 2 :
			int size = 4;
			int squareArea = size * size;
			System.out.println("Square Area  = " + squareArea);
			break;
		case 3 :
			double length = 5;
			double width = 3;
			double reactangle = length * width;
			
			System.out.println("Area of rectangle = " + reactangle);
			break;
			default:
				System.out.println("Invalide output");
			
			
		}
	}

}
