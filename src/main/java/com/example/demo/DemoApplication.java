package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-config.xml");
		System.out.println("Hello world");

		System.out.println("IoC Container: " + ctx);

		System.out.println("Bean count: " + ctx.getBeanDefinitionCount());

		// STEP 2: Access beans
		Greetings greetings1 = ctx.getBean("greetings1", Greetings.class);
		System.out.println(greetings1.getMessage());

		Greetings greetings2 = ctx.getBean("greetings2", Greetings.class);
		System.out.println(greetings2.getMessage());




//		SpringApplication.run(DemoApplication.class, args);
	}

}
