import java.util.Scanner;

public class TriangledGimbap_2783 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		float w = scan.nextInt();
		float p = scan.nextInt();
		float minWpP = (1000 / p) * w;
		
		int loop = scan.nextInt();
		
		float tempWpP = 0;
		for (int i = 0; i < loop; i++) {
			w = scan.nextInt();
			p = scan.nextInt();
			tempWpP = (1000 / p) * w;
			if (tempWpP < minWpP) minWpP = tempWpP;
		}
		
		System.out.printf("%.2f", minWpP);
	
	}	
}