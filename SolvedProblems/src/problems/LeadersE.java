package problems;

import java.util.Scanner;

public class LeadersE {
	static void printLeaders(int array[]) {
		int current_leader = array[array.length-1];
		System.out.println(current_leader);
		for(int i = array.length-2; i >= 0; i--) {
			if(array[i] > current_leader) {
				current_leader = array[i];
				System.out.println(current_leader);
			}
		}
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int size = scanner.nextInt();
		int array[] = new int[size];
		for(int i = 0; i < size; i++) {
			array[i] = scanner.nextInt();
		}
		printLeaders(array);
		scanner.close();
	}
}
