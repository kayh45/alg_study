import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Egypt_4153 {
	public static void main(String[] args) {
		// 4153 - Á÷°¢»ï°¢Çü
		// kayh45 <kayh4545@gmail.com>

		Scanner scan = new Scanner(System.in);
		boolean doLoop = true;
		
		do {
			int diagonal = Integer.MIN_VALUE;
			List<Integer> others = new ArrayList<Integer>();
			for(int i = 0; i < 3; i++) {
				int tmp = scan.nextInt();
				if(tmp == 0) {
					doLoop = false;
					break;
				}
				others.add(tmp);
				if(diagonal < tmp) {
					diagonal = tmp;
				}
			}
			
			if(doLoop) {
				int sumOfothersPow = 0;
				others.remove(others.indexOf(diagonal));
				for (int num : others) {
					sumOfothersPow += Math.pow(num, 2);
				}
				
				if(Math.pow(diagonal, 2) == sumOfothersPow) {
					System.out.println("right");
				}else {
					System.out.println("wrong");
				}
			}
		} while(doLoop);

		
	}	
}