import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int rev = 0;
		int n = s.nextInt();
		int f = n;
		// String st=""+n;
		for (int i = 0; i < 100; i++) {
			if (n != 0) {
				int a = n % 10;
				n = n / 10;
				rev = rev * 10 + a;
			}

		}
		if (rev == f) {
			System.out.println("palindrome");
		} else
			System.out.println("not");
		s.close();
	}
}
