import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AsciiCode_11654 {
	public static void main(String[] args) {
		// 11654 - 아스키 코드

		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		Map mMap = new HashMap();
		int chrNum = 0;
		
		for(int i = 0; i < str.length(); i++) {
			char chr = str.charAt(i);
			
			if(chr <= 'Z') {
				chrNum = (int)chr;
			}else {
				chrNum = (chr - 'a') + 'A';
			}
			
			if(mMap.get(chrNum) == null) {
				mMap.put(chrNum, 1);
			}else {
				mMap.put(chrNum, (int)mMap.get(chrNum)+1);
			}
		}
		
		int mostCount = 0;
		int most = 0;
		for (Object obj : mMap.keySet()) {
			if((int)mMap.get(obj) > mostCount) {
				most = (int)obj;
				mostCount = (int)mMap.get(obj);
			}else if((int)mMap.get(obj) == mostCount) {
				most = (int)'?';
			}
		}
		System.out.println((char)most);
	}	
}