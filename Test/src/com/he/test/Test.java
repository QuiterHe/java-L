package com.he.test;

import java.text.SimpleDateFormat;
import java.util.Date;


public class Test {
	int num;
	
	public Test() {
		System.out.println("constructor");
	}
	
	public Test(String str) {
		this();   // this关键字
		System.out.println("constructor-str");
	}
	
	public static void main(String[] args) {
//		new Hello();
		
		Test test = new Test("");
		
		test.getDate();
		test.getNum(10);
	}
	
	public void getNum(int nums) {
		System.out.println(num);
		System.out.println(this.num);
	}
	
	public void getDate() {
		String date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
		System.out.println(date);
	}
}
