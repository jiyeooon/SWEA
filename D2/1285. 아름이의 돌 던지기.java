import java.util.Scanner;
import java.lang.Math;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int tc = sc.nextInt();
		
		for (int i = 0; i < tc; i++) {
			int num = sc.nextInt();
			int arr[] = new int[num];
			
			int min = 100000;
			int count = 0;
			
			for (int n = 0; n < num; n++) {
				arr[n] = Math.abs(sc.nextInt());
				
				if(min > arr[n]) {
					min = arr[n];
				}
			}
			
			for(int j = 0; j < num; j++) {
				if (min == arr[j]) {
					count++;
				}
			}
			
			System.out.println("#" + (i+1) + " " + min + " " + count);
			
		}
		
		
	}
}
