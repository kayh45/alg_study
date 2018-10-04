import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class stack_10828 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		List<Integer> stack = new ArrayList<>();
		
		int n = 0;
		do {
			n = scan.nextInt();
		} while(n > 10000 || n < 1);

		for (int i = 0; i < n; i++) {
			switch(scan.next()) {
				case "push": {
					int num = scan.nextInt();
					if (num > 100000 || num < 1) return;
					stack.add(num);
				} break;
				case "pop": {
					int size = stack.size();
					if (size < 1) {
						System.out.println(-1);
					} else {
						System.out.println(stack.get(size - 1));
						stack.remove(size - 1);
					}
				} break;
				case "size": {
					System.out.println(stack.size());				
				} break;
				case "empty": {
					int size = stack.size();
					if (size < 1) {
						System.out.println(1);
					} else {
						System.out.println(0);
					}				
				} break;
				case "top": {
					int size = stack.size();
					if (size < 1) {
						System.out.println(-1);
					} else {
						System.out.println(stack.get(size - 1));
					}		
				} break;
				default: i--;
			}
		}
	}
}
