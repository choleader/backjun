package forWhile;

import java.util.Scanner;

public class Gugudan {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		if(i <= 0 || i >= 10)	{
			System.out.println("2�̻� 9���� ���ڸ� �Է��ϼ���.");
		}
		else {
			for(int j = 1; j < 10; j++) {
				int result = i * j;
				System.out.println( i +" * " + j + " = " + result);
			}
		}
		
	}

}
