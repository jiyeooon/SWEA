import java.util.Arrays;
import java.util.Scanner;
import java.lang.Math;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T=sc.nextInt();
		
		int[] arr = new int[T];
		
		for (int i = 0; i < T; i++) {
			arr[i] = sc.nextInt();
			}
		Arrays.sort(arr);
		
		System.out.println(arr[arr.length/2]);
		
	}
}