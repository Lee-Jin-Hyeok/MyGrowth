package rowmapper;

import java.sql.ResultSet;

import comment.CommentVO;
import jdbcUtil.RowMapper;

public class CommentRowMapper implements RowMapper<CommentVO> {
	@Override
	public CommentVO mapRow(ResultSet rs) throws Exception {
		CommentVO vo = new CommentVO();
		
		vo.setC_id(rs.getInt("c_id"));
		vo.setC_content(rs.getString("c_content"));
		vo.setC_date(rs.getString("c_date"));
		vo.setU_id(rs.getString("u_id"));
		vo.setP_id(rs.getInt("p_id"));
		
		return vo;
	}
}