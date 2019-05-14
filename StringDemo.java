package com.wrapperclass.com;

public class StringDemo {
	
	public static void main(String[] args) {
		
		
		String str = "hemanth,kishore,satish,dileep";
		String names[]=str.split(",");
		for(String val:names)
			System.out.println(val);
	
     
	
	}

}
