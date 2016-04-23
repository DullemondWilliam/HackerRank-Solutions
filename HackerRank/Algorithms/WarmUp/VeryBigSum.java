package WarmUp;

import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class VeryBigSum {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
		int num;
		num = in.nextInt();
        
		BigInteger sum = new BigInteger("0");
		
		for(int i=0;i<num;i++){
			sum = sum.add(in.nextBigInteger());
		}
		System.out.println(sum);
    }
}