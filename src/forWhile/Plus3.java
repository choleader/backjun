package forWhile;

import java.util.Scanner;

public class Plus3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int total = sc.nextInt();
		int num = sc.nextInt();
		int sum = 0;
		int ssum = 0;
		
		for(int i = 0; i < num; i++) {
			int price = sc.nextInt();
			int count = sc.nextInt();
			sum = price * count;
			ssum += sum;
		}
		
		String ToTotal = (total == ssum) ? "Yes" : "No";
		System.out.println(ToTotal);
		

	}

}
