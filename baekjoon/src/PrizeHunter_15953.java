import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrizeHunter_15953 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int count;
		List<Integer> mList = new ArrayList<>();
		
		do {
			count =  scan.nextInt();
		} while (count < 0 || count > 1000);
		
		for (int i = 0; i < count; i++) {
			int first = 0;
			int second = 0;
			int prize = 0;
			
			do {
				first =  scan.nextInt();
			} while (first < 0 || first > 100);
			
			do {
				second =  scan.nextInt();
			} while (second < 0 || second > 64);
			
			if (first == 0) {
				prize += 0;
			} else if (first == 1) {
				prize += 5000000;
			} else if (first <= 3) {
				prize += 3000000;
			} else if (first <= 6) {
				prize += 2000000;
			} else if (first <= 10) {
				prize += 500000;
			} else if (first <= 15) {
				prize += 300000 ;
			} else if (first <= 21) {
				prize += 100000;
			}  
			
			if (second == 0) {
				prize += 0;
			} else if (second == 1) {
				prize += 5120000;
			} else if (second <= 3) {
				prize += 2560000;
			} else if (second <= 7) {
				prize += 1280000;
			} else if (second <= 15) {
				prize += 640000;
			} else if (second <= 31) {
				prize += 320000 ;
			} 
			
			mList.add(prize);
		}
		
		for (Integer prize : mList) {
			System.out.println(prize);
		}
		
	}
}