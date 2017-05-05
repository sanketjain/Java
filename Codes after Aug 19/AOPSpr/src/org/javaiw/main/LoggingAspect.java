package org.javaiw.main;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LoggingAspect {
	
	@After("bean_Name_Methods()")
	public void logAdvice(){
		System.out.println("running log advice no. 1");
	}
	
	@Pointcut("execution(public * org.javaiw.model.*.*ame(..))")
	public void bean_Name_Methods(){}
	
/*	@Before("execution(public String org.javaiw.model.*.to*())")
	//("execution(public String org.javaiw.model.*.get*())")
	//("execution(public * *())")
	//("execution(public void org.javaiw.model.*.*(*))")
	//("execution(public void org.javaiw.model.*.set*(..))")
//	("execution(public void set*name(..))")
	public void logAdvice(){
		System.out.println("Log advice running");
		*/
	
	}


