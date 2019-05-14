package com.colectionssetdemo.com;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {
	public static void main(String[] args) {
		
		
		Set<Integer> s = new HashSet<>();
		Set<Integer> se = new TreeSet<>();
		s.add(1);  se.add(6666);
		s.add(22); se.add(333);
		s.add(010); se.add(444);
		s.add(82);   se.add(1555);
		
		for(int i:s) {
			System.out.println(i);
		}
		for(int i:se) {
			System.out.println(i);
		}
		
	}

}
