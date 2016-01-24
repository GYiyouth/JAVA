package test;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		int [] zhx=new int [1];
		double [] fdx=new double[1];
		char [] zfx=new char[1];
		for(int i=0;i<zhx.length;i++){
			System.out.println(zhx[i]);
			System.out.println(fdx[i]);
			System.out.println(zfx[i]);
		}
		
		Scanner in=new Scanner(System.in);
		int x=in.nextInt();
		int []A={11,12,13,14,15,16,17,18,19,20};
		for(int i:A){//for-eachÊµÑé
			System.out.println(i);
			if(i==x)
				System.out.println(i);
		}
	}//main
}
