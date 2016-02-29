package shuzuPractice;

public class Practice {
	public static void main(String [] arg0){
		
		int [][] a = {{1},{2,3},{4,5,6,7}};
		// 数组的for()遍历
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a[i].length;j++)
				System.out.print(a[i][j]+" ");
			System.out.println(" ");
		}
		// 数组的for-each循环遍历
		for(int b[]:a){
			for(int c: b){
				System.out.print(c+" ");
			}
			System.out.println("");
			System.out.println("b.length = "+b.length+"a.length = "+a.length );
		}
	}

}
