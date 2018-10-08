import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
	
	public static int rotation(int nowDir, String dir) {
		if ("D".equals(dir)) {
			nowDir++;
			if (nowDir == 4) return 0;
		} else if ("L".equals(dir)){
			nowDir--;
			if (nowDir == -1) return 3;
		} 
		
		return nowDir;
	}
	
	public static boolean isApple(int[][] map, int[] head) {
		boolean result = false;
		
		if (map[head[1]][head[0]] == 1) result = true;
		
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
			
			map[tempX - 1][tempY - 1] = 1;
		}
		
		int[] initHead = {0, 0};
		int[] head = new int[2];
		List<int[]> player = new LinkedList<>();
		player.add(initHead);
		
		int nowDir = 1;
		int numOfRotation = scan.nextInt();
		for (int idx = 0; ; idx++) {
			
			int waitSec;
			String moveDir;
			int tempTime;
			
			if (idx < numOfRotation) {
				waitSec = scan.nextInt();
				moveDir = scan.next();
				tempTime = waitSec - time;
			} else {
				tempTime = mapSize;
				moveDir = "N";
			}
			
			for (int tIdx = 0; tIdx < tempTime; tIdx++) {
				time++;
				
				for(int[] str:player) {
					System.out.println(str[0]+"--"+str[1]);
				}
				
				System.out.println(time);
				System.out.println(head[0]+","+head[1]);
				switch(nowDir) {
					case 1: {
						head[0] += 1;
						
						int[] newHead = {head[0], head[1]};
						player.add(newHead);
						
						System.out.println(newHead[0] + "-" + newHead[1]);
						
						if (time != 1 && (player.contains(head) || head[0] >= mapSize)) {
							System.out.println(time);
							return;
						}
						
						if (!isApple(map, head)) {
							player.remove(0);
						} else {
							map[head[1]][head[0]] = 0;
						}
						
					} break;
					case 2: {
						head[1] += 1;
						
						int[] newHead = {head[0], head[1]};
						player.add(newHead);
						
						if (head[1] >= mapSize || player.contains(head)) {
							System.out.println(time);
							return;
						}
						
						if (!isApple(map, head)) {
							player.remove(0);
						} else {
							map[head[1]][head[0]] = 0;
						}
					} break;
					case 3: {
						head[0] -= 1;
						
						
						int[] newHead = {head[0], head[1]};
						
						if (head[0] < 0 || player.contains(head)) {
							System.out.println(time);
							return;
						}

						player.add(newHead);
						
						if (!isApple(map, head)) {
							player.remove(0);
						} else {
							map[head[1]][head[0]] = 0;
						}
						
					} break;
					case 0: {
						head[1] -= 1;
						
						int[] newHead = {head[0], head[1]};
						player.add(newHead);
						
						if (head[1] < 0 || player.contains(head)) {
							System.out.println(time);
							return;
						}
						
						if (!isApple(map, head)) {
							player.remove(0);
						} else {
							map[head[1]][head[0]] = 0;
						}
						
					} break;
				}
				
			}
			
			nowDir = rotation(nowDir, moveDir);
		}
				
	}
}
