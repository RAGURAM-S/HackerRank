package problems;

import java.util.Scanner;

public class SubArray{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	    int size = scanner.nextInt();
		int sum = scanner.nextInt();
		int array[] = new int[size];
		boolean flag = false;
		for(int i = 0; i < size; i++) {
			array[i] = scanner.nextInt();
		}
		for(int i = 0; i < size-1; i++) {
			int curr_sum = array[i];
			if(curr_sum == sum){
			    System.out.println((i+1) + " " + (i+1));
			    break;
			}
			for(int j = i+1; j < size; j++) {
			    if(array[j] == sum){
			        flag = true;
			        System.out.println((j+1) + " " + (j+1));
			        break;
			    }
				if(curr_sum < sum) {
					curr_sum = curr_sum + array[j];
				}
				if(curr_sum == sum) {
					flag = true;
					System.out.println((i+1) + " " + (j+1));
					break;
				}
				if(curr_sum > sum) {
					break;
				}
			}
			if(flag == true) {
				break;
			}
		}
		if(flag == false) {
			System.out.println("-1");
		}
	}
}