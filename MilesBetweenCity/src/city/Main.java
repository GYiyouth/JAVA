package city;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String cityList = in.nextLine();
		ArrayList<String> Citys = new ArrayList<String>();
		// ȡ������
		int rear=0;
		for( int i=0; i<cityList.length(); i++){
			if( (cityList.charAt(i)+"").equals(" ")) // Ҫ���ʵ��ǿո񣬾ͼ����������
			{
				cityList.substring(rear, i);
				String temp = cityList.substring(rear, i);
				Citys.add(temp);
				rear = i+1;
			}
			if( (cityList.charAt(i)+"").equals("#"))
			{
				break;
			}
		}
		System.out.println(Citys);
		for( String city: Citys){
			CitySource city = new CitySource();
		}
	}
}
