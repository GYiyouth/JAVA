import java.util.Scanner;

public class TicTacToe {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		final int size=3;
		boolean gotresult=false;
		int numberX=0;
		int numberO=0;
		int [][] board=new int [size][size];
		//矩阵遍历
		loop_main:
		for(int i=0;i<board.length;i++){
			for(int j=0;j<board[i].length;j++){//这样表示二维数组的长度更有一般性
				board[i][j]=in.nextInt();
				//每输入一个数，都要检测
				
				}
		}

		
	}
}
