package swea;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for (int t = 1; t <= T; t++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			System.out.println("#" + t + " " + (a/b) + " " + (a%b));
		}
		sc.close();
	}
}

//25,716kb, 152ms