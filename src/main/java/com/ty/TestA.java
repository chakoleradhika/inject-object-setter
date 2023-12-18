package com.ty;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestA 
{
	public static void main(String[] args) {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("my_config.xml");
		
		Person person = (Person) context.getBean("myPerson");
		person.use();
		
		System.out.println("===============================");
		Mobile mobile = person.getMobile();
		mobile.ring();
	}

}
