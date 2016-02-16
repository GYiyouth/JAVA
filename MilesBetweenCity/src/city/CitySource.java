package city;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class CitySource{
//	ArrayList<String> citynames = new ArrayList<String>();
//	ArrayList<Integer> citymile = new ArrayList<Integer>();
//	
//	public void addGoalName( String goalCity ){
//		citynames.add( goalCity );
//	}
//	public void addGoalMile ( int mile ){
//		citymile.add( mile );
//	}
	private HashMap<String, Integer> citys = new HashMap<String, Integer>();
//	public CitySource( String city ){
//		
//	}
	
	public void addCity( String name, Integer mile ){
		citys.put(name, mile);
	}
	public int getDistance( String city1, String city2 ){
		if ( !citys.containsKey(city2))
			return -1;
		return citys.get(city2);
	}
}
