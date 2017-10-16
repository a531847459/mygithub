package cn.mldn.myspring.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDemo {

	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("spring/spring-di.xml");
//		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("spring/spring-di.xml");
		System.out.println(ctx.getBean("emp"));
		System.out.println(ctx.getBean("dept"));
		System.out.println("Bean调用"+ctx.getBean("message"));
		//注销操作需要手动调用,通过ClassPathXmlApplicationContext调用
//		ctx.registerShutdownHook();
	}

}
