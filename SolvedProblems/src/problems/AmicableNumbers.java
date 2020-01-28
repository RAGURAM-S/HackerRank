package problems;

import java.util.Scanner;

public class AmicableNumbers {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int m = scanner.nextInt();
		int n = scanner.nextInt();
		int sum1 = 0;
		int sum2 = 0;
		for(int i = 1; i <= m/2; i++) {
			if(m%i == 0) {
				sum1 = sum1 + i;
			}
		}
		for(int j = 1; j <= n/2; j++) {
			if(n%j == 0) {
				sum2 = sum2 + j;
			}
		}
		if(sum1 == n || sum2 == m) {
			System.out.println("1");
		}
		else {
			System.out.println("0");
		}
	}
}
