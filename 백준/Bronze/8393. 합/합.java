import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		int n = scanner.nextInt();
		int sum = 0;
		for (int i = 1; i < n + 1; i++) {
			sum = sum + i;
		}
		System.out.println(sum);

	}
}
