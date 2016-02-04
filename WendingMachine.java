package wendingmachine;

public class WendingMachine {
	
	int price = 80 ;
	int balance;
	int total;
	
	WendingMachine() // 构造函数
	{
		
	}
	
	WendingMachine( int price ) // 也是构造函数————重载
	{
		this.price = price ;
	}
	
	void showpromote()
	{
		System.out.println("WELCOME");
	}
	
	void insertmoney(int amount)
	{
		balance+=amount; // 或者 this.balance
		System.out.println( "balance = " + balance );
		showbalance(); // 在一个成员函数的内部，调用另一个成员函数，不需要用.运算符，而可以直接调用。
	}
	
	/************关于this.的运用，可以看下一个成员函数***********/
	
	void setprice(int price)
	{
		this.price=price; // 这两个price的含义是不同的，如果直接打 price ，函数会访问离他最近的那个
		System.out.println( "price = " + this.price );		
	}
	
	void showbalance()
	{
		System.out.println( "balance = " + balance );
	}
	
	void getfood()
	{
		if( balance >= price)
			System.out.println( "Here you are" );
			balance -= price;
			total += price;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WendingMachine vm = new WendingMachine();
		vm.showpromote();
		vm.showbalance();
		vm.insertmoney(100);
		vm.getfood();
		vm.showbalance();		
		vm.showpromote();

		WendingMachine vm1 = new WendingMachine( 100 );
		vm1.showbalance();
	}

}
