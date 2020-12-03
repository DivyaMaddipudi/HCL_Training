package com.bankapp.model.service.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ControllerAdvice;


@Component
@Aspect
public class LoggingAspect {
	
	private Logger logger = LoggerFactory.getLogger(LoggingAspect.class);

	@Around("@annotation(Loggable)")
	public Object doLogging(ProceedingJoinPoint pjp) throws Throwable {
		long start = System.currentTimeMillis();
		Object val = pjp.proceed();
		long end = System.currentTimeMillis();
		long timeTaken = end - start;
		logger.info("time taken" + timeTaken + pjp.getSignature().getDeclaringTypeName());
		return val;
	}

}
