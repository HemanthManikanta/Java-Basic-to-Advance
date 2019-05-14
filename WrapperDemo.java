package com.wrapperclass.com;

public class WrapperDemo {
	
	public static void main(String[] args) {
		
		
		 int i=5;
		 Integer ii = new Integer(i);//boxing
		 Integer jj = i;//AutoBoxing
		 
		 int j = jj.intValue();//unboxing
		 int k = j; // Autounboxing
		 System.out.println(i);
	}

}
