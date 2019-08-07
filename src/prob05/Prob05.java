package prob05;

import java.util.Random;
import java.util.Scanner;

public class Prob05 {

	public static void main(String[] args) {
		int minNum = 1;
		int maxNum = 100;
		int count  = 1;

		
		Random random = new Random();
		int correctNum = random.nextInt(maxNum) + 1;
		System.out.println(correctNum);
		
		System.out.println("(1~100)수를 입력하시오");
		
		while(true) {
			System.out.print(count + ">> ");
			Scanner scanner = new Scanner( System.in );
			int myNum = scanner.nextInt(); 

			if(correctNum == myNum) {
				System.out.println("맞췄습니다.");
				System.out.print("종료 하시겠습니까(y/n)>>");
				String answer = scanner.next();
				//while(true) {
					if( answer.equals("y") ){
					    //종료하도록 작성한다.	
						System.out.print("끝났습니다.");
						break;
					}else if( answer.equals("n") ){
						correctNum = random.nextInt(maxNum) + 1;
						System.out.println(correctNum);
						System.out.println("(1~100)수를 입력하시오");
						count = 1;
					}
				//}
			}else {
				if(correctNum > myNum ) {
					minNum = myNum;
					System.out.println("더 높게");
					System.out.println(maxNum + "-" + minNum);
					
				}else if(correctNum < myNum) {
					maxNum = myNum;
					System.out.println("더 낮게");
					System.out.println(maxNum + "-" + minNum);				
				}
				count++;			
			}

		}
		
	}

}