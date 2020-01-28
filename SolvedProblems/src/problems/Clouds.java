package problems;

import java.util.Scanner;

public class Clouds {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int size = scanner.nextInt();
		int array[] = new int[size];
		for(int i = 0; i < size; i++) {
			array[i] = scanner.nextInt();
		}
		int steps = 0;
		int i = 0;
		if(size == 2) {
			steps = 1;
		}
		else {
			while(i < size){
				if(i == size - 1) {
					break;
				}
				if(array[i + 2] != 1) {
					i = i + 2;
					steps++;
					if(i == size - 2) {
						steps++;
						break;
					}
				}
				else {
					i++;
					steps++;
				}
			}
		}
		System.out.println(steps);
	}
}
