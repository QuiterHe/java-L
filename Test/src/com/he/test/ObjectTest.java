package com.he.test;

public class ObjectTest {
	public static void main(String[] args) {
//		Animal animal = new Animal();
//		Animal dog = new Dog();
//		Animal other = new Other();
//		animal.move();  // 虚方法
//		dog.move();
//		dog.bark();   //The method bark() is undefined for the type Animal
//		new Animal(); // 抽象类不能被实例化
		show(new Cat());
		show(new Dog());
		
		Animal a = new Cat();  // 向上转型  
		a.eat();               // 调用的是 Cat 的 eat
		Cat c = (Cat)a;        // 向下转型  
		c.move();        // 调用的是 Cat 的 move
	}
	
	public static void show(Animal animal) {
		animal.eat();
		
		if( animal instanceof Cat ) {
			Cat cat = (Cat) animal; // Animal => Cat 向下转型
			cat.move();
		} else if ( animal instanceof Dog ) {
			Dog dog = (Dog) animal; // Animal => Dog 向下转型
			dog.move();
		}
	}
}


// 多态
abstract class Animal {
	abstract void eat();
	
	public void move() {
		System.out.println("Animal can move!");
	}
}

class Dog extends Animal {
	// 子类必须实现抽象类的抽象方法
	public void eat() {
		System.out.println("Dog eat bone");
	}
	
	public void move() {
//		super.move();
		System.out.println("Dog can move!");
	}
	
	public void bark() {
		System.out.println("Dog can bark!");
	}
}

class Cat extends Animal {
	public void eat() {
		System.out.println("Cat eat fish");
	}
	
	public void move() {
		System.out.println("Cat can move!");
	}
}

class Other {
	
}
