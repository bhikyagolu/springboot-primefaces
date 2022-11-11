package com.avosh.baseproject.validator;

import org.apache.log4j.Logger;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

@Aspect
@Component
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
            CheckScheduler checkScheduler = method.getAnnotation(CheckScheduler.class);
            schedulerId = checkScheduler.schedulerId();
            //todo start
            log.info("Task Num -- > " + schedulerId + " Start");
            point.proceed();
            //todo end

        } catch (Exception e) {
            log.error(e.getStackTrace());
        } catch (Throwable e) {
            log.error(e.getStackTrace());
        } finally {
            log.info("Task Num -- > " + schedulerId + " End");
        }
    }

}
