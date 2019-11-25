package post;

import java.util.List;

import jdbcUtil.JdbcTemplate;
import rowmapper.PostRowMapper;

public class PostDAO {
	JdbcTemplate jdbc = new JdbcTemplate();
	
	public void insert(PostVO vo) {
		String sql = "insert into post"
				+ "(p_title, p_content, p_date, p_likecnt) "
				+ "values(?,?,now(),?)";
		try {
			jdbc.update(sql, vo.getP_title(), vo.getP_content(), vo.getP_likecnt());
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public List<PostVO> findAll() {
		List<PostVO> ls = null;
		String sql = "select * from post order by p_id desc";
		try {
			ls = jdbc.query(sql, new PostRowMapper());
		} catch(Exception e) {
			e.printStackTrace();
		}
		return ls;
	}
}