package cn.mldn.myspring.schdule;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@ContextConfiguration(locations= {"classpath:spring/spring-*.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class TestSchduleQuarz {
	@Test
	public void testQuarz() {
		try {
			TimeUnit.MINUTES.sleep(10);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
