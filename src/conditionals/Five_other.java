package conditionals;

import java.util.Scanner;

public class Five_other {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int M = sc.nextInt();
		int resultM = 0;
		int resultH = 0;
		
		if(H >= 0 && H <= 23) {
			if(M >= 45 && M < 60) {
				resultM = M - 45;
				resultH = H;
			}
			else if(M < 45 && M >= 0) {
				resultM = M + 15;
				if(H == 0) {
					resultH = 23;
				} else {
					resultH = H - 1;		
				}
			}
			System.out.println(resultH+" "+ resultM);
		}
		else {
			System.out.println("잘못된 숫자입니다.");
		}
		sc.close();
	}
}
