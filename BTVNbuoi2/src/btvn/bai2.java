package btvn;

import java.util.Scanner;

public class bai2 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int a[] = new int[n];
		for( int i = 0; i < n; ++i) {
			a[i] = scanner.nextInt();
		}
		for( int i = 1; i < n; i += 2) {
			if( i > 0 && i < n-1) {
				a[i] = Math.abs(a[i+1] - a[i-1]) + a[i];
			}
			if( i == n - 1) {
					a[i] = a[i-1] + a[i];
			}
		}
		for( int i = 0; i < n; ++i) {
			System.out.print(a[i] + " ");
		}
	}

}