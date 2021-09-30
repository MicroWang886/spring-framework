package com.microwang.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 类名: DependencyLook
 * 说明: TODO
 * 时间: 2021-08-26 11:14
 * 作者: 王钟游
 **/
public class DependencyLook {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");
		User user = (User) applicationContext.getBean("useralise");
		System.out.println(user);
	}

}
