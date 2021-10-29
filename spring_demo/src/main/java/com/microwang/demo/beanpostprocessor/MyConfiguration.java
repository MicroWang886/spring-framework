package com.microwang.demo.beanpostprocessor;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.microwang.demo.beanpostprocessor")
public class MyConfiguration {

	@Bean
	public User user() {
		return new User();
	}

}
