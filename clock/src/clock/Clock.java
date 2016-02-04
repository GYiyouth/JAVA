package clock;

public class Clock {
	private Display hour = new Display (24);
	private Display minute = new Display (60);
	
	public void start()
	{
		while( true )
		{
			minute.valueincrease();
			if( minute.value == 0 )
				hour.valueincrease();
			System.out.printf("%02d:%02d\n", hour.getvalue(), minute.getvalue() );
		}
	}
	public static void main( String[] args)
	{
		Clock clock = new Clock();
		clock.start();
	}
}
