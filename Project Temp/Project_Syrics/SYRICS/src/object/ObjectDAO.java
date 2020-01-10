package object;

import java.util.List;

import jdbcUtil.JdbcTemplate;
import rowmapper.ObjectRowMapper;

public class ObjectDAO {
	JdbcTemplate jdbc = new JdbcTemplate();
	
	public List<ObjectVO> findAll(String search) {
		List<ObjectVO> ls = null;
		String sql = "select * from object where title like '%" + search + "%' ||" + " singer like '%" + search + "%' ||" + " song_title like '%" + search + "%'";
		
		try {
			ls = jdbc.query(sql, new ObjectRowMapper());
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		return ls;
	}
}