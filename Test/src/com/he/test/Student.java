package com.he.test;
import java.util.Date;
import java.io.*;

public class Student implements Serializable {
	public int age;
	public String name;
	
	public Student(String studentName) {
		name = studentName;
	}
	
	// 获取年龄
	public int getAge() {
		return age;
	}
	
	// 设置年龄
	public void setAge(int a) {
		age = a;
	}
	
	public static void main(String[] args) {
		// TODO
		int num = 2;   // 局部变量必须初始化
		System.out.println(num);
		
		// String
		String str = "Hello world";
		System.out.println(str);
		System.out.println(str + "!");
		System.out.println(str.length());
		
		// StringBuffer StringBuilder
		StringBuffer strBuffer = new StringBuffer("Hello");
		System.out.println(strBuffer);
		System.out.println(strBuffer.indexOf("llo"));
		
		// Date
		Date date = new Date();
		System.out.println(date.toString());
		
		// Command
		System.out.println("=============");
		for(String i : args) {
			System.out.println(i);
		}
		System.out.println("=============");
		
		System.out.println(4.1>4);
		Student student = new Student("小茗");
		System.out.println(student.age);
		student.setAge(15);
		System.out.println( student.getAge() );
		System.out.println(student.name);
	}
}
