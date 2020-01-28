package dsa;

import java.util.Scanner;

public class NoOfDigits {
	static int digits = 0;
	public static int countDigits(int num) {
		if(num <= 0) {
			return digits;
		}
		else {
			digits++;
			return countDigits(num/10);
		}
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		int digits = countDigits(number);
		System.out.println(digits);
		scanner.close();
	}
}
