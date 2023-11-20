import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int tc = sc.nextInt();
		
		for (int i = 0; i < tc; i++) {
			int num = sc.nextInt();
			int arr[] = new int[101];
			int max = 0;
			int f = 0;
			
			for (int j = 0; j < 1000; j++) {
				int a = sc.nextInt();
				arr[a] += 1;
			}
			
			for (int k = 0; k < 100; k++) {
				if (max <= arr[k]) {
					max = arr[k];
					f = k;
				}
				
			}
			System.out.println("#" + num + " " + f);		
		}
	}
}
