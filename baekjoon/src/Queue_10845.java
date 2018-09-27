import java.util.Scanner;

public class Queue_10845 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int cmdNum;
		
		String cmd;
		int n = 1;		
		
		do {
			cmdNum = scan.nextInt();
		} while(cmdNum > 10000 || cmdNum < 1);
		
		int[] queue = new int[0];
		int[] tempQ = new int[0];
		
		for (int i = 0; i < cmdNum; i++) {
			
			do {
				cmd = scan.next();
				if("push".equals(cmd)) {
					n = scan.nextInt();
				}
			} while(!isInCmds(cmd) || (n < 1 || n > 100000));
			
			switch(cmd) {
				case "push": {
					if (queue.length > 0) {
						tempQ = queue;
						queue = new int[queue.length + 1];
						for(int idx = 1; idx < queue.length; idx++) {
							queue[idx] = tempQ[idx - 1];
						}
					} else {
						queue = new int[queue.length + 1];
					}
					queue[0] = n;
					
				}; break;
				
				case "pop": {
					int popNum = -1;
					
					if (queue.length > 0) {
						tempQ = queue;
						queue = new int[queue.length - 1];
						
						popNum = tempQ[tempQ.length - 1];
						
						for(int idx = 0; idx < queue.length; idx++) {
							queue[idx] = tempQ[idx];
						}
					} 
					
					System.out.println(popNum);
				}; break;
				
				case "size": System.out.println(queue.length); break;
				
				case "empty": {
					if (queue.length > 0) {
						System.out.println(0);
					} else {
						System.out.println(1);
					}
				}; break;
				
				case "front": {
					if (queue.length > 0) {
						System.out.println(queue[queue.length - 1]);
					} else {
						System.out.println(-1);
					}
				}; break;
				
				case "back": {
					if (queue.length > 0) {
						System.out.println(queue[0]);
					} else {
						System.out.println(-1);
					}
				}; break;
			}
		}		
	}
	
	
	public static boolean isInCmds(String cmd) {
		String[] cmds = {"push", "pop", "size", "empty", "front", "back"};
		boolean cmdCorr = false;
		
		for(String mCmd: cmds) {
			if(mCmd.equals(cmd)) {
				cmdCorr = true;
				break;
			}
		}
		return cmdCorr;
	}
}
