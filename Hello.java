package hello;

import java.util.Scanner;

public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		// JAVA第一个小程序
//        System.out.println("hello world");
////        while(true){
//        Scanner in =new Scanner(System.in);
//        int a=in.nextInt();//看来语言和语言都是相通的！！！
//
//        System.out.println("Cortana:"+in.nextLine());
////        }
//        System.out.println(2+3+"=2+3="+5+"="+(2+3));
//        System.out.println("100-"+a+"="+(100-a));
		
		/*第二个小程序*/
//		int price;
//		System.out.println(price);不能输出 因为没有初始化
		int feet,inch;
		System.out.print("输入英尺数");
		Scanner in=new Scanner(System.in);
		feet=in.nextInt();
//		System.out.println(feet);
		System.out.print("请输入英寸数");
		inch=in.nextInt();
//		System.out.println(inch);
		System.out.println("换成公制身高为"+(int)((feet+inch/12.0)*0.3080*100));
		//这里用12.0是因为二者必须有一个浮点数，结果才为浮点数
	}

}
