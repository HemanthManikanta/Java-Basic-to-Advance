package com.serialization.demo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializationDemo {
	public static void main(String[] args) throws Exception {
		
		save obj = new save();
		obj.i=4;
		FileOutputStream os = new FileOutputStream("demo.txt");
		ObjectOutputStream oos = new ObjectOutputStream(os);
		oos.writeObject(obj);
		
		FileInputStream is = new FileInputStream("demo.txt");
		ObjectInputStream ios = new ObjectInputStream(is);
		save obj1 = (save)ios.readObject();
		System.out.println("value is"+obj1.i);
	}
		
		
	}
	class save implements Serializable{
		int i;
	}

// to store objects in files
