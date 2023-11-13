import java.util.Scanner;
import java.lang.Math;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T=sc.nextInt();
		
		int[][] num = new int[T][10];
		
		for (int i = 0; i < T; i++) {
			for (int j = 0; j < 10; j++) {
				num[i][j] = sc.nextInt();
			}
		}
		
		for(int test_case = 1; test_case <= T; test_case++)
		{
			float avg = 0;
			for (int j = 0; j < 10; j++) {
				avg += num[test_case-1][j];
			}
			System.out.println("#" + test_case + " " + Math.round(avg/10));
			
		}
		
		/*
		 Scanner sc = new Scanner(System.in);
		 int T = sc.nextInt();
		 for (int t = 1; t <= T; t++) {
		 	double sum = 0;
		 	for (int i = 0; i < 10; i++) {
		 		sum += sc.nextInt();
		 	}
		 	sum = Math.round(sum / 10);
		 	System.out.println("#" + t + " " + (int)sum);
		 */
	}
}