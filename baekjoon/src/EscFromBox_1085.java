import java.util.Scanner;

public class EscFromBox_1085 {
	public static void main(String[] args) {
		// 1085 - 직사각형에서 탈출
		// kayh45 <kayh4545@gmail.com>

		Scanner scan = new Scanner(System.in);
		
		int x = scan.nextInt();
		int y = scan.nextInt();
		int w = scan.nextInt();
		int h = scan.nextInt();
		
		int shortX = 0;
		int shortY = 0;
		
		if(x < (w-x)) {
			shortX = x;
		}else {
			shortX = (w-x);
		}
		
		if(y < (h-y)) {
			shortY = y;
		}else {
			shortY = (h-y);
		}
		
		System.out.println(shortX < shortY? shortX: shortY);
		
	}	
}