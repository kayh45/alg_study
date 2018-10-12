import java.util.Scanner;

public class Tones_2920 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int[] tones = new int[8];
		String result = null;
		
		for (int i = 0; i < tones.length; i++) {
			tones[i] = scan.nextInt();
		}
		
		for (int i = 1; i < tones.length; i++) {
			int d;
			d = tones[i] - tones[i-1];
			
			if (Math.abs(d) != 1) {
				result = "mixed";
				break;
			} else if(d < 1){
				result = "descending";
			} else {
				result = "ascending";
			}
		}
		
		System.out.println(result);
		
	}
	
}