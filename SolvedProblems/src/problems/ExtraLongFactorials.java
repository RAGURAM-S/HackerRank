package problems;

import java.math.BigInteger;
import java.util.Scanner;

public class ExtraLongFactorials {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		BigInteger number = BigInteger.valueOf(1);
		if(num <= 1) {
			number = BigInteger.valueOf(1);
		}
		else {
			for(int i = 1; i <= num; i++) {
				number = number.multiply(BigInteger.valueOf(i));
			}
		}
		System.out.println(number);
	}
}
