package problems;

import java.util.Scanner;

public class SumE {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int size = scanner.nextInt();
		int array[] = new int[size];
		int total_sum = 0;
		int left_sum = 0;
		boolean flag = false;
		for(int i = 0; i < size; i++) {
			array[i] = scanner.nextInt();
			total_sum = total_sum + array[i];
		}
		for(int i = 0; i < size; i++) {
			if(left_sum == total_sum - left_sum - array[i]) {
				flag = true;
				break;
			}
			left_sum = left_sum + array[i];
		}
		if(flag == true) {
			System.out.println("YES");
		}
		else {
			System.out.println("NO");
		}
	}
}
