import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int tc = sc.nextInt();
		
		for (int i = 1; i <= tc; i++) {
			int n = sc.nextInt();
			int v = 0;
			int result = 0;
			
			for (int j = 0; j < n; j++) {
				int cmd = sc.nextInt();
				
				if (cmd == 0) {
					result += v;
					
				} else if (cmd == 1) {
					v += sc.nextInt();
					result += v;
					
				} else if (cmd == 2) {
					v -= sc.nextInt();
					if (v < 0) {
						v = 0;
					}
					result += v;
					
				}
			}
			System.out.println("#" + i + " " + result);
		}
	}
}
