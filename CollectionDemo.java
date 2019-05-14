package com.colectionsdemo.com;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionDemo {
	
	public static void main(String[] args) {
		
		
		Collection<Integer> c = new ArrayList<>();
		c.add(1);
		/*
		 * c.add("Hemanth"); c.add(22.5);
		 */
		c.add(51595616);
		//System.out.println(c);
		
		Iterator i =c.iterator();
		while(i.hasNext()) {
			
		
		System.out.println(i.next());
		}
	}

}
