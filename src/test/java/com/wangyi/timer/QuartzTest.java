package com.wangyi.timer;

import com.wangyi.timer.task.HelloJob;
import org.junit.Test;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.Trigger;
import org.quartz.impl.JobDetailImpl;
import org.quartz.impl.StdSchedulerFactory;

import static org.quartz.SimpleScheduleBuilder.simpleSchedule;
import static org.quartz.TriggerBuilder.newTrigger;

/**
 * @author:wangyi
 * @Date:2019/8/2
 */
public class QuartzTest {

    @Test
    public void test(){
        try {
            // Grab the Scheduler instance from the Factory
            Scheduler scheduler = StdSchedulerFactory.getDefaultScheduler();
            // and start it off

            JobDetailImpl job = new JobDetailImpl();
            job.setName("jobA");
            job.setGroup("group1");
            job.setJobClass(HelloJob.class);
            //JobDetail job = new JobDetailImpl("job1","group1",HelloJob.class);

            Trigger trigger = newTrigger()
                    .withIdentity("myTrigger", "group1")
                    .startNow()
                    .withSchedule(simpleSchedule()
                            .withIntervalInMilliseconds(40)
                            .repeatForever())
                    .build();

            scheduler.scheduleJob(job,trigger);
            scheduler.start();
            Thread.sleep(1000);
            scheduler.shutdown();

        } catch (SchedulerException se) {
            se.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
