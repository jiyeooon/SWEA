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
			int num = sc.nextInt();
			String result = "";
			int enter = 0;
			
			for (int j = 0; j < num; j++) {
				char[] c = new char[num];
				String s = sc.next();
				c[j] = s.charAt(0);
				
				int count = sc.nextInt();
								
				for (int k = 0; k < count; k++) {
					result += c[j];
					enter++;
					if (enter == 10) {
						result += "\n";
						enter = 0;
					}
				}
			}
			
			System.out.println("#" + i + "\n" + result);
			
		}
	}
}