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
			int count = 0;
			int num =n;
			
			Set<String> set = new HashSet<>();
			
			while(set.size() < 10) {
				String s = num + "";
				for(int j = 0; j < s.length(); j++) {
					set.add(s.substring(j, j+1));
				}
				
				num+=n;
				count++;		
			}
			
			System.out.println("#" + i + " " + count * n);	
		}
		
	}
}