package prob01;

import java.util.Scanner;

public class Prob01 {
	public static void main(String[] args) {
		int save[] = {50000,10000,5000,1000,500,100,50,10,1};
				
		Scanner scanner = new Scanner( System.in  );	
		System.out.print( "금액 : " );
		int money = scanner.nextInt(); 
		
		for(int i = 0; i < save.length; i++) {
			int separation = money/save[i];
			money = money % save[i];
			System.out.println(save[i] + "원 " + separation + "개");
		}
 	}
}