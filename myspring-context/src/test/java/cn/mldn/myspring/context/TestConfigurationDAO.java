package cn.mldn.myspring.context;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.mldn.myspring.config.MLDNConfig;
import cn.mldn.myspring.context.vo.Dept;
import junit.framework.TestCase;
@ContextConfiguration(locations= {"classpath:spring/spring-context.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class TestConfigurationDAO {
	@Test
	public void TestDAOAdd() {
		MLDNConfig mlc=new MLDNConfig();
		Dept vo=new Dept();
		vo.setDeptno(11L);
		vo.setDname("sim");
		TestCase.assertTrue(mlc.getDeptDAOInstance().doCreate(vo));
	}
}
