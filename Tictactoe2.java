package tictactoe2;

import java.util.Scanner;

public class Tictactoe2 {
public static void main(String[] args)
{
	boolean[][] board=new boolean [3][3];
	int[][] boardnum={{2,3,4},{5,6,7},{8,9,10}};
	Scanner in=new Scanner(System.in);
	String str;
//	int row=0,column=0;
	boolean result=false;
	int i,j;
	for(i=0;i<board.length;i++)
	{
		for(j=0;j<board.length;j++)
		{
			board[i][j]=true;
		}
	}
	//��ʼ�����

	System.out.println("����Ϊ3*3�ı������ΪO��X��"
			+ "��ֱ������������������Լ����Ӷ����м��пո�");

	LOOP_WHILE:
	while(!result)
	{
	//�������������
	for(i=0;i<boardnum.length;i++)
	{
		for(j=0;j<boardnum.length;j++)
		{
			if(boardnum[i][j]==1)
				System.out.print("X");
			else
			{
				if(boardnum[i][j]==0)
					System.out.print("O");
				else
					System.out.print("*");
			}
		}//���̵�һ��
		System.out.println("");
	}//���̵�һ��
	
	i=in.nextInt()-1;
	j=in.nextInt()-1;
	str=in.nextLine();
	//�ж������Ƿ�Ϻ��淶
	if(i<0||i>2||j<0||j>2||(!board[i][j]))
	{
		System.out.println("����Ƿ�����������");
		continue LOOP_WHILE;
	}
	//���뼰��淶��
	board[i][j]=false;
//	System.out.println(str);
	if(str.equals(" o")||str.equals(" O"))
		boardnum[i][j]=0;
	else
	{
		if(str.equals(" X")||str.equals(" x"))
			boardnum[i][j]=1;
		else
		{
			System.out.println("����Ƿ�����������");
			continue LOOP_WHILE;
		}
	}	
	
	//����ж�
	//���ж�
		if(board[i][0]||board[i][1]||board[i][2])
			;
		else//���ж��Ѿ�����
		{
			if(boardnum[i][0]==boardnum[i][1]&&boardnum[i][1]==boardnum[i][2])
			{
				result=true;
				System.out.println("��"+(i+1)+"��ȡ��ʤ��");
				if(boardnum[1][1]==1)
					System.out.println("X��ʤ����");
				else
					System.out.println("O��ʤ����");
			}
		}
	//���ж�
		if(board[0][j]||board[1][j]||board[2][j])
		;
		else//���ж��Ѿ�����
		{
			if(boardnum[0][j]==boardnum[1][j]&&boardnum[1][j]==boardnum[2][j])
			{
				result=true;
				System.out.println("��"+(j+1)+"��ȡ��ʤ��");
				if(boardnum[1][1]==1)
					System.out.println("X��ʤ����");
				else
					System.out.println("O��ʤ����");
			}
		}
	//�Խ����ж�
		if(board[0][0]||board[1][1]||board[2][2])
			;
		else//���ж��Ѿ�����
		{
			if(boardnum[0][0]==boardnum[1][1]&&boardnum[1][1]==boardnum[2][2])
			{
				result=true;
				System.out.println("�Խ���ȡ��ʤ��");
				if(boardnum[1][1]==1)
					System.out.println("X��ʤ����");
				else
					System.out.println("O��ʤ����");
			}
		}
	//���Խ����ж�
		if(board[0][2]||board[1][1]||board[2][0])
			;
		else//���ж��Ѿ�����
		{
			if(boardnum[0][2]==boardnum[1][1]&&boardnum[1][1]==boardnum[2][0])
			{
				result=true;
				System.out.println("���Խ���ȡ��ʤ��");
				if(boardnum[1][1]==1)
					System.out.println("X��ʤ����");
				else
					System.out.println("O��ʤ����");
			}
		}
	
	}//while
	
	
	//����������������
	for(i=0;i<boardnum.length;i++)
	{
		for(j=0;j<boardnum.length;j++)
		{
			if(boardnum[i][j]==1)
				System.out.print("X");
			else
			{
				if(boardnum[i][j]==0)
					System.out.print("O");
				else
					System.out.print("*");
			}
		}//���̵�һ��
		System.out.println("");
	}//���̵�һ��
}//main
}
