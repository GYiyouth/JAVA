package easymath2;

import java.util.Scanner;

public class Easymath2 {
	
public static boolean IsInt(String str)//������
{
	for(int i=0;i<str.length();i++)
	{	
	
		if(!Character.isDigit(str.charAt(i)))
			return false;		
	}
	return true;
}
	
public static double Calculate(String str)//����һ����ʽ����ֵ
{
	int a=0;
	double total=1;
	if(IsInt(str))
	{
		total=Integer.parseInt(str);
		return total;
	}
	if(str.charAt(0)=='-')
		a=-1;
	else
		a=1;
	int rear=str.length()-1;
	int front=0;
	if(!Character.isDigit(str.charAt(0)))
	{
		front++;
		
	}
	
	int n=0;
	double temp=0;
	for(;rear>=front;rear--)
	{
		char ch=str.charAt(rear);
		if(Character.isDigit(ch))
		{
			n++;
			int f=Integer.parseInt(ch+"");
			for(int i=1;i<n;i++)
				f=f*10;
			temp+=f;
		}
		else//����������
		{
			n=0;
			if(ch=='*')//�˺�
			{
				total*=temp;
			}
			else//����
			{
				temp=1/temp;
				total*=temp;
			}
			temp=0;
		}
	}//for�����������ֵ
	if(temp==0)
		total*=a;
	else
		total=a*total*temp;
	return total;
}

public static void main(String[] args)
{
	
	String str;
	Scanner in=new Scanner(System.in);
	System.out.println("����ʽ��");
	str=in.nextLine();

	
	if(IsInt(str))//������һ������
	{
		System.out.println("Ans = "+str);
		return;
	}
		
	int len=str.length();
	double result=0;
	
//	int [] add=new int [len/2];/*******�Ӻ�����*********/
//	int addp=0;/*******�Ӻ������±�*****/
//	int [] sub=new int [len/2];/*******��������*********/
//	int subp=0;/*******���������±�*****/
	
	int [] cmp=new int [len/2];
	int cmpp=0;
	

	
	/********Ѱ�ҼӼ���********/
	for(int i=0;i<len;i++)
	{
		if(str.charAt(i)=='+'||str.charAt(i)=='-')
			cmp[cmpp++]=i;		
	}
//	System.out.println(cmpp);
	if(cmpp==0)
	{
		/*********��������Ӽ���***********/
		result=Calculate(str);
		System.out.println("Ans = "+result);
		return;
	}
	String [] son=new String [cmpp+1];/**���ò����Ӽ��ŵ����ַ���**/
	double [] sum=new double [cmpp+1];/**�����������ַ����ļ�����ֵ**/
	
	son[0]=str.substring(0, cmp[0]);
	for(int i=0;i<cmpp-1;i++)
	{
		son[i+1]=str.substring(cmp[i], cmp[i+1]);
//		System.out.println(son[i+1]);
	}
	son[cmpp]=str.substring(cmp[cmpp-1]);//�ѵõ�ÿһ����ʽ
	
	for(int i=0;i<=cmpp;i++)
	{
		sum[i]=Calculate(son[i]);
		result+=sum[i];
	}
	
	System.out.println("Ans = "+result);
}
}
