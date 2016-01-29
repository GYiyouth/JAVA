import java.util.Scanner;

public class TicTacToe {
	public static void main(String[] args){
	final int SIZE=3;
	int i,j;
//	int numO=0,numX=0;
	Scanner in= new Scanner(System.in);
	boolean [][] board=new boolean[SIZE][SIZE];
	int [][] boardnum=new int[SIZE][SIZE];
	boolean result=false;
	String elem;
	//初始化
	for(i=0;i<board.length;i++)
	{
		for(j=0;j<board[i].length;j++)
		
			board[i][j]=true;

	}
	for(i=0;i<boardnum.length;i++)
	{
		for(j=0;j<boardnum[i].length;j++)
		
			boardnum[i][j]=(i+1)*(j+1);

	}
	System.out.println("请输入行数，列数，以及旗子（O或者X）");
	//输入
	loop_main:
	while(!result)
	{
		i=in.nextInt();
		j=in.nextInt();
		elem=in.nextLine();
		//排除输入不符合规范
//		if(i<0||i>2||j<0||j>2||(elem!="X"&&elem!="x"&&elem!="O"&&elem!="o"))
//		{
//			System.out.println("ERROR");
//			continue loop_main;
//		}
		if(!board[i][j])
		{
			System.out.println("该单元格已被输入");
			continue loop_main;
		}
		board[i][j]=false;
		if(elem=="X"||elem=="x")
			boardnum[i][j]=1;
		if(elem=="O"||elem=="o")
			boardnum[i][j]=0;
		int p,sum=0;
		//检查行
		for(p=0;p<boardnum.length-1;p++)
		{
			if(boardnum[i][p]!=boardnum[i][(p+1)])
				break;
			else
				sum++;
		}
		if(sum==boardnum.length-1)
		{	
			result=true;
			if(boardnum[i][i]==1)//如果X胜利
				System.out.println("X方胜利！恭喜！");
			else				 //O胜
				System.out.println("O方胜利！恭喜！");
			break;
		}
		else
			sum=0;
		//检查列
		for(p=0;p<boardnum.length-1;p++)
		{
			if(boardnum[p][j]!=boardnum[(p+1)][j])
				break;
			else
				sum++;
		}
		if(sum==boardnum.length-1)
		{	
			result=true;
			if(boardnum[i][i]==1)//如果X胜利
				System.out.println("X方胜利！恭喜！");
			else				 //O胜
				System.out.println("O方胜利！恭喜！");
			break;
		}
		else
			sum=0;
		//检查对角线
		if(i==j){
		for(p=0;p<boardnum.length-1;p++)
		{
			if(boardnum[p][p]!=boardnum[(p+1)][(p+1)])
				break;
			else
				sum++;
		}
		if(sum==boardnum.length-1)
		{	
			result=true;
			if(boardnum[i][i]==1)//如果X胜利
				System.out.println("X方胜利！恭喜！");
			else				 //O胜
				System.out.println("O方胜利！恭喜！");
			break;
		}
		else
			sum=0;
		}
		//检查反对角线
		if(i+j==board.length-1){
		for(p=0;p<boardnum.length-1;p++)
		{
			if(boardnum[p][(boardnum.length-p-1)]!=boardnum[(p+1)][(boardnum.length-p-2)])
				break;
			else
				sum++;
		}
		if(sum==boardnum.length-1)
		{	
			result=true;
			if(boardnum[0][board.length-1]==1)//如果X胜利
				System.out.println("X方胜利！恭喜！");
			else				 //O胜
				System.out.println("O方胜利！恭喜！");
			break;
		}
		else
			sum=0;
		}
	}//while(!result)
	}//main
}
