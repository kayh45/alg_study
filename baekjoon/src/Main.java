import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int inputSum = 1;
		
		for (int i = 0; i < 3; i++) {
			inputSum *= scan.nextInt();
		}
		
		int[] resultArr = new int[10];
		
		char[] inputStr = Integer.toString(inputSum).toCharArray();
		for (char ch: inputStr) {
			switch (ch) {
			case '0' : resultArr[0] += 1; break; 
			case '1' : resultArr[1] += 1; break; 
			case '2' : resultArr[2] += 1; break; 
			case '3' : resultArr[3] += 1; break; 
			case '4' : resultArr[4] += 1; break; 
			case '5' : resultArr[5] += 1; break; 
			case '6' : resultArr[6] += 1; break; 
			case '7' : resultArr[7] += 1; break; 
			case '8' : resultArr[8] += 1; break; 
			case '9' : resultArr[9] += 1; break; 
			}
		}
		
		for (int n: resultArr) {
			System.out.println(n);
		}
		
	}	
}