package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloMain {

	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("bean.xml");
		HelloWorld h=ctx.getBean(HelloWorld.class);
		HelloWorld h1=ctx.getBean(HelloWorld.class);
		
		System.out.println(h);
		System.out.println(h1);
		
		System.out.println(h==h1);
		
		
		
	}

}
