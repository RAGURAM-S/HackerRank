package dsa;

import java.util.Scanner;

public class Power {
	static int recursivePower(int num, int pow) {
		if(pow == 0) {
			return 1;
		}
		return num*recursivePower(num, pow-1);
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		int power = scanner.nextInt();
		int result = recursivePower(number, power);
		System.out.println(result);
		scanner.close();
	}
}
