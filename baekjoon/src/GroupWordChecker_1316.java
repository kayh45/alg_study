import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class GroupWordChecker_1316 {
	public static void main(String[] args) {
		// 1316 - 그룹 단어 체커
		// kayh45 <kayh4545@gmail.com>

		Scanner scan = new Scanner(System.in);
		
		int loop = scan.nextInt();
		int count = 0;
		
		for(int n = 0; n < loop; n++) {
			String str = scan.next();
			Set<Character> noUse = new HashSet<Character>();
			
			char tmp = '_';
			boolean isErr = false;
			for(int i = 0; i < str.length(); i++) {
				if(noUse.contains(str.charAt(i))) {
					isErr = true;
					break;
				}
				if(tmp != str.charAt(i)) {
					noUse.add(tmp);
					tmp = str.charAt(i);
				}
			}
			
			if(!isErr) count++;
			
		}
		
		System.out.println(count);
		
	}	
}