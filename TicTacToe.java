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
	//��ʼ��
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
	System.out.println("�������������������Լ����ӣ�O����X��");
	//����
	loop_main:
	while(!result)
	{
		i=in.nextInt();
		j=in.nextInt();
		elem=in.nextLine();
		//�ų����벻���Ϲ淶
//		if(i<0||i>2||j<0||j>2||(elem!="X"&&elem!="x"&&elem!="O"&&elem!="o"))
//		{
//			System.out.println("ERROR");
//			continue loop_main;
//		}
		if(!board[i][j])
		{
			System.out.println("�õ�Ԫ���ѱ�����");
			continue loop_main;
		}
		board[i][j]=false;
		if(elem=="X"||elem=="x")
			boardnum[i][j]=1;
		if(elem=="O"||elem=="o")
			boardnum[i][j]=0;
		int p,sum=0;
		//�����
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
			if(boardnum[i][i]==1)//���Xʤ��
				System.out.println("X��ʤ������ϲ��");
			else				 //Oʤ
				System.out.println("O��ʤ������ϲ��");
			break;
		}
		else
			sum=0;
		//�����
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
			if(boardnum[i][i]==1)//���Xʤ��
				System.out.println("X��ʤ������ϲ��");
			else				 //Oʤ
				System.out.println("O��ʤ������ϲ��");
			break;
		}
		else
			sum=0;
		//���Խ���
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
			if(boardnum[i][i]==1)//���Xʤ��
				System.out.println("X��ʤ������ϲ��");
			else				 //Oʤ
				System.out.println("O��ʤ������ϲ��");
			break;
		}
		else
			sum=0;
		}
		//��鷴�Խ���
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
			if(boardnum[0][board.length-1]==1)//���Xʤ��
				System.out.println("X��ʤ������ϲ��");
			else				 //Oʤ
				System.out.println("O��ʤ������ϲ��");
			break;
		}
		else
			sum=0;
		}
	}//while(!result)
	}//main
}
