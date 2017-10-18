import java.sql.SQLException;

import org.springframework.jdbc.datasource.DriverManagerDataSource;


public class TestJdbcDemo {

	public static void main(String[] args) throws SQLException {
		DriverManagerDataSource dataSource=new DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/mldn");
		dataSource.setUsername("root");
		dataSource.setPassword("mysqladmin");
		System.out.println(dataSource.getConnection());
		dataSource.getConnection().close();
	}

}
