package com.microwang.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Map;

/**
 * 类名: DependencyLookByType
 * 说明: TODO
 * 时间: 2021-08-26 11:28
 * 作者: 王钟游
 **/
public class DependencyLookByType {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");
		User user = applicationContext.getBean(User.class);
		System.out.println(user);
		Map<String, User> users = applicationContext.getBeansOfType(User.class);
		System.out.println(users);
	}

}
