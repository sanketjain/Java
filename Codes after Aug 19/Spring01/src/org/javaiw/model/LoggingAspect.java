package org.javaiw.model;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LoggingAspect {
	
	@Before("execution(public void setPname(String pname))")
	public void logAdvice(){
		System.out.println("Log advice running");
	}
}

