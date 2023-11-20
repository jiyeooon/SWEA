import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int tc = sc.nextInt();
		
		for(int i = 0;  i < tc; i++) {
			int P = sc.nextInt();
			int Q = sc.nextInt();
			int R = sc.nextInt();
			int S = sc.nextInt();
			int W = sc.nextInt();
			
			int a = W*P;
			int b = (W <= R)? Q : Q+(W-R)*S;
			
			int res = (a<b)? a : b;
			
			System.out.println("#" + (i+1) + " " + res);
		}
	}
}
