package com.serialization.demo;

import java.beans.XMLEncoder;
import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SerializeXml {
	public static void main(String[] args) {
		
		
		try{
			Student st1 = new Student();
		
		st1.setRollno(101);
		st1.setSname("Mahesh");
		Student st2 = new Student();
		st2.setRollno(102);
		st2.setSname("Babu");
		List<Student> s = new ArrayList<>();
		s.add(st1);
		s.add(st2);
		College c = new College();
		c.setStudents(s);
		XMLEncoder x = new XMLEncoder(new BufferedOutputStream(new FileOutputStream("mycollege.xml")));
		x.writeObject(c);
		x.close();
	}
	
		catch(FileNotFoundException ex) {
			Logger.getLogger(SerializeXml.class.getName()).log(Level.SEVERE,null,ex);
		
		}
		
	}

}
