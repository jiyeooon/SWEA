import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		
		int tc = sc.nextInt();
		
		for(int i = 1; i <= tc; i++) {
			int arr[] = new int[10];
			double result = 0;
			
			for (int j = 0; j < arr.length; j++) {
				arr[j] = sc.nextInt();
			}
			
			Arrays.sort(arr);
			
			for(int j = 0; j < arr.length;j++) {
				result += arr[j];
			}
			
			result -= arr[0] + arr[9];
			result /= 8;
			
			System.out.println("#" + i + " " + Math.round(result));
		}
	}
}