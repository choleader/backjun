package conditionals;

import java.util.Scanner;

public class Two {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int score = sc.nextInt();
		
		if(score > 100) {
			System.out.println("100 이하의 점수를 입력하세요.");
		}
		else if(score > 89) {
			System.out.println("A");
		}
		else if(score > 79) {
			System.out.println("B");
		}
		else if(score > 69) {
			System.out.println("C");
		}
		else if(score > 59) {
			System.out.println("D");
		}
		else if(score > -1) {
			System.out.println("F");
		}
		else if(score < 0) {
			System.out.println("0 이상의 점수를 입력하세요.");
			
		}

	}

}
