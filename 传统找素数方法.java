package sushu;

import java.util.Scanner;

public class Sushu {
	public static void main(String[] args) {
		int [] sushu=new int [50];
		int cnt=1;
		sushu[0]=2;
		boolean flag=true;//如果找到一个约数，就置错
		loop_main:
		for(int i=3;cnt<50;i=i+2){//找50个素数，从奇数里找
			flag=true;
			for(int p=0;p<cnt;p++){
				if(i%sushu[p]==0){
					flag=false;
					continue loop_main;
				}//if
			}//for
			sushu[cnt++]=i;
		}//for
		for(int k:sushu)
			System.out.print(k+" ");
		
		
	}
}
