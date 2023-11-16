import java.util.Scanner;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		
		for (int i = 1; i <= tc; i++) {
			int n = sc.nextInt();
			int result = 0;
			for (int j = 1; j <=n; j++) {
				if (j % 2 == 0) {
					result -= j;
				} else {
					result += j;
				}
			}
			System.out.println("#" + i + " " + result);
			
		}
	}
}