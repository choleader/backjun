package forWhile;

import java.util.Scanner;

public class Ten {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int X = sc.nextInt();
		int A = 0;
		
		for(int i = 0; i < N; i++) {
			A = sc.nextInt();
			if(A < X) {
				System.out.print(A+" ");
			}
		}
		
		sc.close();	
	}

	
}
