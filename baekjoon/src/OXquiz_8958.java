import java.util.Scanner;

public class OXquiz_8958 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int row;
		do {
			row = scan.nextInt();
		} while(row < 0);
		
		for (int i = 0; i < row; i++) {
			
			int score = 0;
			int stack = 0;
			
			String quiz = scan.next();
			char[] oxs = quiz.toCharArray();
			
			for (char ox: oxs) {
				if(ox == 'O') {
					stack += 1;
					score += stack;
				} else if(ox == 'X') {
					stack = 0;
				} else {
					return;
				}
			}
			
			System.out.println(score);
		}
	}
}
