package com.avosh.baseproject.validator;

import com.avosh.baseproject.dto.SchedulerDto;
import com.avosh.baseproject.services.SchedulerService;
import org.apache.log4j.Logger;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

@Aspect
@Component
public class MetricAspect {
    private final static Logger log = Logger.getLogger(MetricAspect.class);

    @Pointcut("@annotation(com.avosh.baseproject.validator.Metric)")
    private void metricPointcut() {

    }

    @Around("metricPointcut()")
    public void checkSchedulerState(ProceedingJoinPoint point) {
        long start = System.currentTimeMillis();
        String root = null;
        String  methodName = null;
        try {
            MethodSignature signature = (MethodSignature) point.getSignature();
            Method method = signature.getMethod();
            methodName = method.getName();
            root = method.getDeclaringClass().getName() +" "+method.getName();
            log.debug("Method  " + methodName + " in " + root + " is Started");
            point.proceed();


        } catch (Exception e) {
            log.error(e.getStackTrace());
        } catch (Throwable e) {
            log.error(e.getStackTrace());
        } finally {
            long end = System.currentTimeMillis();
            log.debug("Method  " + methodName + " in " + root + " is Ended in " + (end - start) + " milliseconds");
        }
    }

}
