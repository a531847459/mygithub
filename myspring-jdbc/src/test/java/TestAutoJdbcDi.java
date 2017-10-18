import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Date;

import javax.annotation.Resource;
import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.core.PreparedStatementSetter;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.mchange.v1.db.sql.PSManager;


@ContextConfiguration(locations= {"classpath:spring/spring-*.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class TestAutoJdbcDi {
	@Resource
	private DataSource dataSource;
	@Resource
	private JdbcTemplate jdbcTemplate;
	@Test
	public void testGetConnection() throws SQLException {
		System.out.println(dataSource.getConnection());
	}
	@Test
	public void testAdd() {
		String sql="insert into news(title,pubdate,note,price,readcount) values(?,?,?,?,?)";
		String title="zzzz";
		Date pubdate=new Date();
		String note="1111";
		Double price=18.8;
		int readcount=290;
		System.out.println(this.jdbcTemplate.update(sql,title,pubdate,note,price,readcount));
	}
	@Test
	public void testAdd1() {
		String sql="insert into news(title,pubdate,note,price,readcount) values(?,?,?,?,?)";
		String title="zzzz";
		Date pubdate=new Date();
		String note="1111";
		Double price=18.8;
		int readcount=290;
		int len=this.jdbcTemplate.update(sql,new PreparedStatementSetter() {
			
			@Override
			public void setValues(PreparedStatement psmt) throws SQLException {
				psmt.setString(1, title);
				psmt.setDate(2, new java.sql.Date(pubdate.getTime()));
				psmt.setString(3, note);
				psmt.setDouble(4, price);
				psmt.setInt(5, readcount);
			}
		});
		System.out.println(len);
	}
	@Test
	public void testAdd2() {
		KeyHolder keyHolder=new GeneratedKeyHolder();
		String sql="insert into news(title,pubdate,note,price,readcount) values(?,?,?,?,?)";
		String title="zzzz";
		Date pubdate=new Date();
		String note="1111";
		Double price=18.8;
		int readcount=290;
		int len=this.jdbcTemplate.update(new PreparedStatementCreator() {
			@Override
			public PreparedStatement createPreparedStatement(Connection conn) throws SQLException {
				PreparedStatement psmt=conn.prepareStatement(sql);
				psmt.setString(1, title);
				psmt.setDate(2, new java.sql.Date(pubdate.getTime()));
				psmt.setString(3, note);
				psmt.setDouble(4, price);
				psmt.setInt(5, readcount);
				return psmt;
			}
		},keyHolder);
		System.out.println(len+"----"+keyHolder.getKey());
	}
}
