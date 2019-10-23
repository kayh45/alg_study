import java.util.ArrayList;
import java.util.Scanner;

public class Dial_5622 {
	public static void main(String[] args) {
		// 5622 - ´ÙÀÌ¾ó
		// kayh45 <kayh4545@gmail.com>

		Scanner scan = new Scanner(System.in);
		
		String str = scan.next();
		ArrayList<String> dial = new ArrayList<String>();
		int res = 0;
		
		for(int i = 'A'; i <= 'W'; i+=3) {
			if(i == 'W' || i == 'P') {
				char[] tmpArr = {(char)i, (char)(i+1), (char)(i+2), (char)(i+3)};
				i++;
				dial.add(new String(tmpArr));
			}else {
				char[] tmpArr = {(char)i, (char)(i+1), (char)(i+2)};
				dial.add(new String(tmpArr));
			}
		}
		
		for(int i = 0; i < str.length(); i++) {
			for (String dialStr : dial) {
				if(dialStr.contains(str.subSequence(i, i+1))) {
					res += dial.indexOf(dialStr) + 3;
					break;
				}
			}
		}
		
		System.out.println(res);
	}	
}