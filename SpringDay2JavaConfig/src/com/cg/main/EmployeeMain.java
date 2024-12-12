package com.cg.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.cg.bean.Employee;
import com.cg.config.IocConfig;

public class EmployeeMain {

	public static void main(String[] args) {
		ApplicationContext ctx=new AnnotationConfigApplicationContext(IocConfig.class);
		Employee e=ctx.getBean(Employee.class);
		e.printEmployee();
		
		

	}

}
