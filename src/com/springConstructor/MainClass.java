package com.springConstructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		ApplicationContext con = new ClassPathXmlApplicationContext("com/springConstructor/springConstructor.xml");
		UserParent u1 = con.getBean("UP1", UserParent.class);
		System.out.println(u1);
	}
}
