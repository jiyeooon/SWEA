import java.util.Scanner;

class Solution
{
	public static void main(String args[]) throws Exception
	{
        Scanner sc = new Scanner(System.in);
        String T = sc.next();
        char[] cArr = T.toCharArray();

        for(int i = 0; i < T.length(); i++) {
        	System.out.print(cArr[i] - 64 + " ");
        }
	}
}