package dsa;

import java.util.Scanner;

public class Josephus{
	static int kill(int n, int k) {
		if(n == 1) {
			return 0;
		}
		return (kill(n-1, k)+k)%n;
	}
	static int josephus(int n, int k) {
		return kill(n, k) + 1;
	}
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		int n = scanner.nextInt();
		int k = scanner.nextInt();
		int result = kill(n, k);
		int resultant = josephus(n, k);
		System.out.println(result);
		System.out.println(resultant);
		scanner.close();
	}
}