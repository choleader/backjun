package forWhile;

import java.util.Scanner;

public class Seven {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		for(int i = 0; i < num; i++) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			int C = A + B;
			
			System.out.println("Case #"+(i+1)+": "+ A + " + "+ B+ " = " + C);
		}
		sc.close();
	}
	

}
