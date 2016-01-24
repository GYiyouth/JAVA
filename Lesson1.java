package week2;

import java.util.Scanner;

public class Lesson1 {
	public static void main(String[] args) {//一个模拟的自动贩票程序
		//初始化
		Scanner in=new Scanner(System.in);
		int amount;
		System.out.print("票价十元，请投币");
		amount=in.nextInt();
//		System.out.println(amount>=10);
		
		while(amount<10){
			System.out.println("还差"+(10-amount)+"元，请继续投币");
			amount=amount+in.nextInt();
			}//while
		
		System.out.println("**********");
		System.out.println("JAVA城际铁路");
		System.out.println("票价十元");
		System.out.println("**********");
		System.out.println("找零"+(amount-10));

	
	}
}
