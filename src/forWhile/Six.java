package forWhile;

import java.util.Scanner;

public class Six {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		for(int i = 0; i < num; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			if((a < 10 &&  b <10) && (a > 0 && b > 0)) {
				int sum = a + b;
				System.out.println("Case #"+(i+1)+": "+ sum );
			}
			else {
				if((a > 10 || b >10) || (a < 1 || b < 1)) {
					System.out.println("1 이상 10 미만의 수를 입력하세요.");
				}
			}
		}
		sc.close();
	}

}
