import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		
		for (int i = 1; i <= tc; i++) {
			int n = sc.nextInt();
			int a = 0,b = 0,c = 0,d = 0,e = 0;
			
			while (n != 1) {
				if (n % 2 == 0) {
					n /= 2;
					a++;
				} else if (n % 3 == 0) {
					n /= 3;
					b++;
				} else if (n % 5 == 0) {
					n /= 5;
					c++;
				} else if (n % 7 == 0) {
					n /= 7;
					d++;
				} else if (n % 11 == 0) {
					n /= 11;
					e++;
				} else {
					break;
				}
			}
			
			System.out.println("#" + i + " "+ a + " "+ b + " "+ c + " "+ d + " "+ e);
			
			
		}
		
	}
}