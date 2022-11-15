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
public class SchedulerAspect {
    private final static Logger log = Logger.getLogger(SchedulerAspect.class);
    @Autowired
    SchedulerService schedulerService;

    @Pointcut("execution(* com.avosh.baseproject.task.*.run()) && " +
            "@annotation(com.avosh.baseproject.validator.CheckScheduler)")
    private void schedulerPointcut() {

    }

    @Around("schedulerPointcut()")
    public void checkSchedulerState(ProceedingJoinPoint point) {
        long start = System.currentTimeMillis();
        int schedulerId = -1;
        try {
            MethodSignature signature = (MethodSignature) point.getSignature();
            Method method = signature.getMethod();
            CheckScheduler checkScheduler = method.getAnnotation(CheckScheduler.class);
            schedulerId = checkScheduler.schedulerId();
            //todo start
            log.info("Task Num " + schedulerId + " is Started");
            SchedulerDto res = schedulerService.retrieveById(Long.valueOf(schedulerId));
            if(res.getStatus() == false){
                res.setStatus(true);
                schedulerService.save(res);
                point.proceed();
                res.setStatus(false);
                schedulerService.save(res);
            }

            //todo end

        } catch (Exception e) {
            log.error(e.getStackTrace());
        } catch (Throwable e) {
            log.error(e.getStackTrace());
        } finally {
            long end = System.currentTimeMillis();
            log.info("Task Num " + schedulerId + " is Ended in "+(end - start) +" milliseconds");
        }
    }

}
