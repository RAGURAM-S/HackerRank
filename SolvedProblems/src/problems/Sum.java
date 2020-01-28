package problems;

import java.util.Scanner;

public class Sum {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int size = scanner.nextInt();
		int array[] = new int[size];
		boolean flag = false;
		for(int i = 0; i < size; i++) {
			array[i] = scanner.nextInt();
		}
		if(size == 1) {
			flag = true;
		}
		else {
			for(int k = 0; k < size-1; k++) {
				int left_sum = 0;
				int right_sum = 0;
				for(int i = 0; i < k; i++) {
					left_sum = left_sum + array[i];
				}
				for(int j = k+1; j < size; j++) {
					right_sum = right_sum + array[j];
				}
				if(left_sum == right_sum) {
					flag = true;
					break;
				}
			}
		}
		if(flag == true) {
			System.out.println("YES");
		}
		else {
			System.out.println("NO");
		}
	}
}
