package forWhile;

import java.util.Scanner;

public class Last {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int copy = N;
		int count = 0;
		sc.close();
			
		while(true) {
			N = ((N % 10) * 10) + (((N / 10) + (N % 10)) % 10);
			count++;
			
			if(N == copy) {
				break;
			}
		}
		System.out.println(count);
	}

}
