package com.revature.io;
import com.revature.beans.Person;

public class SerialDemo {

	public static void main(String[] args) {
		IO io = new IO();
		String a="banana";
		//io.writeOutsputStreamContents("Actually, Lady Gaga is a "+ a);
		//System.out.println(io.readInputStreamContents());
		Person p1= new Person("Matt", 34,275);
		Person p2= new Person("Chris", 21,175);
		Person p3= new Person("Hannah", 23,150);
		Person p4= new Person("The huntress", 28,160);
		
		IOWithCollections.personList.add(p1);
		IOWithCollections.personList.add(p2);
		IOWithCollections.personList.add(p3);
		IOWithCollections.personList.add(p4);
		
		IOWithCollections.writePersonFile();
	}
}
