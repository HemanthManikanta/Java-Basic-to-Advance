package com.colectionsdemo.com;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class GenericsDemo {
	public static void main(String[] args)  {
		
		
		int value =5;
		System.out.println("below values are in list");
		List <Integer>values = new ArrayList();
		values.add(5);
		//values.add("Hemanth");
		values.add(99);
		values.add(73);
		values.add(71);
		values.add(88);
		Comparator<Integer> com = new ComparatorDemo();
		Collections.sort(values);
		//values.forEach(System.out::println);//Stream api..lambda expression
		System.out.println(values);
		System.out.println("Generic of type");
		Container<String> obj = new Container<>();
		obj.value="hemanth";
		obj.show();
	}

}

//cretion of own generic

class Container<T>{
	
	T value;
	public void show()
	{
		System.out.println(value.getClass().getName());
	}
	
}
