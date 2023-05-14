import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		int n = scanner.nextInt();

		for (int i = 1; i <= n; i++) {
			if (i % 4 == 0) {
				System.out.print("long ");
			}
		}
		System.out.println("int");

	}

}
