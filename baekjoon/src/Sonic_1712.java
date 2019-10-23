import java.util.Scanner;

public class Sonic_1712 {
	public static void main(String[] args) {
		// 1712 - 손익분기점
		// kayh45 <kayh4545@gmail.com>

		Scanner scan = new Scanner(System.in);
		
		long stLoss = scan.nextInt();
		long mvLoss = scan.nextInt();
		long price = scan.nextInt();
		
		long count = 1;
		if (mvLoss >= price) {
			System.out.println(-1);
			return;
		}
		for(;; count++) {
			long loss = stLoss + (count * mvLoss);
			long profit = count * price;
			if(profit > loss) {
				break;
			}
			//System.out.println(profit);
		}
		System.out.println(count);
	}	
}