package problems;

import java.util.Scanner;

public class BeautifulNumbers {
	static long reverseDigits(long num) {
		long rev = 0;
		while(num > 0) {
			rev = (rev*10) + (num%10);
			num = num/10;
		}
		return rev;
	}
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		long i = scanner.nextLong();
		long j = scanner.nextLong();
		long k = scanner.nextLong();
		long difference = 0;
		int count = 0;
		for(long x = i; x <= j; x++) {
			difference = Math.abs(x - reverseDigits(x));
			if(difference%k == 0) {
				count++;
			}
		}
		System.out.println(count);
		scanner.close();
	}
}
