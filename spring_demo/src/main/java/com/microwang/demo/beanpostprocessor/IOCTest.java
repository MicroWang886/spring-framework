package com.microwang.demo.beanpostprocessor;

import com.microwang.demo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class IOCTest {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MyConfiguration.class);
		User user = applicationContext.getBean(User.class);
		System.out.println(user);
	}

}
