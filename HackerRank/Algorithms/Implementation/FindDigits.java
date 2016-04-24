package Implementation;

import java.util.Scanner;

public class FindDigits {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int testCases = in.nextInt();
		
		for(;testCases > 0; testCases--){
			int lower = in.nextInt();
			int upper = in.nextInt();
			int count = 0;
			
			int i = (int) Math.sqrt(lower);
			for(; i <= Math.sqrt(upper); i++){
				if(Math.pow(i,2) >= lower && Math.pow(i, 2) <= upper){
					count++;
				}
			}
			System.out.println(count);
		}
	}
}