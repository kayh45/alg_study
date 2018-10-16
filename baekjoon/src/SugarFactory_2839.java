import java.util.Scanner;

public class SugarFactory_2839 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int sugar = scan.nextInt();
		
		int bag = 0;
		while (true) {
			if (sugar >= 5 && sugar % 5 == 0 || sugar % 3 != 0) {
				sugar -= 5;
			} else if (sugar >= 3){
				sugar -= 3;
			} else {
				break;
			}
			
			bag++;
		}

		if (sugar != 0) {
			System.out.println(-1);
		} else {
			System.out.println(bag);
		}
	
	}	
}