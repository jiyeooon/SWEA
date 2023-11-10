import java.util.Scanner;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int P = sc.nextInt();
		int K = sc.nextInt();
		
		int result;
		
		if (K <= P) {
			result = P - K + 1;
		} else {
			result = (1000 + P) - K + 1;
		}
		
		System.out.print(result);
	}
}