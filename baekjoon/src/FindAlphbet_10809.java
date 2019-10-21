import java.util.Scanner;

public class FindAlphbet_10809 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		String word = scan.nextLine();
		
		char a = 'a';
		char z = 'z';
		int[] resultArr = new int[z-a+1];
		
		for(int i = 0; i < resultArr.length; i++) {
			resultArr[i] = -1;
		}
		
		for(int i = word.length() - 1; i >= 0; i--) {
			char alph = word.charAt(i);
			resultArr[alph-a] = i;
		}
		
		for (int i : resultArr) {
			System.out.print(i + " ");
		}
		
	}	
}