import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int tc = sc.nextInt();
		int month[] = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

		for (int i = 1; i <= tc; i++) {
			int m1 = sc.nextInt();
			int d1 = sc.nextInt();
			int m2 = sc.nextInt();
			int d2 = sc.nextInt();

			int day1 = 0;
			int day2 = 0;
			
			//for문에서 m1 - 1 안하고 그냥 m1까지 반복하면 해당 월까지 계산됨 -> -1 해주기

			for (int j = 0; j < m1 - 1; j++) {
				day1 += month[j];
			}
			day1 += d1;

			for (int j = 0; j < m2 - 1; j++) {
				day2 += month[j];
			}
			day2 += d2;

			System.out.println("#" + i + " " + (day2 - day1 + 1));
			
			
			/*
			int daysCount = 0;

			for (int m = m1; m < m2; m++) {
				daysCount += month[m - 1];
			}

			daysCount += d2 - d1 + 1;

			System.out.println("#" + i + " " + daysCount);
			*/

		}
	}
}
