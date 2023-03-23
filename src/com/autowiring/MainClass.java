package com.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {
public static void main(String[] args) {
	
	ApplicationContext con = new ClassPathXmlApplicationContext("com/autowiring/autowiring.xml");
	CompanyDetails CD1=con.getBean("cmp",CompanyDetails.class);
	System.out.println(CD1);
	
	
}
}
