import java.util.Scanner;

public class SangSoo_2908 {
	public static void main(String[] args) {
		// 2908 - »ó¼ö
		// kayh45 <kayh4545@gmail.com>

		Scanner scan = new Scanner(System.in);
		
		char[] a = scan.next().toCharArray();
		char[] b = scan.next().toCharArray();
		
		char tmp = '0';
		
		tmp = a[0];
		a[0] = a[2];
		a[2] = tmp;
		
		tmp = b[0];
		b[0] = b[2];
		b[2] = tmp;
		
		int numA = Integer.parseInt(new String(a));
		int numB = Integer.parseInt(new String(b));
		
		System.out.println(numA > numB? numA : numB);
	}	
}