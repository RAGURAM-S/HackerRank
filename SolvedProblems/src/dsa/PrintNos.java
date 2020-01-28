package dsa;

import java.util.Scanner;

public class PrintNos{
	
	static int n = 1;
	
	static void printNumbers(int num) {
		if(n <= num) {
			System.out.print(n + " ");
			n++;
			printNumbers(num);
		}
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		printNumbers(num);
	}
}