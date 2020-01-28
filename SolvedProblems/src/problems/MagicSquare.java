package problems;

import java.util.Scanner;

public class MagicSquare {
	
	static boolean findMagicSquare(int matrix[][], int n) {
		int sum_leading_diagonal = 0;
		int sum_secondary_diagonal = 0;
		for(int i = 0; i < n; i++) {
			sum_leading_diagonal += matrix[i][i];
		}
		for(int i = 0; i < n; i++) {
			sum_secondary_diagonal += matrix[i][n-1-i];
		}
		if(sum_leading_diagonal != sum_secondary_diagonal) {
			return false;
		}
		for(int i = 0; i < n; i++) {
			int row_sum = 0;
			for(int j = 0; j < n; j++) {
				row_sum += matrix[i][j];
			}
			if(sum_leading_diagonal != row_sum) {
				return false;
			}
		}
		for(int i = 0; i < n; i++) {
			int col_sum = 0;
			for(int j = 0; j < n; j++) {
				col_sum += matrix[i][j];
			}
			if(col_sum != sum_leading_diagonal) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int mat[][] = new int[n][n];
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				mat[i][j] = scanner.nextInt();
			}
		}
		boolean result = findMagicSquare(mat, n);
		if(result == true) {
			System.out.println("yes");
		}
		else {
			System.out.println("no");
		}
		scanner.close();
	}
}
