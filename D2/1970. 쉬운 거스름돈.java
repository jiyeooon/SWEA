import java.util.Scanner;
import java.lang.Math;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int tc = sc.nextInt();
		for (int i = 1; i <= tc; i++) {
			int n = sc.nextInt();
			
			System.out.print("#" + i + "\n");
			
			System.out.print(n/50000 + " ");
			
			System.out.print(n%50000/10000 + " ");
			
			n %= 10000;
			
			
			System.out.print(n/5000 + " ");
			
			System.out.print(n%5000/1000 + " ");
			
			n %= 1000;
			
			
			System.out.print(n/500 + " ");
			
			System.out.print(n%500/100 + " ");
			
			n %= 100;
			
			
			System.out.print(n/50 + " ");
			
			System.out.print(n%50/10 + "\n");
			
			
			
			
			
		}
		
		
	}
}
