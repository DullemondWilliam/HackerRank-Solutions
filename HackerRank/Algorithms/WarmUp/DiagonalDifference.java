package WarmUp;

import java.io.*;
import java.util.*;

public class DiagonalDifference {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
		int num;
		num = in.nextInt();
        
		int matrix[][] = new int[num][num];
		int right = 0;
		int left  = 0;
		
		for(int i=0;i<num;i++){
			for(int j=0;j<num;j++){
				
				matrix[i][j] = in.nextInt();
				if(i == j){
					right += matrix[i][j];
				}
				if(i+j == num-1){
					left  +=  matrix[i][j];
				}
			}
		}
		
		
		
		System.out.println(Math.abs(right-left));
    }
}