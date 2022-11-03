package com.misterdiallo.backend.spring_chat_app.task;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.TimeUnit;

@Component
public class ScheduledTasks {

    private static final Logger logger = LoggerFactory.getLogger(ScheduledTasks.class);
    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");

//    // add scheduled methods here
//    @Scheduled(fixedRate = 2500)
//    public void scheduleTaskWithFixedRate() {
//        logger.info("Fixed Rate Task: Current Time - {}", formatter.format(LocalDateTime.now()));
//    }
//
//    @Scheduled(fixedDelay = 2000)
//    public void scheduleTaskWithFixedDelay() throws InterruptedException {
//        logger.info("Fixed Delay Task: Start Time - {}", formatter.format(LocalDateTime.now()));
//
//        // add some virtual processing time
//        TimeUnit.SECONDS.sleep(3);
//
//        logger.info("Fixed Delay Task: End Time - {}", formatter.format(LocalDateTime.now()));
//    }
//
//    @Scheduled(fixedRate = 2000, initialDelay = 5000)
//    public void scheduleTaskWithFixedRateAndInitialDelay() {
//        logger.info("Fixed Rate Task with Initial Delay: Current Time - {}", formatter.format(LocalDateTime.now()));
//    }
//
//    // The following tasks are scheduled to be executed at 4:45 AM on the 10th day of every month:
//    @Scheduled(cron = "0 1 5 3 * ?")
//    public void scheduleTaskWithCronExpression() {
//        //Cron expressions are somehow complex to write and understand. crontab.guru is a nice little tool that makes it easy to generate cron schedule expressions
//        logger.info("Cron Task: Current Time - {}", formatter.format(LocalDateTime.now()));
//    }



}
