import java.util.Scanner;

public class PowNum {
	public static void main(String args[]) {
		int res=1;
		Scanner s = new Scanner(System.in);
		int base = s.nextInt();
		int expon = s.nextInt();
		while (expon > 0) {
		 res = base * res ;
			expon--;
		}
		System.out.println("power of value" + "" + res);
	}

}
