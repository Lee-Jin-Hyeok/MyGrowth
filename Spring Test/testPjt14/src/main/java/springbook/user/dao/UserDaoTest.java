package springbook.user.dao;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.sql.SQLException;

import javax.sql.DataSource;

import org.junit.Before;
import org.junit.Test;
import org.springframework.jdbc.datasource.SingleConnectionDataSource;

import springbook.user.domain.User;

public class UserDaoTest {
	private UserDao dao;
	
	private User user1;
	private User user2;
	private User user3;
	
	@Before
	public void setUp() {
		DataSource dataSource = new SingleConnectionDataSource("jdbc:mysql//127.0.0.1/test_db", "root", "1111", true);
		dao.setDataSource(dataSource);
		
		this.user1 = new User("id1", "name1", "pw1");
		this.user2 = new User("id2", "name2", "pw2");
		this.user3 = new User("id3", "name3", "pw3");
	}
	
	@Test
	public void insertAndSelect() throws SQLException {
		System.out.println(dao);
		dao.deleteAll();
		assertThat(dao.getCount(), is(0));
		
		dao.insert(user1);
		assertThat(dao.getCount(), is(1));
		
		dao.insert(user2);
		assertThat(dao.getCount(), is(2));
		
		dao.insert(user3);
		assertThat(dao.getCount(), is(3));
		
		dao.select("id1").toString();
		dao.select("id2").toString();
		dao.select("id3").toString();
	}

//	@Test(expected=EmptyResultDataAccessException.class)
//	public void getUserFailure() throws SQLException {
//		dao.deleteAll();
//		assertThat(dao.getCount(), is(0));
//		
//		dao.select("unknown_id");
//	}
}