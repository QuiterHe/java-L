package com.he.test;
import java.util.*;

/**
 * 范型  类型参数化
 */
public class GenericsTest {
	public static void main(String[] args) {
//		new List();
//        Integer[] intArray = { 1, 2, 3, 4, 5 };
//        Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4 };
//        Character[] charArray = { 'H', 'E', 'L', 'L', 'O' };
//        
//		GenericsMethod.printArray(intArray);
//		GenericsMethod.printArray(doubleArray);
//		GenericsMethod.printArray(charArray);
//		
//		System.out.println(GenericsMethod.max(1, 2, 3));
//		System.out.println(GenericsMethod.max(1.1, 2.2, 3.3));
//		System.out.println(GenericsMethod.max("apple", "orange", "pear"));
		
		
//		Box<Integer> intBox = new Box<Integer> ();
//		Box<String> strBox = new Box<String> ();
//		
//		intBox.add(1);
//		strBox.add("Hello world");
//		
//		System.out.println(intBox.get());
//		System.out.println(strBox.get());
		
		List<Integer> age = new ArrayList<Integer> ();
		List<String> name = new ArrayList<String> ();
		
		age.add(1);
		name.add("Hello world");
		
		GenericsMethod intData = new GenericsMethod();
		GenericsMethod strData = new GenericsMethod();
		intData.getData(age);
		strData.getData(name);
		
		
	}
}

// 范型方法
class GenericsMethod {
	// 范型方法 打印数组
	public static < E > void printArray( E[] array ) {
		for( E element : array ) {
			System.out.printf("%s ",element);
		}
		System.out.println();
	}
	
	// 有界类型参数
	public static < T extends Comparable <T> > T max(T x, T y, T z) {
		T max = x;
		
		if( y.compareTo(max) > 0 ) {
			max = y;
		}
		
		if( z.compareTo(max) > 0 ) {
			max = z;
		}
		
		return max;
	}
	
	// 类型通配符 T<?>
	public void getData(List<?> data) {
		System.out.println(data.get(0));
	}
}


// 范型类
class Box< T > {
	private T t;
	
	public void add(T t) {
		this.t = t;
	}
	
	public T get() {
		return t;
	}
}




