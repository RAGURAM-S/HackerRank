package problems;

class ShortestPath{
	
	static final int rows = 10;
	static final int cols = 10;
	
	static boolean isSafe(int matrix[][], int visited[][], int x, int y) {
		return (matrix[x][y] != 0 && visited[x][y] == 0);
	}
	
	static boolean isValid(int x, int y) {
		return (x < rows && y < cols && x >= 0 && y >= 0);
	}
	
	static int findShortestPath(int matrix[][], int visited[][], int i, int j, 
								int x, int y, int min_dist, int dist) {
		if(i == x && j == y) {
			return Integer.min(min_dist, dist);
		}
		visited[i][j] = 1;
//		bottom move
		if (isValid(i+1, j) && isSafe(matrix, visited, i+1, j)) {
			min_dist = findShortestPath(matrix, visited, i+1, j, x, y, min_dist, dist+1);
		}
//		right move
		if (isValid(i, j+1) && isSafe(matrix, visited, i, j+1)) {
			min_dist = findShortestPath(matrix, visited, i, j+1, x, y, min_dist, dist+1);
		}
//		top move
		if (isValid(i-1, j) && isSafe(matrix, visited, i-1, j)) {
			min_dist = findShortestPath(matrix, visited, i-1, j, x, y, min_dist, dist+1);
		}
//		left move
		if (isValid(i, j-1) && isSafe(matrix, visited, i, j-1)) {
			min_dist = findShortestPath(matrix, visited, i, j-1, x, y, min_dist, dist+1);
		}
//		backtracking 
		visited[i][j] = 0;
		
		return min_dist;
	}
	
	public static void main(String[] args) {
		int matrix[][] = 
			{
					{ 1, 1, 1, 1, 1, 0, 0, 1, 1, 1 },
					{ 0, 1, 1, 1, 1, 1, 0, 1, 0, 1 },
					{ 0, 0, 1, 0, 1, 1, 1, 0, 0, 1 },
					{ 1, 0, 1, 1, 1, 0, 1, 1, 0, 1 },
					{ 0, 0, 0, 1, 0, 0, 0, 1, 0, 1 },
					{ 1, 0, 1, 1, 1, 0, 0, 1, 1, 0 },
					{ 0, 0, 0, 0, 1, 0, 0, 1, 0, 1 },
					{ 0, 1, 1, 1, 1, 1, 1, 1, 0, 0 },
					{ 1, 1, 1, 1, 1, 0, 0, 1, 1, 1 },
					{ 0, 0, 1, 0, 0, 1, 1, 0, 0, 1 },
			};
		int visited[][] = new int[rows][cols];
		int minimum_dist = findShortestPath(matrix, visited, 0, 0, 
							9, 9, Integer.MAX_VALUE, 0);
		if(minimum_dist != Integer.MAX_VALUE) {
			System.out.println(minimum_dist);
		}
		else {
			System.out.println("no possible path available");
		}
	}
}