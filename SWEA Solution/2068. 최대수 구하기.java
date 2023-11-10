import java.util.Scanner;
import java.lang.Math;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T=sc.nextInt();
		
		for(int test_case = 1; test_case <= T; test_case++)
		{
			int num[] = new int[10];
			
			for (int i = 0; i < 10; i++) {
				num[i] = sc.nextInt();
			}
			
			int max = 0;
			for (int i = 0; i < 10; i++) {
				if (max < num[i]) {
					max = num[i];
				}
			}
			
			System.out.println("#" + test_case + " " + max);
		}
	}
	/*
	 * Scanner sc = new Scanner(System.in);
		int T=sc.nextInt();
		for(int i=0;i<T;i++) {
			int num[] = new int[10];
			int max = 0;
			
			for (int i = 0; i < 10; i++) {
				num[i] = sc.nextInt();
				if (max < num[i]) {
					max = num[i];
				}
			}
		}


	 */
}