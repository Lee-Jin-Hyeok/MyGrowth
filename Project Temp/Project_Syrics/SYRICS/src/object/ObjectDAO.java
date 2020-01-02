package object;

import java.util.List;

import jdbcUtil.JdbcTemplate;
import rowmapper.ObjectRowMapper;

public class ObjectDAO {
	JdbcTemplate jdbc = new JdbcTemplate();
	
	public List<ObjectVO> findAll(String condition, String search) {
		List<ObjectVO> ls = null;
		String sql = "select * from object";
		
		if(condition == null || condition == "��ü");
		else if(condition.equals("����"))
			sql = sql + " where title like '%" + search + "%'";
		else if(condition.equals("����"))
			sql = sql + " where singer like '%" + search + "%'";
		else if(condition.equals("����"))
			sql = sql + " where song_title like '%" + search + "%'";
		System.out.println("sql : " + sql);
		
		try {
			ls = jdbc.query(sql, new ObjectRowMapper());
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		return ls;
	}
}