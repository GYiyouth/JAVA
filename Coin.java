package coin;

import java.util.HashMap;
import java.util.Scanner;

public class Coin {
	private HashMap<Integer, String> coin = new HashMap<Integer, String> (); // ¹þÏ£±í
	
	public Coin(){
		coin.put(1, "penny");
		coin.put(10, "dime");
		coin.put(25, "qouter");
		coin.put(50, "half-dollor");
		coin.put(100, "buck");		
	}
	public String getName( int value ){
		return coin.get(value);
	}
	public static void main(String[] args) {
		int amount = 0 ;
		Scanner in = new Scanner(System.in);
		amount = in.nextInt();
		Coin coin = new Coin();
		System.out.println(coin.getName(amount));
		
	}

}
