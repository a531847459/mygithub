package cn.mldn.myspring.schdule.quartz;

import java.text.SimpleDateFormat;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.scheduling.quartz.QuartzJobBean;

public class MyTask extends QuartzJobBean {//定义了一个专门负责任务处理的程序类

	@Override
	protected void executeInternal(JobExecutionContext arg0) throws JobExecutionException {
		System.out.println("【 当前时间】"+new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS").format(new java.util.Date()));
	}

}
