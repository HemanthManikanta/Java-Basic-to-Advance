package com.filesdemo.com;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

public class PropertiesOfFile  {
	public static void main(String[] args) throws Exception {
		Properties p = new Properties();
		/*
		 * OutputStream os = new FileOutputStream("dataConfig.txt");
		 * p.setProperty("url", "localhost:3306/myDb"); p.setProperty("pass", "0000");
		 * p.store(os, null);
		 */
		InputStream in = new FileInputStream("dataConfig.txt");
		p.load(in);
		System.out.println(p.getProperty("url"));
	}

}
