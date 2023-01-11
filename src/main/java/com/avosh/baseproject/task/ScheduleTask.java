/*******************************************************************************
 * Created by Alireza Amirkhani 2022
 ******************************************************************************/

package com.avosh.baseproject.task;

import com.avosh.baseproject.validator.CheckScheduler;
import org.springframework.context.annotation.Profile;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@Profile("production")
public class ScheduleTask implements BaseTask{

    @Scheduled(fixedRate = 100000)
    @CheckScheduler(schedulerId = 1)
    public void run() {
        System.out.println("task is running");
    }
}
