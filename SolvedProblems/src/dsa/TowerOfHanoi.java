package dsa;

public class TowerOfHanoi {
	static long moves = 0;
	static void moveDisc(int n, char source_rod, char dest_rod, char aux_rod) {
		if(n == 1) {
			System.out.println("Move disc " + n + " from rod " + source_rod + " to rod " + dest_rod);
			return;
		}
		moveDisc(n-1, source_rod, aux_rod, dest_rod);
		moves++;
		System.out.println("Move disc " + n + " from rod " + source_rod + " to rod " + dest_rod);
		moveDisc(n-1, aux_rod, dest_rod, source_rod);
		moves++;
	}
	public static void main(String[] args) {
		int n = 3;
		char source_rod = 'A';
		char aux_rod = 'B';
		char dest_rod = 'C';
		moveDisc(n, source_rod, dest_rod, aux_rod);
		moves++;
		System.out.println(moves);
	}
}
