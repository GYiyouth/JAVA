package week2;

import java.util.Scanner;

public class Lesson1 {
	public static void main(String[] args) {//һ��ģ����Զ���Ʊ����
		//��ʼ��
		Scanner in=new Scanner(System.in);
		int amount;
		System.out.print("Ʊ��ʮԪ����Ͷ��");
		amount=in.nextInt();
//		System.out.println(amount>=10);
		
		while(amount<10){
			System.out.println("����"+(10-amount)+"Ԫ�������Ͷ��");
			amount=amount+in.nextInt();
			}//while
		
		System.out.println("**********");
		System.out.println("JAVA�Ǽ���·");
		System.out.println("Ʊ��ʮԪ");
		System.out.println("**********");
		System.out.println("����"+(amount-10));

	
	}
}
