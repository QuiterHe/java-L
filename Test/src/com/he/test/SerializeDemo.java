package com.he.test;
import java.io.*;

public class SerializeDemo {
	public static void main(String[] args){
		
		reSerialize();
		return;
		
//		Student student = new Student("hezhang");
//		student.setAge(24);
//	
//		try {
//			FileOutputStream fileOut = new FileOutputStream("/tmp/student.ser");
//			ObjectOutputStream objectStream = new ObjectOutputStream(fileOut);
//			objectStream.writeObject(student);
//			objectStream.close();
//			fileOut.close();
//			System.out.printf("Serialized data is saved in /tmp/student.ser");
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		
	}
	
	public static void reSerialize() {
		Student s = null;
		
		try {
			FileInputStream fileIn = new FileInputStream("/tmp/student.ser");
			ObjectInputStream objectStream = new ObjectInputStream(fileIn);
			try {
				s = (Student) objectStream.readObject();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			objectStream.close();
			fileIn.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		int age = s.getAge();
		System.out.println(age);
		
	}
}
