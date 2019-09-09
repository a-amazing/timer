package com.wangyi.timer.task;

import org.quartz.DisallowConcurrentExecution;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author:wangyi
 * @Date:2019/9/9
 */
@DisallowConcurrentExecution
public class QuartzJobFactoryDisallowConcurrentExecution {
    public final Logger log = LoggerFactory.getLogger(this.getClass());


    public void execute(JobExecutionContext context) throws JobExecutionException {
        ScheduleJob scheduleJob = (ScheduleJob) context.getMergedJobDataMap().get("scheduleJob");
        TaskUtils.invokMethod(scheduleJob);


    }
}
