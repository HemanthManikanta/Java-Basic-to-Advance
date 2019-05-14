package com.colectionssetdemo.com;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo {
	public static void main(String[] args) {
     		
		
		Map<Integer,String> m = new HashMap<>();
		m.put(1, "Hemanth");
		m.put(3,"divya");
		m.put(2,"durga");

		 Set<Integer> keys = m.keySet();
		 
		 for(Integer key : keys)
		 {	 
		 System.out.println(m.get(key));
	 

	 }

}
}