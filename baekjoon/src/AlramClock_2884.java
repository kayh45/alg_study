import java.util.Scanner;

public class AlramClock_2884 {
	public static void main(String[] args) {
		// 2884 - 알람시계

		Scanner scan = new Scanner(System.in);
		
		int hour = scan.nextInt();
		int minute = scan.nextInt();
		minute -= 45;
		
		if(minute < 0) {
			hour -= 1;
			minute += 60;
		}
		
		if(hour == -1) hour = 23;
		if(hour == 24) hour = 0;
		
		System.out.println(hour + " " + minute);
		
	}	
}