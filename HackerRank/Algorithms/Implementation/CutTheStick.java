package Implementation;

import java.util.Scanner;

public class CutTheStick {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int length = in.nextInt();
		
		int[] sticks = new int[length];
		for(int i=0; i<length; i++){
			sticks[i] = in.nextInt();
		}
		
		for(;;){
			int smallestStick = 1001;
			for(int i=0; i<length; i++){
				if(sticks[i] != 0 && sticks[i] < smallestStick){
					smallestStick = sticks[i];
				}
			}
			int count = 0;
			for(int i=0; i<length; i++){
				if(sticks[i]>0){
					count++;
					sticks[i] -= smallestStick;
				}
			}
			if(count > 0){
				System.out.println(count);
			}else{
				break;
			}
		}
	}
}
