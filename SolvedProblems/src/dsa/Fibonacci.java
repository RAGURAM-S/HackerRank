package dsa;

import java.util.Scanner;

public class Fibonacci {
	static long a = 0;
	static long b = 1;
	static long count = 0;
	static long term = 0;
	static long findTerm(long n) {
		if(count == n) {
			return term;
		}
		else {
			term = a+b;
			a = b;
			b = term;
			count++;
			return findTerm(n);
		}
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		long num = scanner.nextLong();
		long result = findTerm(num);
		System.out.println(result);
	}
}
