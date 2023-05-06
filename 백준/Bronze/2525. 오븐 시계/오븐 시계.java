import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		int h = scanner.nextInt();
		int m = scanner.nextInt();
		int c = scanner.nextInt();

		int fh = (h + (m + c) / 60) % 24;
		int fm = (m + c) % 60;

		System.out.println(fh + " " + fm);

	}

}
