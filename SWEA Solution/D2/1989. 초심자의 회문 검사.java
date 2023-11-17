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
			String s = sc.next();
			char[] c = s.toCharArray();
			int result = 1;
			
			for (int j = 0; j < c.length/2; j++) {
				if (c[j] != c[c.length-1-j]) {
					result = 0;
				}
			}
			
			System.out.println("#" + i + " " + result);
		}
	}
}