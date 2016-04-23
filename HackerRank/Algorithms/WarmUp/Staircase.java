package WarmUp;

import java.io.*;
import java.util.*;

public class Staircase {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num;
		num = in.nextInt();

		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num; j++) {
				if (j + 1 <= num - i - 1)
					System.out.print(" ");
				else
					System.out.print("#");
			}
			System.out.println();
		}

	}
}