package com.he.test;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static void main(String[] args) {
		// ApplicationContext 容器
		/* ClassPathXmlApplicationContext实现 */
//		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
//		HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
//		
//		System.out.println(obj.getMessage());
		
		/* FileSystemXmlApplicationContext实现 */
		ApplicationContext context = new FileSystemXmlApplicationContext("/src/Beans.xml");
		HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
		System.out.println(obj.getMessage());
		obj.setMessage("Hello ES!");
		System.out.println(obj.getMessage());
		
		HelloWorld obj2 = (HelloWorld) context.getBean("helloWorld");
		System.out.println(obj2.getMessage());
		
		// BeanFactory 容器 -- 在4.3以后直接用ApplicationContext 代替
//		XmlBeanFactory factory = new XmlBeanFactory
//                  (new ClassPathResource("Beans.xml"));
//		HelloWorld obj = (HelloWorld) factory.getBean("helloWorld");
//		System.out.println(obj.getMessage() + "beanfactory");
	}
}
