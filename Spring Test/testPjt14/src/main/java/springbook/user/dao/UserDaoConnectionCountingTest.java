package springbook.user.dao;

import java.sql.SQLException;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import springbook.user.domain.User;

public class UserDaoConnectionCountingTest {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(CountingDaoFactory.class);
		UserDao dao = ctx.getBean("userDao", UserDao.class);
		User user = new User();
		user.setId("root3");
		user.setName("¿Ã¡¯«ı");
		user.setPassword("1111");
		
		dao.insert(user);
		User test = dao.select("root3");
		
		if(test != null) {
			System.out.println(test.getId());
			System.out.println(test.getName());
			System.out.println(test.getPassword());
		}
		
		CountingConnectionMaker ccm = ctx.getBean("connectionMaker", CountingConnectionMaker.class);
		System.out.println(ccm.getCounter());
	}
}