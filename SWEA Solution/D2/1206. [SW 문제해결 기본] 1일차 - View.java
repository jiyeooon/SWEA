import java.io.IOException;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int tc = 10;
		
		for (int t = 1; t <= tc; t++) {
			int n = sc.nextInt();
			int arr[] = new int[n];
			int result = 0;
			
			for (int i = 0; i < n; i++) {
				arr[i] = sc.nextInt();
			}
			
			for (int i = 2; i < arr.length-2; i++) {
				int L = Math.max(arr[i-1], arr[i-2]);
				int R = Math.max(arr[i+1], arr[i+2]);
				
				if (arr[i] < L || arr[i] < R) {
					continue;
				}
				
				int tmp = Math.max(L, R);
				result += arr[i] - tmp;
			}
			
			System.out.println("#" + t + " " + result);
			
		}
		sc.close();
	}
	

}