package com.microwang.demo.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.lang.annotation.Annotation;

/**
 * 类名: IOCTest
 * 说明: TODO
 * 时间: 2021-09-28 14:42
 * 作者: 王钟游
 **/
public class IOCTest {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AopConfig.class);
		PurchaseCar purchaseCar = applicationContext.getBean(PurchaseCar.class);
		purchaseCar.purchase();
	}

}
