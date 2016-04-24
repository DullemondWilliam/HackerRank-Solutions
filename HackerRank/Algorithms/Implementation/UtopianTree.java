package Implementation;

import java.util.Scanner;

public class UtopianTree {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num;
		num = in.nextInt();
		
		for(int i=0;i<num;i++){
			int seasons  = in.nextInt();
			int treeSize = 1;
			for(int j=0; j<seasons; j++){
				if(j%2 == 0){
					treeSize *= 2;
				}else{
					treeSize += 1;
				}
			}
			System.out.println(treeSize);
		}
	}
}
