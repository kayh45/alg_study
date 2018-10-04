import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class gwalho_9012 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
		
		int x = Integer.parseInt(scan.readLine());
		int count;
		
		for (int i = 0; i < x; i++) {
			
			count = 0;
			
			CharSequence str = scan.readLine();
			
			if (str.charAt(0) == ')' || str.length()%2 == 1) {
				System.out.println("NO");
				continue;
			}
			
			for (int j = 0; j < str.length(); j++) {
				if (str.charAt(j) == '(') {
					count += 1;
				} else if (str.charAt(j) == ')') {
					count -= 1;
					if (count < 0) {
						System.out.println("NO");
						break;
					}
				} else {
					System.out.println("NO");
					break;
				}
				
				if (j == (str.length() - 1)) {
					if (count == 0) {
						System.out.println("YES");
					} else {
						System.out.println("NO");
					}
				} 
			}
		}
		
		scan.close();
	}
}
