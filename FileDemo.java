package com.filesdemo.com;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileDemo {
	
	public static void main(String[] args) throws Exception {
		FileOutputStream f = new FileOutputStream("demo.txt");
		DataOutputStream data = new DataOutputStream(f);
		data.writeUTF("Demo content");
		
		FileInputStream fin = new FileInputStream("demo.txt");
		DataInputStream din = new DataInputStream(fin);
		String str = din.readUTF();
		System.out.println(str);
	}

}
