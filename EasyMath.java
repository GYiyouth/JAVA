package easymath;

import java.util.Scanner;

public class EasyMath {
public static boolean IsStringInt(String str)//判断一个字符串是否是数字
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
	/*基本思路就是从后往前，遇到的第一个数字乘1，第二个乘10，第三个乘100。遇到第一个+-号时把已经读到的式子算出来，记为A
	 * 再往后看，遇到第二个+-号的式子的值记为B，计算A+/-B的值，重新记为A
	 * 依次往后读，直至结束*/
	Scanner in=new Scanner(System.in);
	String str;
	double sum=0;
	boolean Sum=false;//假：无待加减法运算的值。真：有待加减运算的值
	double num=0,numR=0;
	boolean Num=false;//假：无待乘除运算的值。真：有待乘除运算的值
	boolean CannotStop=true;//真：前方仍有字符。假：已到最前方。
	int len;
	boolean Number=true;//下一个要输入的字符是数字
	int cal1=0,cal2=0;//
	
	//输入式子
	str=in.nextLine();
	len=str.length();
	
	/*如果是一串数字，直接输出*/
	if(IsStringInt(str))
	{
		System.out.println(str);
		return;
	}
	
	/********开始**********/
	while(len>0)
	{
	/*******读取一个整数*****/
	int i=1;//i作为每个数的位数
	LOOP_GETNUM:
	for(;Number;i++)/********/
	{
		char ch=str.charAt(len-i);/************/
		if(Character.isDigit(ch)&&i!=len)//如果是数字，就查找下一个，直到第一个字符
			continue LOOP_GETNUM;
		
			Number=false; 
			String temp;
			if((len-i)!=0)//还有未读入的字符
			{
				temp=str.substring(len-(i-1),len);
				CannotStop=true;
			}
			else		  //已到第一个字符
			{
				temp=str.substring(0,len);
				CannotStop=false;
			}
			num=Integer.parseInt(temp);
			len-=i;
		
	}//for取数
	System.out.println(num);
	
	/***记录要计算的值***/
	if(str.charAt(len)=='*'||str.charAt(len)=='/')//乘除法
	{
		if(Num)//有待乘除
		{
			if(cal2==1) //乘
				numR=num*numR;
			else		//除
				numR=num/numR;
		}
		else
		{
		numR=num;
		Num=true;
		}
		if(str.charAt(len)=='*')//标记下一次的计算
			cal1=1;
		else
			cal1=2;
		len--;
		Number=true;
	}
	if(str.charAt(len)=='+'||str.charAt(len)=='-')//加减法
	{
		if(Num)//有待乘除
		{
			if(cal2==1) //乘
				sum=num*numR;
			else		//除
				sum=num/numR;
		}
		else
		{
			sum+=num;
		}
		Sum=true;
		if(str.charAt(len)=='+')//标记下一次的计算
			cal2=1;
		else
			cal2=2;
		len--;
		Number=true;
	}
	}//WHILE总循环
	System.out.println(sum);
}//main
}
