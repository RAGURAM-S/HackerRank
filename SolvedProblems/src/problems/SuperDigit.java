package problems;

import java.util.Scanner;

public class SuperDigit{
	
	static long digitSum(long number) {
		if(number == 0) {
			return 0;
		}
		if(number%9 == 0) {
			return 9;
		}
		else {
			return number%9;
		}
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		long num = scanner.nextLong();
		long count = scanner.nextLong();
		long result = digitSum(num);
		long resultant = digitSum(result*count);
		System.out.println(resultant);
	}
}