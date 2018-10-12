import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Snake_3190 {
	
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
	
	public static boolean isCrashed(List<int[]> player, int[] head) {
		boolean result = false;		
		
		for (int i = 0; i < player.size(); i++) {
			
			int[] arr = player.get(i);
			
			if (i != player.size() - 1 && arr[0] == head[0] && arr[1] == head[1]) {
				result = true;
			}
		}
		
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
				
				switch(nowDir) {
					case 1: {
						head[0] += 1;
						
						int[] newHead = {head[0], head[1]};
						player.add(newHead);
						
						if (time != 1 && (isCrashed(player, head) || head[0] >= mapSize)) {
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
						
						if (head[1] >= mapSize || isCrashed(player, head)) {
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
						player.add(newHead);
						
						if (head[0] < 0 || isCrashed(player, head)) {
							System.out.println(time);
							return;
						}

						
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
						
						if (head[1] < 0 || isCrashed(player, head)) {
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