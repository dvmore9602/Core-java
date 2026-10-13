package practicequetions;

public class Triangle {
	public static void main(String[] args) {
		int side = 6;
		if(side == 4) {
			System.out.println("Equilateral");
		}
		else if(side== 3) {
			System.err.println("IsoSceles");
		}
		else {
			System.out.println("not a tringle");
		}
	}

}
