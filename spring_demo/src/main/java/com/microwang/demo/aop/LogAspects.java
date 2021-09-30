package com.microwang.demo.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;

import java.util.Arrays;

/**
 * 类名: LogAspects
 * 说明: TODO
 * 时间: 2021-09-26 16:30
 * 作者: 王钟游
 **/
@Aspect
public class LogAspects {

    @Pointcut("execution(public * com.microwang.demo.aop.PurchaseCar.*(..))")
    public void pointCut() {}


    @After("pointCut()")
    public void logEnd(JoinPoint joinPoint) {
        System.out.println(""+joinPoint.getSignature().getName()+"除法结束。。。。参数列表是：{"+Arrays.asList(joinPoint.getArgs())+"}");
    }

	@Before("pointCut()")
	public void logStart(JoinPoint joinPoint) {
		System.out.println(""+joinPoint.getSignature().getName()+"运行。。。。@Before参数列表是：{"+ Arrays.asList(joinPoint.getArgs())+"}");
	}

    @AfterReturning(value = "pointCut()", returning = "result")
    public void logReturn(Object result) {
        System.out.println("除法正常返回。。。。运行结果： {"+result+"}");
    }

    @AfterThrowing(value = "pointCut()",throwing = "exception")
    public void logException(Exception exception) {
        System.out.println("除法异常。。。。异常信息： {}");
    }
}
