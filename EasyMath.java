package easymath;

import java.util.Scanner;

public class EasyMath {
public static boolean IsStringInt(String str)//�ж�һ���ַ����Ƿ�������
{
	
	for(int i=0;i<str.length();i++)
	{	
	
		if(!Character.isDigit(str.charAt(i)))
			return false;		
	}
	return true;
}
public static void main(String[] args)
{
	/*����˼·���ǴӺ���ǰ�������ĵ�һ�����ֳ�1���ڶ�����10����������100��������һ��+-��ʱ���Ѿ�������ʽ�����������ΪA
	 * �����󿴣������ڶ���+-�ŵ�ʽ�ӵ�ֵ��ΪB������A+/-B��ֵ�����¼�ΪA
	 * �����������ֱ������*/
	Scanner in=new Scanner(System.in);
	String str;
	double sum=0;
	boolean Sum=false;//�٣��޴��Ӽ��������ֵ���棺�д��Ӽ������ֵ
	double num=0,numR=0;
	boolean Num=false;//�٣��޴��˳������ֵ���棺�д��˳������ֵ
	boolean CannotStop=true;//�棺ǰ�������ַ����٣��ѵ���ǰ����
	int len;
	boolean Number=true;//��һ��Ҫ������ַ�������
	int cal1=0,cal2=0;//
	
	//����ʽ��
	str=in.nextLine();
	len=str.length();
	
	/*�����һ�����֣�ֱ�����*/
	if(IsStringInt(str))
	{
		System.out.println(str);
		return;
	}
	
	/********��ʼ**********/
	while(len>0)
	{
	/*******��ȡһ������*****/
	int i=1;//i��Ϊÿ������λ��
	LOOP_GETNUM:
	for(;Number;i++)/********/
	{
		char ch=str.charAt(len-i);/************/
		if(Character.isDigit(ch)&&i!=len)//��������֣��Ͳ�����һ����ֱ����һ���ַ�
			continue LOOP_GETNUM;
		
			Number=false; 
			String temp;
			if((len-i)!=0)//����δ������ַ�
			{
				temp=str.substring(len-(i-1),len);
				CannotStop=true;
			}
			else		  //�ѵ���һ���ַ�
			{
				temp=str.substring(0,len);
				CannotStop=false;
			}
			num=Integer.parseInt(temp);
			len-=i;
		
	}//forȡ��
	System.out.println(num);
	
	/***��¼Ҫ�����ֵ***/
	if(str.charAt(len)=='*'||str.charAt(len)=='/')//�˳���
	{
		if(Num)//�д��˳�
		{
			if(cal2==1) //��
				numR=num*numR;
			else		//��
				numR=num/numR;
		}
		else
		{
		numR=num;
		Num=true;
		}
		if(str.charAt(len)=='*')//�����һ�εļ���
			cal1=1;
		else
			cal1=2;
		len--;
		Number=true;
	}
	if(str.charAt(len)=='+'||str.charAt(len)=='-')//�Ӽ���
	{
		if(Num)//�д��˳�
		{
			if(cal2==1) //��
				sum=num*numR;
			else		//��
				sum=num/numR;
		}
		else
		{
			sum+=num;
		}
		Sum=true;
		if(str.charAt(len)=='+')//�����һ�εļ���
			cal2=1;
		else
			cal2=2;
		len--;
		Number=true;
	}
	}//WHILE��ѭ��
	System.out.println(sum);
}//main
}
