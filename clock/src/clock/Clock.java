package clock;

public class Clock {
	private Display hour = new Display (24);
	private Display minute = new Display (60);
	private Display second = new Display (60);
	
	public Clock( int hour, int minute, int second)
	{
		this.hour.setlimit(hour);
		this.minute.setlimit(minute);
		this.second.setlimit(second);
	}
	
	public void tick()
	{
		if(this.second.valueincrease())
		{
			if(this.minute.valueincrease())
			{
				this.hour.valueincrease();
			}
		}
	}
	public void start()
	{
		while( true )
		{
			
			if( minute.valueincrease() )
				hour.valueincrease();
			System.out.printf("%02d:%02d\n", hour.getvalue(), minute.getvalue() );
		}
	}
	
	public String toString()
	{
		String hour, minute, second;
		if( this.hour.getvalue() < 10 )
			hour = "0" + this.hour.getvalue();
		else
			hour = "" + this.hour.getvalue();
		if( this.minute.getvalue() < 10 )
			minute = "0" + this.minute.getvalue();
		else 
			minute = "" + this.minute.getvalue();
		if( this.second.getvalue() < 10 )
			second = "0" + this.second.getvalue();
		else 
			second = "" + this.second.getvalue();
		
		return hour + ":" + minute + ":" + second;
	}
	
	public static void main( String[] args)
	{
		Clock c = new Clock ( 24, 60, 60);
		System.out.println(c);
	}
}
