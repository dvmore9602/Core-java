package Practice_quetions;

public class Test {
	public static void main(String[] args) {
		Persons p1 = new Persons();
		Demographics pp = p1.getDetails(23, "Dnuanu");
		Locations l1 = pp.giveAdress();
		String s1= l1.getcityName();
		System.out.println(s1);
		

	}

}
