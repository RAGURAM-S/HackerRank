package problems;

import java.util.Scanner;

public class Prisoner{
	static long value = 0;
	static long findPrisoner(long num, long candy, long start) {
		value = (candy + start - 1)%num;
		if(value == 0) {
			value = num;
		}
		return value;
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		long num = scanner.nextLong();
		long candy = scanner.nextLong();
		long start = scanner.nextLong();
		long result = findPrisoner(num, candy, start);
		System.out.println(result);
		scanner.close();
	}
}