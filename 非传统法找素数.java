package sushu;

import java.util.Scanner;

public class Sushu {
	public static void main(String[] args) {
		final int top=300;
		int x=2;
		boolean [] numbers=new boolean [300];
		for(int i1=0;i1<top;i1++)
			numbers[i1]=true;
		while(x<top){
			for(int i=2;(x*i)<top;i++){
				numbers[x*i]=false;
			}//for
			
		x++;
		}
		for(int i=2;i<top;i++){
			if(numbers[i])
				System.out.print(i+" ");
		}
		
	}
}
