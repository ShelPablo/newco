package com.andreitop.newco.aspect;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    private static final Logger logger = LogManager.getLogger(LoggingAspect.class);


    @Before("com.andreitop.newco.aspect.PointcutContainer.repositoryFind()")
    public void beforeRepoFind(JoinPoint joinPoint) {
        String className = joinPoint.getSignature().getDeclaringTypeName();
        String methodName = joinPoint.getSignature().getName();
        logger.info(" ---> Method " + className + "." + methodName + " is about to be called");
    }

    @After("com.andreitop.newco.aspect.PointcutContainer.repositorySave()")
    public void afterRepoSave(JoinPoint joinPoint) {
        String className = joinPoint.getSignature().getDeclaringTypeName();
        String methodName = joinPoint.getSignature().getName();
        logger.info(" ---> Method " + className + "." + methodName + " is done");
    }

    @Around("com.andreitop.newco.aspect.PointcutContainer.controllerFind()")
    public Object aroundControllerFind(ProceedingJoinPoint joinPoint) throws Throwable {

        String methodName = joinPoint.getSignature().getName();
        logger.info(" ---> Intercepting call of: " + methodName);
        long t1 = System.currentTimeMillis();
        try {
            //put a pause here so we can register an execution time
            Thread.sleep(1000L);
            return joinPoint.proceed();
        } finally {
            long t2 = System.currentTimeMillis();
            logger.info(" ---> Execution of " + methodName + " took: "
                    + (t2 - t1) / 1000 + " ms.");
        }
    }
}
