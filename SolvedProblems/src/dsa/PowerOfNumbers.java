package dsa;

import java.util.Scanner;

public class PowerOfNumbers {
	static final long modulo = 1000000007;
	static long reverseNumber(long number, long reverse) {
		if(number <= 0) {
			return reverse;
		}
		reverse = reverse*10 + number%10;
		return reverseNumber(number/10, reverse);
	}
	static long power(long number, long reverse) {
		if(reverse == 0) {
			return 1;
		}
		return (number) * power(number, reverse-1)%modulo;
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		long number = scanner.nextLong();
		long reverse = reverseNumber(number, 0);
		long result = power(number, reverse);
		System.out.println(result);
		scanner.close();
	}
}
