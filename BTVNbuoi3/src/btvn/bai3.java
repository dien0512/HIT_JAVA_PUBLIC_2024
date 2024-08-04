package btvn;

import java.util.Random;
import java.util.Scanner;


public class bai3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		int a = random.nextInt(11);
		int b = random.nextInt(11);
		int sum = a+b;
		int c;
		boolean correct = random.nextBoolean();
		if(correct == true) {
			c = sum;
		}
		else {
			do {
				c = random.nextInt(21);
			}
			while( c == sum);
		}
		System.out.println(a + " + " + b + " = " + c);
		System.out.printf("Phép tính đúng hay sai (Y/N): ");
		String a1 = scanner.nextLine().toUpperCase();
		boolean iscorrect = (c == sum);
		if( (iscorrect && a1.equals("Y")) || (!iscorrect && a1.equals("N")) ){
			System.out.println("Chính xác!");
		}
		else {
			System.out.println("Sai!");
		}
	}
}




