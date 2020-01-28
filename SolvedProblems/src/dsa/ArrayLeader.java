package dsa;

import java.util.Scanner;

public class ArrayLeader {
	static void findLeaders(int array[]) {
		int i;
		int j;
		for(i = 0; i < array.length-1; i++) {
			boolean flag = false;
			for(j = i+1; j < array.length; j++) {
				if(i < j) {
					flag = true;
					break;
				}
				continue;
			}
			if(flag == false) {
				System.out.println(array[i]);
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
		findLeaders(array);
		scanner.close();
	}
}
