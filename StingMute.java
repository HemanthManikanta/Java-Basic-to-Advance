package com.wrapperclass.com;

public class StingMute {
	public static void main(String[] args) {
		
		String str = new String("Hemanth");
		System.out.println(str);
		//to attach "Mani kanta to that String below code"
	    StringBuilder builder = new StringBuilder("Hemanth"); 
		builder.append(" Manikanta");
		System.out.println(builder);
		StringBuffer buffer = new StringBuffer("Divya");
		buffer.append("Hemanth");
		System.out.println(buffer);
	}

}
