package coin;

import java.util.HashMap;
import java.util.Scanner;

public class Coin {
	private HashMap<Integer, String> coin = new HashMap<Integer, String> (); // ��ϣ��
	
	public Coin(){
		coin.put(1, "penny");
		coin.put(10, "dime");
		coin.put(25, "qouter");
		coin.put(50, "half-dollor");
		coin.put(50, "��ë");  //  ���ˢ����һ������
		coin.put(100, "buck");
		System.out.println(coin.keySet().size()); // ���Ҫ������Ż���������ϣ���������
		System.out.println(coin); // ����ÿ���չʾ�˹�ϣ������Ĺ���
		for( Integer k : coin.keySet() ){
			String s = coin.get(k);
			System.out.println(s);
		}
	}
	public String getName( int value ){
		if ( coin.containsKey(value))
			return coin.get(value);
		else
			return "������������Ӳ�ң�";
	}
	public static void main(String[] args) {
		int amount = 0 ;
		Scanner in = new Scanner(System.in);
		amount = in.nextInt();
		Coin coin = new Coin();
		System.out.println(coin.getName(amount));
		
	}

}
