package Implementation;

import java.util.Scanner;

public class FindDigits {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int testCases = in.nextInt();
		
		for(;testCases > 0; testCases--){
			int number = in.nextInt();
			String num = Integer.toString(number);
			int count  = 0;
			for(int j=0; j<num.length(); j++){
				int a =Integer.parseInt(num.charAt(j)+"");
				if(a != 0 && number % a == 0){
					count++;
				}
			}
			System.out.println(count);
		}
	}
}