package btvn;

import java.util.Scanner;

public class bai1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		float r = scanner.nextFloat();
		double ChuVi = 2 * 3.14 * r;
		double DienTich = 3.14 * r * r;
		System.out.printf("%.3f\n",ChuVi);
		System.out.printf("%.3f\n",DienTich);
	}

}
