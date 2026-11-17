package com.arfoods.aspect;

import org.aopalliance.intercept.Joinpoint;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Aspect
public class LoggingAspect {

		private static final	Logger log = LoggerFactory.getLogger(LoggingAspect.class);
	
		@Before("execution(com.arfoods.controller.itemController(....))")
	public void logBefore(JoinPoint joinPoint)
	{
		log.info("entered to method: {} ",joinPoint.getSignature().getName() );
	}
		
		
		@After("execution(com.arfoods.controller.itemController.*(...)")
		public void logAfter(JoinPoint joinPoint)
		{
			log.info("Returning from method: {}", joinPoint.getSignature().getName());
		}
		
		
		@AfterThrowing(
		pointcut = "execution(com.arfoods.service.impl.*.*()",
		throwing ="ex"
		)
		public void handleException(Exception ex)
		{
			log.error("encountered Exception : {}",ex.getMessage() );
			
		}
		
		
		@Around("execution(com.arfoods.service.impl.*.*(...)")
		public void logAroundMethod() {
			
			log.info("Entered into method");
			
			log.info("returning from method");
			
		}
}
 