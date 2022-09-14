package forWhile;

import java.util.Scanner;

public class Eleven {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			int sum = A + B;
			
			if ((A < 10 && B < 10) && (A > 0 && B > 0)) {
				System.out.println(sum);
			}
			else {
				break;
			}
		}
		sc.close();
	}
	
}