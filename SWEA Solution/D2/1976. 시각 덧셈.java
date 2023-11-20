import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int tc = sc.nextInt();
		
		for (int i = 1; i <= tc; i++) {
			int h1 = sc.nextInt();
			int m1 = sc.nextInt();
			int h2 = sc.nextInt();
			int m2 = sc.nextInt();
			
			int resH = h1 + h2;
			int resM = m1 + m2;
			
			if (resM >= 60) {
				resH++;
				resM -= 60;
			}
			
			if (resH >= 13) {
				resH -= 12;
			}
			
			System.out.println("#" + i + " " + resH + " " + resM);
			
		}
	}
}
