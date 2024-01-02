import java.util.Arrays;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int tc = sc.nextInt();
		
		for (int i = 1; i <= tc; i++) {
			int n = sc.nextInt();
			int num[] = new int[n];
			
			for (int j = 0; j < n; j++) {
				num[j] = sc.nextInt();
			}
			
			Arrays.sort(num);
			
			System.out.print("#" + i);
			for (int j = 0; j < n; j++) {
				System.out.print(" " + num[j]);
			}
		}
		
		
		
	}
}
