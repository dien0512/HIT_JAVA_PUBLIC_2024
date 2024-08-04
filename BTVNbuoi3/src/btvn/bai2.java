package btvn;

import java.util.Scanner;

public class bai2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		if(LaDayDoiXung(str)) {
			System.out.println(str.toUpperCase());
		}
		else {
			System.out.println(str.toLowerCase());
		}
	}
	private static boolean LaDayDoiXung( String str) {
		int l = 0;
		int r = str.length() - 1;
		while(l < r) {
			if(str.charAt(l) != str.charAt(r)) {
				return false;
			}
			++l;
			--r;
		}
		return true;
	}

}
