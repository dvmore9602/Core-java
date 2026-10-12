package if_else_ladder;

public class CharacterTypes {
	public static void main(String[] args) {
		char ch = '7';
		
		if(ch >= 0 && ch >=9) {
			System.out.println( " digit");
		}
		else if ((ch >= 'A' && ch <='Z' ) || (ch >= 'a' && ch <= 'z')){
			System.out.println("Alphabet");
		}
		else {
			System.out.println("Special charectors");
		}
	}

}

// Dry run ch = 7 
// check the condition = (ch >= 0 && ch >= 9) = (7 >= 0 && 7 >=9) = (true && true) = true
//print  = digit
