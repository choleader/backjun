package conditionals;

import java.util.Scanner;

public class Three_other {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		
		
		int b = (year % 4 == 0) && (year % 100 != 0 || year % 400 ==0) ? 1 : 0;
		System.out.println(b);
		sc.close();

	}
}
