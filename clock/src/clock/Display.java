package clock;

public class Display {
	
	int value = 0;
	int limit = 0;
	
	Display( int a ){
		this.limit = a;
	}
	void valueincrease(){
		this.value ++;
		if( this.value == this.limit )
			this.value = 0;
	}
	int getvalue(){
		return value;
	}
	public static void main(String[] args) {
		Display first = new Display ( 24 );
	}

}
