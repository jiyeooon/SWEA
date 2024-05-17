package swea;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Iterator;
import java.util.StringTokenizer;

public class Solution {
	static int arr[][];
	
	static int m,n;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int T = Integer.parseInt(br.readLine());
		
		for (int t = 1; t <= T; t++) {
			st = new StringTokenizer(br.readLine());
			
			m = Integer.parseInt(st.nextToken());
			n = Integer.parseInt(st.nextToken());
			
			int max = 0;
			
			arr = new int [m][m];
			
			for (int i = 0; i < m; i++) {
				st = new StringTokenizer(br.readLine());
				for (int j = 0; j < m; j++) {
					arr[i][j] = Integer.parseInt(st.nextToken());
				}
			}
			
			
			for (int r = 0; r < m-n+1; r++) {
				for (int c = 0; c < m-n+1; c++) {
					int sum = 0;
					for (int i = r; i < r+n; i++) {
						for (int j = c; j < c+n; j++) {
							sum += arr[i][j];
						}
					}
					max = Math.max(max, sum);
				}
			}
			
			System.out.println("#" + t + " " + max);
		}
	}
}

//23,468 kb, 109  ms