package com.cg.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeMain {

	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("bean.xml");
		Employee emp=ctx.getBean(Employee.class);
		//emp.setAddress(new Address("Delhi", "India", 110070));
		emp.printEmployee();

	}

}
