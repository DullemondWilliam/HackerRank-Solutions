package Implementation;

import java.util.Scanner;

public class AngryProfessor {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num;
		num = in.nextInt();
		
		for(int i=0;i<num;i++){
			int students  = in.nextInt();
			int threshold = in.nextInt();
			for(int j=0;j<students;j++){
				if(in.nextInt() <= 0){
					threshold--;
				}
			}
			if(threshold<=0){
				System.out.println("NO");
			}else{
				System.out.println("YES");
			}
		}
	}
}
