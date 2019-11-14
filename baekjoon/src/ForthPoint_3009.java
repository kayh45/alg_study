import java.util.Scanner;

public class ForthPoint_3009 {
	public static void main(String[] args) {
		// 3009 - 네번째 점
		// kayh45 <kayh4545@gmail.com>

		Scanner scan = new Scanner(System.in);
		
		int[] xArr = new int[2];
		int[] yArr = new int[2];
		int xResult = 0;
		int yResult = 0;
		
		for(int i = 0; i < 2; i++) {
			xArr[i] = scan.nextInt();
			yArr[i] = scan.nextInt();
		}
		
		xResult = scan.nextInt();
		yResult = scan.nextInt();
		
		if(xArr[0] == xResult) {
			xResult = xArr[1];
		}else if(xArr[1] == xResult) {
			xResult = xArr[0];
		}
		
		if(yArr[0] == yResult) {
			yResult = yArr[1];
		}else if(yArr[1] == yResult) {
			yResult = yArr[0];
		}
	
		System.out.println(xResult + " " + yResult);
	}	
}