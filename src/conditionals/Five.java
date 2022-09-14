package conditionals;

import java.util.Scanner;

public class Five {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int M = sc.nextInt();
		int resultM = 0;
		int resultH = 0;
		
		if(M > 45 && M < 60) {
			resultM = M - 45;
		}
		else if(M < 45 && M > 0) {
			resultM = M + 15;
			resultH = H - 1;
		}
		
		System.out.println(resultH+" "+ resultM);

		
		sc.close();
		
	}
	
	

}
