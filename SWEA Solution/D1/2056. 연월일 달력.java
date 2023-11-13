import java.util.Arrays;
import java.util.Scanner;
import java.lang.Math;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		int daysOfMonth[] = {31,28,31,30,31,30,31,31,30,31,30,31}; 
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        
        for(int i = 1; i <= T; i++) {
        	String s = sc.next();
        	int month = Integer.valueOf(s.substring(4,6));
        	int day = Integer.valueOf(s.substring(6,8));
        	String result = "-1";
        	
        	if (1 <= month && month <= 12 && 1 <= day && day<=daysOfMonth[month-1]) {
        		result = String.format("%s/%s/%s", s.substring(0,4), s.substring(4,6), s.substring(6,8));
        	}
        	System.out.println("#" + i + " " + result);
        }
		
	}
}