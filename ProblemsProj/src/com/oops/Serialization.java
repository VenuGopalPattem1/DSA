package com.oops;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/*serialization is the process of converting java objects into series of bits
 *  and bytes to send over the network*/
public class Serialization {
	public static void main(String[] args) throws Exception {
		Person p=new Person(10, "venu gopal");
		FileOutputStream fo=new FileOutputStream("person.ser");
		ObjectOutputStream ob=new ObjectOutputStream(fo);
		ob.writeObject(p);
		ob.close();
		System.out.println("serialization done");
		FileInputStream fi=new FileInputStream("person.ser");
		ObjectInputStream os=new ObjectInputStream(fi);
		Object obj=os.readObject();
		Person p1=(Person) obj;
		System.out.println(p1.name+"   "+p1.id);
		os.close();
		System.out.println("de-serialization done");
	}
}

class Person implements Serializable{
	int id;
	String name;
	public Person(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
}
