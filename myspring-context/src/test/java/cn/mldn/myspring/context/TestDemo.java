package cn.mldn.myspring.context;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.mldn.myspring.context.service.IDeptService;
import cn.mldn.myspring.context.vo.Dept;

public class TestDemo {

	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("spring/spring-context.xml");
		IDeptService deptService=ctx.getBean("deptServiceImpl", IDeptService.class);
		Dept vo=new Dept();
		vo.setDeptno(11L);
		vo.setDname("sim");
		deptService.add(vo);
	}

}
