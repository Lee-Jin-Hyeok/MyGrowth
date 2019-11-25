package rowmapper;

import java.sql.ResultSet;

import jdbcUtil.RowMapper;
import post.PostVO;

public class PostRowMapper implements RowMapper<PostVO> {
	@Override
	public PostVO mapRow(ResultSet rs) throws Exception {
		PostVO vo = new PostVO();
		
		vo.setP_id(rs.getInt("p_id"));
		vo.setP_title(rs.getString("p_title"));
		vo.setP_content(rs.getString("p_content"));
		vo.setP_date(rs.getString("p_date"));
		vo.setP_likecnt(rs.getInt("p_likecnt"));
		
		return vo;
	}
}