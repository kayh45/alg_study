import java.util.Scanner;

public class CroAlph_2941 {
	public static void main(String[] args) {
		// 2941 - 크로아티아 알파벳
		// kayh45 <kayh4545@gmail.com>

		Scanner scan = new Scanner(System.in);
		
		String str = scan.next();
		
		char tmp = 'a';
		int count = str.length();
		for(int i = 0; i < str.length(); i++) {
			char word = str.charAt(i);
			switch (word) {
			case '=': {
				if(tmp == 'Z') count--;
				count--;
				break;
			}
			case '-': {
				count--;
				break;
			}
			case 'j': {
				if (tmp == 'n' || tmp == 'l') count--;
				break;
			}
			}
			if(word == 'z' && tmp == 'd') {
				tmp = 'Z';
			}else {
				tmp = word;
			}
		}
		System.out.println(count);
	}	
}