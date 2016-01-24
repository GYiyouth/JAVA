package hello;

import java.util.Scanner;

public class Hello {

	public static void main(String[] args) {
		//输入一个数列，求均值总值，并按要求输出每个大于均值的数的
				//初始化
				Scanner in=new Scanner(System.in);
				int [] A=new int[100];
				int cur=0,sum=0,p=0;
				double aver=0;
				//输入阶段，以-1作为结束
				System.out.println("请输入不多于100个整数，以-1作为最后一个数字");
				cur=in.nextInt();//第一个数字要单独输入，放到里面不方便
				while(cur!=-1){
					A[p]=cur;
					p++;
					sum+=cur;
					cur=in.nextInt();
				}//while
				
				//输出均值，和
				aver=sum/p;
				System.out.println("一共"+p+"个数字，"+"数列和为"+sum+",均值为"+aver);
				
				//输出数列中大于均值的数
				int i=0;
				while(i<=p){
					if(A[i]>=aver){
					System.out.println("第"+(i+1)+"个数字大于等于均值，他的值是"+A[i]);
					}//if
					i++;
				}//while
	}

}
