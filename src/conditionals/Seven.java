package conditionals;

import java.util.Scanner;

public class Seven {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int cashPrize = 0;
		int same = 0;
		int max = 0;
//		세 수가 같을 때
		if(a == b && b == c) {
			cashPrize = 10000 + a * 1000;
		}
//		두개의 수만 같을 때
		else if((a == b && b != c) || (b == c && c != a) || (a == c && c!= b)){
			if(a == b) {
				same = a;
			}
			else if(b == c) {
				same = b;
			}
			else if(a == c){
				same = c;
			}
			cashPrize = 1000 + same * 100;
		}
//		세 수가 다를 때
		else if(a != b && b != c) {
			if((a > b && b > c) || (a > c && c > b)) {
				max = a;
			}
			else if((b > c && c > a) || (b > a && a > c)) {
				max = b;
			}
			else if((c > b && b > a) || (c > a && a > b)) {
				max = c;
			}
			cashPrize = max * 100;
		}
		System.out.println(cashPrize);
		sc.close();
	}
}
