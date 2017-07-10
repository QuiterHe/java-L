package com.he.test;

public class Hello {
	// 成员变量
	int number;
	
	// constructor(构造函数)
	public Hello() {
		System.out.println("Hello this's auto exec!");
	}
	
	// main函数(函数入口)
	public static void main(String[] args ) {
		//System.out.println(number);
		System.out.println("Hello world");
		System.out.println(getNum());
	}
	
	// 成员函数
	public static int getNum() {
		return 1;
	}
}
