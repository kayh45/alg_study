import java.util.Scanner;

public class YunNyun_2753 {
	public static void main(String[] args) {
		// 2753 - À±³â

		Scanner scan = new Scanner(System.in);
		
		int year = scan.nextInt();
		int result = 0;
		
		if(year % 400 == 0 || (year % 100 != 0 && year % 4 == 0)) {
			result = 1;
		}
		
		System.out.println(result);
		
	}	
}