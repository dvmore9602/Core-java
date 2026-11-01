package Class_Object_Program;

public class DivisibleBy3_5 {
	void check() {
		for(int i = 1; i <= 100; i++) {
			if(i % 3== 0 && i % 5==0) {
				System.out.println("Number is divisible by 3 and 5" + i);
			}
			else {
				System.out.println("Number is not divisible by 3 and 5" + i);
			}
		}
	}

}
