

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);


		int h = scanner.nextInt();
		int m = scanner.nextInt();

		if (h == 0 && m > 45) {
			h = 0;
			m = m - 45;
			System.out.println(h + " " + m);
		} else if (h == 0 && m < 45) {
			h = 23;
			m = 60 - (45 - m);
			System.out.println(h + " " + m);
		} else if (h > 0 && m >= 45) {
			m = m - 45;
			System.out.println(h + " " + m);
		} else if (h > 0 && m < 45) {
			h = h - 1;
			m = 60 - (45 - m);
			System.out.println(h + " " + m);
		} else if (h == 0 && m == 45) {
			h = 0;
			m = 0;
			System.out.println(h + " " + m);
		}
	}
}
