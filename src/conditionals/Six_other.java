package conditionals;

import java.util.Scanner;

public class Six_other {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int m1 = sc.nextInt();
		int m2 = sc.nextInt();
		int addM = m1 + m2;
		
		if(addM > 59) {
			int mok = addM / 60;
			h = h + mok;
			
			int namuji = addM % 60;
			addM = namuji;
			
			if(h > 23) {
				int mok1 = h % 24;
				h = mok1;
			}
		}

		System.out.println(h + " " + addM);
		
		sc.close();
	}

}
