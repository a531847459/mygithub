package cn.mldn.myspring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import cn.mldn.myspring.context.dao.DeptDAOImpl;
import cn.mldn.myspring.context.dao.IDeptDAO;
@Configuration //表示当前的类是一个专门用于配置的实现类
public class MLDNConfig {
	//相当于<bean id="deptDAO" class="cn.mldn.myspring.context.dao.DeptDAOImpl"/>
	@Bean(name="deptDAOImpl")
	public IDeptDAO getDeptDAOInstance() {
		return new DeptDAOImpl();
	}
}
