package forWhile;

import java.util.Scanner;

public class Five {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		if(T <= 1000000 && T > 0) {
			for(int i = 0; i < T; i++) {
				int a = sc.nextInt();
				int b = sc.nextInt();
				if ((a > 0 && a <= 1000)&&(b > 0 && b <= 1000)) {
					int result = a + b;
					System.out.println(result);
				}
			}
		}
		else {
			System.out.println("1이상 1000000이하 숫자를 입력하시오");
		}
		sc.close();
	}

}
