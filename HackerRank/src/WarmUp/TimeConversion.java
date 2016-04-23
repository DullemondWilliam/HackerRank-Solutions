package WarmUp;

import java.util.Scanner;

public class TimeConversion {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String input;
		input = in.nextLine();

		if (input.charAt(8) == 'P') {
			String time = input.substring(0, 2);
			if (!input.substring(0, 2).equals("12")) {
				int fin = 12 + Integer.parseInt(time);
				time = Integer.toString(fin);
			}
			System.out.println(time + input.substring(2, 8));
		} else if (input.substring(0, 2).equals("12")) {
			System.out.println("00" + input.substring(2, 8));
		} else {
			System.out.println(input.substring(0, 8));
		}
	}
}
