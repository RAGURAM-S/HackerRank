package dsa;

import java.util.Scanner;

public class RopeCuts {
	static int findMaxCuts(int n, int a, int b, int c) {
		if(n == 0) {
			return 0;
		}
		if(n < 0) {
			return -1;
		}
		int result = Math.max(findMaxCuts(n-a, a, b, c), Math.max(findMaxCuts(n-b, a, b, c), findMaxCuts(n-c, a, b, c)));
		if(result == -1) {
			return -1;
		}
		return result+1;
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		int noOfCuts = findMaxCuts(n, a, b, c);
		System.out.println(noOfCuts);
		scanner.close();
	}
}
