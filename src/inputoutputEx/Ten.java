package inputoutputEx;

import java.util.Scanner;

public class Ten {

	public static void main(String[] args) {
		
		int K1 = 1;
		int Q1 = 1;
		int L1 = 2;
		int B1 = 2;
		int N1 = 2;
		int P1 = 8;
		
		Scanner sacnner = new Scanner(System.in);
		int K = sacnner.nextInt();
		int Q = sacnner.nextInt();
		int L = sacnner.nextInt();
		int B = sacnner.nextInt();
		int N = sacnner.nextInt();
		int P = sacnner.nextInt();
		
		System.out.println((K1-K)+" "+(Q1-Q)+" "+(L1-L)+" "+(B1-B)+" "+(N1-N)+" "+(P1-P));
	}

}
