package com.microwang.demo.aop;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * 类名: AopConfig
 * 说明: TODO
 * 时间: 2021-09-28 14:37
 * 作者: 王钟游
 **/
@Configuration
@EnableAspectJAutoProxy
public class AopConfig {

	@Bean
	public LogAspects logAspects() {
		return new LogAspects();
	}

	@Bean
	public PurchaseCar purchaseCar() {
		return new PurchaseCar();
	}


}
