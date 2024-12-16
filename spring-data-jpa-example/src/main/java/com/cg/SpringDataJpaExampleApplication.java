package com.cg;

import java.time.LocalDate;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.cg.bean.Employee;
import com.cg.service.EmployeeService;
import com.cg.service.IEmployeeService;

@SpringBootApplication
public class SpringDataJpaExampleApplication {
	static Logger logger=LoggerFactory.getLogger(SpringDataJpaExampleApplication.class);
	public static void main(String[] args) {
		ApplicationContext ctx= SpringApplication.run(SpringDataJpaExampleApplication.class, args);	
		IEmployeeService es=ctx.getBean(EmployeeService.class);
		//es.createEmployee(new Employee("Deepti", LocalDate.of(2002,7, 20), 85000, "HR"));
		
		//es.getEmployeeByNameLike("R%").forEach(e->System.out.println(e));
		
		Employee e=es.getEmployeeByID(2);
		e.setName("Amita");
		es.updateEmployee(e);
		
	}

}
