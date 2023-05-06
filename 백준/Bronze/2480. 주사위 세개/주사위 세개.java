import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		int d1 = scanner.nextInt();
		int d2 = scanner.nextInt();
		int d3 = scanner.nextInt();

		int cash = 0;

		if (d1 == d2 && d2 == d3 && d3 == d1) {
			cash = 10000 + d1 * 1000;
			System.out.println(cash);
		} else if ((d1 == d2 && d1 != d3) || (d2 == d3 && d1 != d3) || (d3 == d1 && d1 != d2)) {
			if (d1 == d2) {
				cash = 1000 + d1 * 100;
				System.out.println(cash);
			} else if (d2 == d3) {
				cash = 1000 + d2 * 100;
				System.out.println(cash);
			} else if (d1 == d3) {
				cash = 1000 + d1 * 100;
				System.out.println(cash);
			}

		} else if (d1 != d2 && d2 != d3 && d3 != d1) {
			if (d1 > d2 && d1 > d3) {
				cash = d1 * 100;
				System.out.println(cash);
			} else if (d2 > d1 && d2 > d3) {
				cash = d2 * 100;
				System.out.println(cash);
			} else if (d3 > d1 && d3 > d2) {
				cash = d3 * 100;
				System.out.println(cash);
			}
		}
	}

}
