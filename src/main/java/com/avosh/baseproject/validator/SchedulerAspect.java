package com.avosh.baseproject.validator;

import org.apache.log4j.Logger;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;

import java.lang.reflect.Method;

@Aspect
public class SchedulerAspect {
    private final static Logger log = Logger.getLogger(SchedulerAspect.class);

    @Pointcut("execution(* com.avosh.baseproject.task.*.run()) && " +
            "@annotation(com.avosh.baseproject.validator.CheckScheduler)")
    private void schedulerPointcut() {
    }

    @Around("schedulerPointcut()")
    public void checkSchedulerState(ProceedingJoinPoint point) {
        int schedulerId = -1;
        try {
            MethodSignature signature = (MethodSignature) point.getSignature();
            Method method = signature.getMethod();
            CheckScheduler busyAnnotation = method.getAnnotation(CheckScheduler.class);
            schedulerId = busyAnnotation.schedulerId();
            //todo start
            log.info("Task Num -- > " + schedulerId + " Start");
            point.proceed();
            log.info("Task Num -- > " + schedulerId + " End");

            //todo end

        } catch (Exception e) {
            log.error(e.getStackTrace());
        } catch (Throwable e) {
            log.error(e.getStackTrace());

        }
    }

}
