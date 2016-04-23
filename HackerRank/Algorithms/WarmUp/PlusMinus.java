package WarmUp;

import java.io.*;
import java.util.*;

public class PlusMinus {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
		int num;
		num = in.nextInt();
		
		int pos = 0;
		int neg = 0;
		int zer = 0;
		
		for(int i=0;i<num;i++){
			int input = in.nextInt();
			if(input>0)  pos++;
			if(input<0)  neg++;
			if(input==0) zer++;
		}
		
		Float output = (float)pos;
		output /= (pos+neg+zer);
		System.out.println(output);
		
		output = (float)neg;
		output /= (pos+neg+zer);
		System.out.println(output);
		
		output = (float)zer;
		output /= (pos+neg+zer);
		System.out.println(output);
    }
}