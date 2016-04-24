package Implementation;

import java.util.Scanner;

public class SherlockAndTheBeast {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num;
		num = in.nextInt();
		
		for(int i=0;i<num;i++){
			int numOfDigits = in.nextInt();
			int maxFives	= -1; 
			for(int j=0; j<=(numOfDigits/3);j++){
				if((numOfDigits-(j*3)) % 5 == 0){
					maxFives = j*3;
				}
			}
			if(maxFives == -1){
				System.out.println(-1);
			}else{
				for(int j=0; j<maxFives; j++){
					System.out.print("5");
				}
				for(int j=0; j<(numOfDigits-maxFives); j++){
					System.out.print("3");
				}
				System.out.println();
			}
		}
	}
}