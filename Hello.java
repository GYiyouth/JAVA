package hello;

import java.util.Scanner;

public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		// JAVA��һ��С����
//        System.out.println("hello world");
////        while(true){
//        Scanner in =new Scanner(System.in);
//        int a=in.nextInt();//�������Ժ����Զ�����ͨ�ģ�����
//
//        System.out.println("Cortana:"+in.nextLine());
////        }
//        System.out.println(2+3+"=2+3="+5+"="+(2+3));
//        System.out.println("100-"+a+"="+(100-a));
		
		/*�ڶ���С����*/
//		int price;
//		System.out.println(price);������� ��Ϊû�г�ʼ��
		int feet,inch;
		System.out.print("����Ӣ����");
		Scanner in=new Scanner(System.in);
		feet=in.nextInt();
//		System.out.println(feet);
		System.out.print("������Ӣ����");
		inch=in.nextInt();
//		System.out.println(inch);
		System.out.println("���ɹ������Ϊ"+(int)((feet+inch/12.0)*0.3080*100));
		//������12.0����Ϊ���߱�����һ���������������Ϊ������
	}

}
