package com.he.test;

import java.util.Vector;
import java.util.Enumeration;
import java.util.BitSet;
import java.util.Stack;
import java.util.HashMap;
import java.util.Map;

/**
 * Java数据结构 
 */
public class JavaDS {
	public static void main(String[] args) {
//		EnumerationTester.test();
//		BitSetDemo.test();
//		StackDemo.test();
		HashMapDemo.test();
		
	}
}

// 字典（Dictionary） 类是一个抽象类，它定义了键映射到值的数据结构。 
// 不过已经被Map 接口所取代
// HashMap HashTable(支持同步)
// 集合接口
class  HashMapDemo {
	public static void test() {
		Map kv = new HashMap();
		kv.put("Tom", 1);
		kv.put("Jerry", 2);
		kv.put("Andy", 3);
		
		System.out.println(kv);
		System.out.println(kv.get("a"));
		System.out.println(kv.get("Jerry"));
	}
}

// 枚举（The Enumeration）接口定义了一种从数据结构中取回连续元素的方式。
// 向量（Vector）类和传统数组非常相似，但是Vector的大小能根据需要动态的变化。
class EnumerationTester {
	public static void test() {
		Enumeration days;
		Vector dayNames = new Vector();
		
		dayNames.add("Sunday");
		dayNames.add("Monday");
		dayNames.add("Tuesday");
		dayNames.add("Wednesday");
		dayNames.add("Thursday");
		dayNames.add("Friday");
		dayNames.add("Saturday");
		
		days = dayNames.elements();
		
		while( days.hasMoreElements() ) {
			System.out.println(days.nextElement());
		}
		
	}
}


// Stack 栈 LIFO 继承于Vector
class StackDemo {
	public static void test() {
		Stack stack = new Stack();
		
		stack.push(1);
		stack.push(2);
		stack.push(3);
		
		System.out.println(stack);
		
		stack.pop();
		
		System.out.println(stack);
		
		stack.peek();
		System.out.println(stack);
		
	}
}



// 位集合类实现了一组可以单独设置和清除的位或标志
class BitSetDemo {

	  public static void test() {
	     BitSet bits1 = new BitSet(16);
	     BitSet bits2 = new BitSet(16);
	      
	     // set some bits
	     for(int i=0; i<16; i++) {
	        if((i%2) == 0) bits1.set(i);
	        if((i%5) != 0) bits2.set(i);
	     }
	     System.out.println("Initial pattern in bits1: ");
	     System.out.println(bits1);
	     System.out.println("\nInitial pattern in bits2: ");
	     System.out.println(bits2);

	     // AND bits
	     bits2.and(bits1);
	     System.out.println("\nbits2 AND bits1: ");
	     System.out.println(bits2);

	     // OR bits
	     bits2.or(bits1);
	     System.out.println("\nbits2 OR bits1: ");
	     System.out.println(bits2);

	     // XOR bits
	     bits2.xor(bits1);
	     System.out.println("\nbits2 XOR bits1: ");
	     System.out.println(bits2);
	  }
} 
