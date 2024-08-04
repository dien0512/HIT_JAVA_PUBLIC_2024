package btvn;

import java.util.Scanner;

public class bai1 {
	private static final String SQUARE = "Square";
    private static final String TRIANGLE = "Triangle";
    private static final String CIRCLE = "Circle";


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		if (str.equals(SQUARE)){
	    	int a = scanner.nextInt();
	    	int s = (int)Math.pow(a, 2);
	    	System.out.println(s);
	    }
	    else if(str.equals(TRIANGLE)) {
	    	int b = scanner.nextInt();
	    	int c = scanner.nextInt();
	    	int d = scanner.nextInt();
	    	if ((b+c > d) && (b+d > c) && (c+d > b)) {
	    		double p = (b + c + d) / 2.0;
	    		System.out.printf("%.2f", Math.sqrt(p*(p-b)*(p-c)*(p-d)));
	    	}
	    	else {
	    		System.out.println(-1);
	    	}
	    }
	    else if(str.equals(CIRCLE)) {
	    	int r = scanner.nextInt();
	    	System.out.printf("%.2f", Math.PI * Math.pow(r, 2));
	    	
	    }
	    else {
	    	System.out.println("Hình dạng không hợp lệ!");
	    }
	}
		

}
