package dsa;

import java.util.Scanner;

public class RecursionExplained {
	
	static void printNum(int num) {
		if(num < 1) {
			return;
		}
		else {
			System.out.println(num);
			printNum(num-1);
			System.out.println(num);
		}
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		printNum(number);
		scanner.close();
	}
}
