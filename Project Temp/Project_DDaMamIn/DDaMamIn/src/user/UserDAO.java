package user;

import java.util.List;

import jdbcUtil.JdbcTemplate;
import rowmapper.UserRowMapper;

public class UserDAO {
	JdbcTemplate jdbc = new JdbcTemplate();
	
	public void insert(UserVO vo) {
		String sql = "insert into user "
				+ "(u_id, u_pw, u_name, u_email) "
				+ "values(?,?,?,?);";
		try {
			jdbc.update(sql, vo.getU_id(), vo.getU_pw(), vo.getU_name(), vo.getU_email());
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public List<UserVO> findAll() {
		List<UserVO> ls = null;
		String sql = "select  * from user";
		try {
			ls = jdbc.query(sql, new UserRowMapper());
		} catch(Exception e) {
			e.printStackTrace();
		}
		return ls;
	}
}
