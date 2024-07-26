package btvn;

import java.util.Scanner;

public class bai3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int m = scanner.nextInt();
		int n = scanner.nextInt();
		int matrix[][] = new int[m][n];
		int h1 = 0;
		int h2 = m-1;
		int c1 = 0;
		int c2 = n-1;
		int dem = 1;
		while( h1 <= h2 && c1 <= c2) {
			for( int i = c1; i <= c2;i++) {
				matrix[h1][i] = dem;
				dem ++;
			}
			++h1;
			for( int i = h1; i <= h2; i++) {
				matrix[i][c2] = dem;
				dem++;
			}
			--c2;
			for( int i = c2; i >= c1; i--) {
				matrix[h2][i] = dem;
				dem++;
			}
			--h2;
			for( int i = h2; i >= h1; i--) {
				matrix[i][c1] = dem;
				dem++;
			}
			++c1;
			}
		for( int i = 0; i < m; i++) {
			for( int j = 0; j < n ; j++) {
				System.out.print(matrix[i][j] +" ");
			}
			System.out.println("\n");
		}
		
	}
}

