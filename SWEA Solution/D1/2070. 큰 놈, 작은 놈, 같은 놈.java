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
			int a = sc.nextInt();
			int b = sc.nextInt();
			String s = "";
			
			if (a < b) {
				s = "<";
			} else if (a > b) {
				s = ">";
			} else {
				s = "=";
			}
			System.out.println("#" + test_case + " " + s);
		}
	}
}