package hello;

import java.util.Scanner;

public class Hello {

	public static void main(String[] args) {
		//����һ�����У����ֵ��ֵ������Ҫ�����ÿ�����ھ�ֵ������
				//��ʼ��
				Scanner in=new Scanner(System.in);
				int [] A=new int[100];
				int cur=0,sum=0,p=0;
				double aver=0;
				//����׶Σ���-1��Ϊ����
				System.out.println("�����벻����100����������-1��Ϊ���һ������");
				cur=in.nextInt();//��һ������Ҫ�������룬�ŵ����治����
				while(cur!=-1){
					A[p]=cur;
					p++;
					sum+=cur;
					cur=in.nextInt();
				}//while
				
				//�����ֵ����
				aver=sum/p;
				System.out.println("һ��"+p+"�����֣�"+"���к�Ϊ"+sum+",��ֵΪ"+aver);
				
				//��������д��ھ�ֵ����
				int i=0;
				while(i<=p){
					if(A[i]>=aver){
					System.out.println("��"+(i+1)+"�����ִ��ڵ��ھ�ֵ������ֵ��"+A[i]);
					}//if
					i++;
				}//while
	}

}
