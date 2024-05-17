package swea;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Iterator;
import java.util.StringTokenizer;

public class Solution {
	
	static int cnt(int a) {
		int tmp = a;
		int count = 0;
		
		while(tmp>0) {
			int mod = tmp%10;
			
			if (mod == 3 || mod == 6 || mod ==9) {
				count++;
			}
			tmp /= 10;
		}
		return count;
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		int n = 1;
		int result = 0;
		
		for (int i = 0; i < num; i++) {
			result = cnt(n);
			
			if (result == 0) {
				System.out.print(n + " ");
			} else if(result == 1) {
				System.out.print("- ");
			}
			else if(result == 2) {
				System.out.print("-- ");
			}else {
				System.out.print("--- ");
			}
			n++;
		}
	}
}

//24,216 kb, 104 ms