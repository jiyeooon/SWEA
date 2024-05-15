package swea;

public class Solution {

	public static void main(String[] args) throws Exception {
		for(int i = 0; i <5; i++) {
			for(int j = 0;j < i; j++) {
				System.out.print("+");
			}
			System.out.print("#");
			
			for(int k = 4; k>i; k--) {
				System.out.print("+");
			}
			System.out.println();
		}
	}
}

//23,852 kb, 103 ms