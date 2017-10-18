package cn.mldn.myspring.schdule.quartz;

import java.text.SimpleDateFormat;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
@Component
public class MyTaskSpring {
	@Scheduled(cron="0 * * * * ?")
	public void myTask() {
		System.out.println("【 当前时间】"+new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS").format(new java.util.Date()));
	}
}
