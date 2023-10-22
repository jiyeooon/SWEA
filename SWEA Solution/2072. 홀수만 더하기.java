import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
		
		int output = 0;
        
        int input[][] = new int[T][10];
        
        for(int i = 0; i < T; i++) {
            for (int j = 0; j < 10; j++) {
                input[i][j] = sc.nextInt();
            }
        }

		for(int test_case = 1; test_case <= T; test_case++)
		{
            for (int j = 0; j < 10; j++) {
               		if (input[test_case-1][j] % 2 == 1) {
                		output += input[test_case-1][j];
            		}
            	}
            System.out.println("#" + test_case + " " + output);
            output = 0;
        }

	}

}
