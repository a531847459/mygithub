import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.datasource.DriverManagerDataSource;


public class TestJdbcDemo {

	public static void main(String[] args) throws SQLException {
//		DriverManagerDataSource dataSource=new DriverManagerDataSource();
//		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
//		dataSource.setUrl("jdbc:mysql://localhost:3306/mldnJdbc");
//		dataSource.setUsername("root");
//		dataSource.setPassword("mysqladmin");
//		System.out.println(dataSource.getConnection());
//		dataSource.getConnection().close();
		//通过spring配置文件注入的方式jdbc连接
		ApplicationContext ctx=new ClassPathXmlApplicationContext("classpath:spring/spring-*.xml");
		DataSource dataSource=ctx.getBean("dataSource", DataSource.class);
		System.out.println(dataSource.getConnection());
	}

}
