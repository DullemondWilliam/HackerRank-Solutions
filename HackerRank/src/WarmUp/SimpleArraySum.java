package WarmUp;

import java.util.*;

public class SimpleArraySum {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a;
		a = in.nextInt();
		int b = 0;

		for (int i = 0; i < a; i++) {
			b += in.nextInt();
		}

		System.out.println(b);
	}
}