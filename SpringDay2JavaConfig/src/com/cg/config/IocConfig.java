package com.cg.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;


@Configuration
@ComponentScan("com")
@PropertySource(value = "classpath:data.properties")
public class IocConfig {
	/*
	 * @Bean(name = "e") public Employee getBean() { //Employee e=new Employee();
	 * //e.setAddress(getBean1()); return new Employee(); }
	 * 
	 * @Bean(name="add") public Address getBean1() { Address obj=new Address();
	 * obj.setCity("Karanchi"); obj.setCountry("Pakistan"); obj.setZip(1234570);
	 * return obj; }
	 * 
	 * @Bean(name = "address") public Address getBean2() { Address obj=new
	 * Address(); obj.setCity("Delhi"); obj.setCountry("India"); obj.setZip(110070);
	 * 
	 * return obj; }
	 */
}
