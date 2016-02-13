package coin;

import java.util.HashMap;
import java.util.Scanner;

public class Coin {
	private HashMap<Integer, String> coin = new HashMap<Integer, String> (); // 哈希表
	
	public Coin(){
		coin.put(1, "penny");
		coin.put(10, "dime");
		coin.put(25, "qouter");
		coin.put(50, "half-dollor");
		coin.put(50, "五毛");  //  会冲刷掉上一个设置
		coin.put(100, "buck");
		System.out.println(coin.keySet().size()); // 这个要先输入才会输出这个哈希表里面个数
		System.out.println(coin); // 形象好看地展示了哈希表里面的构造
		for( Integer k : coin.keySet() ){
			String s = coin.get(k);
			System.out.println(s);
		}
	}
	public String getName( int value ){
		if ( coin.containsKey(value))
			return coin.get(value);
		else
			return "不存在这样的硬币！";
	}
	public static void main(String[] args) {
		int amount = 0 ;
		Scanner in = new Scanner(System.in);
		amount = in.nextInt();
		Coin coin = new Coin();
		System.out.println(coin.getName(amount));
		
	}

}
