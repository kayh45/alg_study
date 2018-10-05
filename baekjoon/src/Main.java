import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
	
	public static int rotation(int nowDir, String dir) {
		
		if ("D".equals(dir)) {
			nowDir++;
			if (nowDir == 5) return 0;
		} else {
			nowDir--;
			if (nowDir == -1) return 4;
		}
		
		return nowDir;
	}
	
	public static boolean isApple(int[][] map, int[] head) {
		boolean result = false;
		
		if (map[head[0]][head[1]] == 1) result = true;
		
		return result;
	}
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int time = 0;
		
		int mapSize = scan.nextInt();
		int[][] map = new int[mapSize][mapSize];
		
		for (int mapX = 0; mapX < map.length; mapX++) {
			for (int mapY = 0; mapY < map.length; mapY++) {
				map[mapX][mapY] = 0;
			}
		}
		
		int numOfApples = scan.nextInt();		
		for (int idx = 0; idx < numOfApples; idx++) {
			int tempX = scan.nextInt();
			int tempY = scan.nextInt();
			
			map[tempX][tempY] = 1;
		}
		
		int[] head = {0, 0};
		List<int[]> player = new LinkedList<>();
		player.add(head);
		
		int nowDir = 1;
		int numOfRotation = scan.nextInt();
		for (int idx = 0; idx < numOfRotation; idx++) {
			int waitSec = scan.nextInt();
			String moveDir = scan.next();
			
			
			int tempTime = waitSec - time;
			for (int tIdx = 0; tIdx < tempTime; tIdx++) {
				time++;
				switch(nowDir) {
					case 1: {
						head[0] += 1;
						
						int[] newHead = {head[0], head[1]};
						player.add(newHead);
						
						if (!isApple(map, head)) {
							player.remove(0);
						}
						
						if (time != 1 && (player.contains(head) || head[0] >= mapSize)) {
							System.out.println(time);
							return;
						}
						
					} break;
					case 2: {
						head[1] += 1;
						
						if (head[1] >= mapSize || player.contains(head)) {
							System.out.println(time);
							return;
						}
						
						int[] newHead = {head[0], head[1]};
						player.add(newHead);
						
						if (!isApple(map, head)) {
							player.remove(0);
						}
						
					} break;
					case 3: {
						head[0] -= 1;
						
						if (head[0] <= 0 || player.contains(head)) {
							System.out.println(time);
							return;
						}
						
						int[] newHead = {head[0], head[1]};
						player.add(newHead);
						
						if (!isApple(map, head)) {
							player.remove(0);
						}
						
					} break;
					case 0: {
						head[1] -= 1;
						
						if (head[1] <= 0 || player.contains(head)) {
							System.out.println(time);
							return;
						}
						
						int[] newHead = {head[0], head[1]};
						player.add(newHead);
						
						if (!isApple(map, head)) {
							player.remove(0);
						}
						
					} break;
				}
				
				System.out.println(head[0]+","+head[1]);
			}
			nowDir = rotation(nowDir, moveDir);
		}
				
	}
}
