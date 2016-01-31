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
	//初始化完成

	System.out.println("棋盘为3*3的表格，棋子为O与X，"
			+ "请分别输入行数，列数，以及棋子儿，中间有空格。");

	LOOP_WHILE:
	while(!result)
	{
	//输出完整的棋盘
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
		}//棋盘的一行
		System.out.println("");
	}//棋盘的一列
	
	i=in.nextInt()-1;
	j=in.nextInt()-1;
	str=in.nextLine();
	//判断输入是否合乎规范
	if(i<0||i>2||j<0||j>2||(!board[i][j]))
	{
		System.out.println("输入非法，重新输入");
		continue LOOP_WHILE;
	}
	//输入及其规范化
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
			System.out.println("输入非法，重新输入");
			continue LOOP_WHILE;
		}
	}	
	
	//结果判断
	//行判断
		if(board[i][0]||board[i][1]||board[i][2])
			;
		else//整行都已经输入
		{
			if(boardnum[i][0]==boardnum[i][1]&&boardnum[i][1]==boardnum[i][2])
			{
				result=true;
				System.out.println("第"+(i+1)+"行取得胜利");
				if(boardnum[1][1]==1)
					System.out.println("X方胜利！");
				else
					System.out.println("O方胜利！");
			}
		}
	//列判断
		if(board[0][j]||board[1][j]||board[2][j])
		;
		else//整列都已经输入
		{
			if(boardnum[0][j]==boardnum[1][j]&&boardnum[1][j]==boardnum[2][j])
			{
				result=true;
				System.out.println("第"+(j+1)+"列取得胜利");
				if(boardnum[1][1]==1)
					System.out.println("X方胜利！");
				else
					System.out.println("O方胜利！");
			}
		}
	//对角线判断
		if(board[0][0]||board[1][1]||board[2][2])
			;
		else//整列都已经输入
		{
			if(boardnum[0][0]==boardnum[1][1]&&boardnum[1][1]==boardnum[2][2])
			{
				result=true;
				System.out.println("对角线取得胜利");
				if(boardnum[1][1]==1)
					System.out.println("X方胜利！");
				else
					System.out.println("O方胜利！");
			}
		}
	//反对角线判断
		if(board[0][2]||board[1][1]||board[2][0])
			;
		else//整列都已经输入
		{
			if(boardnum[0][2]==boardnum[1][1]&&boardnum[1][1]==boardnum[2][0])
			{
				result=true;
				System.out.println("反对角线取得胜利");
				if(boardnum[1][1]==1)
					System.out.println("X方胜利！");
				else
					System.out.println("O方胜利！");
			}
		}
	
	}//while
	
	
	//最后输出完整的棋盘
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
		}//棋盘的一行
		System.out.println("");
	}//棋盘的一列
}//main
}
