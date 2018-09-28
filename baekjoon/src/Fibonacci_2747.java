import java.util.Scanner;

//public class Main {
//	public static void main(String[] args) {
//		
//	}
//}


public class Fibonacci_2747 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int num = 1;
		int temp = 0;
		int postNum = 1;
		
		int in = 0;
		do {
			in = scan.nextInt();
		} while(in > 45 || in < 0);
		
		for (int i = 1; i < in; i++) {
			num = postNum;
			postNum = num + temp;
			temp = num;
		}
		
		System.out.println(postNum);
	}
}
