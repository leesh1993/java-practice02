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
		
		System.out.println("(1~100)���� �Է��Ͻÿ�");
		
		while(true) {
			System.out.print(count + ">> ");
			Scanner scanner = new Scanner( System.in );
			int myNum = scanner.nextInt(); 

			if(correctNum == myNum) {
				System.out.println("������ϴ�.");
				System.out.print("���� �Ͻðڽ��ϱ�(y/n)>>");
				String answer = scanner.next();
				//while(true) {
					if( answer.equals("y") ){
					    //�����ϵ��� �ۼ��Ѵ�.	
						System.out.print("�������ϴ�.");
						break;
					}else if( answer.equals("n") ){
						correctNum = random.nextInt(maxNum) + 1;
						System.out.println(correctNum);
						System.out.println("(1~100)���� �Է��Ͻÿ�");
						count = 1;
					}
				//}
			}else {
				if(correctNum > myNum ) {
					minNum = myNum;
					System.out.println("�� ����");
					System.out.println(maxNum + "-" + minNum);
					
				}else if(correctNum < myNum) {
					maxNum = myNum;
					System.out.println("�� ����");
					System.out.println(maxNum + "-" + minNum);				
				}
				count++;			
			}

		}
		
	}

}