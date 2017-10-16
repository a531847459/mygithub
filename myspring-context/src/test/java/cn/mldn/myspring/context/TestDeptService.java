package cn.mldn.myspring.context;

//import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.mldn.myspring.context.service.IDeptService;
import cn.mldn.myspring.context.vo.Dept;
import junit.framework.TestCase;
@ContextConfiguration(locations= {"classpath:spring/spring-context.xml"})//进行资源文件定位
@RunWith(SpringJUnit4ClassRunner.class) //设置要使用的测试工具
public class TestDeptService {
//	@Resource(name="deptServiceNew")
	private IDeptService deptService;
	@Test
	public void testAdd() {
		Dept vo=new Dept();
		vo.setDeptno(11L);
		vo.setDname("sim");
		TestCase.assertTrue(!deptService.add(vo));
	}
}
