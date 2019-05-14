package com.colectionsdemo.com;

import java.util.Collection;
import java.util.Vector;

public class VectorsDemo {

	
	//vector is a dynamic array
	public static void main(String[] args) {
		Vector v = new Vector();
		v.add(2);
		v.add(7);
		v.add(22);
		v.add(7);
		v.add(100);
		v.add(73);
		v.add(4);
		v.add(74);
		v.add(4);
		v.add(76);
		v.add(47);
		v.add(27);
		v.add(34);
		v.add(57);
		v.add(64);
		v.add(77);
		v.add(84);
		v.add(97);
		v.add(224);
		v.add(17);
		v.remove(7);
		//Collection.sort(v);
	
		System.out.println(v.capacity());
		for(Object i: v) {
			System.out.println(i);
		}
	}
}
