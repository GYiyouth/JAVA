package clock;

public class Display {
	
	private int value = 0;
	private int limit = 0;
	
	
	Display( int a ){
		this.limit = a;
	}
	
	public void setlimit( int limit)
	{
		this.limit = limit;
	}
	
	public boolean valueincrease(){
		boolean turn = false;
		this.value ++;
		if( this.value == this.limit )
		{
			this.value = 0;
			turn = true;
		}
		return turn;
	}
	
	public int getvalue(){
		return value;
	}
	public static void main(String[] args) {
//		Display first = new Display ( 24 );
	}

}
