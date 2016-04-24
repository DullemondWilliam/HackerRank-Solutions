package Implementation;

import java.util.Scanner;

public class ServiceLane {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int length	  = in.nextInt();
		int testCases = in.nextInt();
		
		int[] freeway = new int[length];
		for(int i=0; i<length; i++){
			freeway[i] = in.nextInt();
		}
		
		for(;testCases > 0; testCases--){
			int start = in.nextInt();
			int end   = in.nextInt();
			int size  = 3;
			for(int i=start; i<=end; i++){
				if(size > freeway[i]){
					size = freeway[i];
				}
			}
			System.out.println(size);
		}
	}
}