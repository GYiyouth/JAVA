package fractioncal;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Fraction a = new Fraction(in.nextInt(), in.nextInt());
		Fraction b = new Fraction(in.nextInt(),in.nextInt());
		a.print();
		b.print();
		a.plus(b).print();
		a.multiply(b).plus(new Fraction(5,6)).print();
		a.print();
		b.print();
		in.close();
	} // main
} // class Main

class Fraction
{
	int up ;
	int down ;
	
	Fraction( int a , int b )
	{
		this.up = a ;
		this.down = b ;
	}
	double ToDouble() // 转化为双精度浮点数
	{
		double result = 0 ;
		result = ( double )this.up / this.down ;
//		System.out.println( this.up + "/" + this.down + " = " + result );
		return result ;
	}
	
	Fraction plus( Fraction r ) // 这里的Fraction 是返回类型，相当于数据结构
	{
		Fraction temp = new Fraction( 1 , 1 ) ;
		temp.down = this.down * r.down ;
		temp.up = this. up * r.down + this.down * r.up ;
		return temp ;
	}
	
	Fraction multiply ( Fraction r )
	{
		Fraction temp = new Fraction( 1 , 1 ) ;
		temp.up = this.up * r.up ;
		temp.down = this .down * r.down  ;
		return temp ;
	}
	
	void print()
	{
		//三种特殊情况
		if( this.down == 0 )
		{
			System.out.println( "ERROR" );
			return;
		}
		if( this.up == 0 )
		{
			System.out.println( 0 );
			return;
		}
		if( this.up == this.down )
		{
			System.out.println(1);
			return;
		}
		
		int cmp =0 ;
		if( this.ToDouble() < 0)
		{
			cmp = -1 ;
			this.up = Math.abs( this.up ) ;
			this.down = Math.abs( this.down ) ;		
		}
		else
		{
			cmp = 1 ;
			this.up = Math.abs( this.up );
			this.down = Math.abs( this.down ) ;
		}
		boolean cannotpass = true ;
		for( int i = this.up ; cannotpass && i>1 ; i-- )
		{
			if( this.up%i == 0 && this.down%i == 0 )
			{
				cannotpass = false;
				this.up = this.up / i;
				this.down = this.down / i ;
			}
		}
		this.up = cmp * this.up ;
		System.out.println( this.up + "/" + this.down );
		return;
	}
} // class Fraction

