import java.util.Arrays;
import java.util.Scanner;
import java.lang.Math;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T=sc.nextInt();
		
		int sum = T/1000;
		sum += ((T%1000)/100) + ((T%100)/10) + (T%10);

		System.out.println(sum);
		
	}
}