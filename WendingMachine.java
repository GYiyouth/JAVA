package wendingmachine;

public class WendingMachine {
	
	int price = 80 ;
	int balance;
	int total;
	
	WendingMachine() // ���캯��
	{
		
	}
	
	WendingMachine( int price ) // Ҳ�ǹ��캯��������������
	{
		this.price = price ;
	}
	
	void showpromote()
	{
		System.out.println("WELCOME");
	}
	
	void insertmoney(int amount)
	{
		balance+=amount; // ���� this.balance
		System.out.println( "balance = " + balance );
		showbalance(); // ��һ����Ա�������ڲ���������һ����Ա����������Ҫ��.�������������ֱ�ӵ��á�
	}
	
	/************����this.�����ã����Կ���һ����Ա����***********/
	
	void setprice(int price)
	{
		this.price=price; // ������price�ĺ����ǲ�ͬ�ģ����ֱ�Ӵ� price ���������������������Ǹ�
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
