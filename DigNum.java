import java.util.Scanner;

public class DigNum {
	public static void main(String args[]) {
		int i = 0;
		int n = 0;

		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		while (a > 0) {
			a = a / 10;
			i++;
		}
		System.out.println("count" + i);
	}
}
