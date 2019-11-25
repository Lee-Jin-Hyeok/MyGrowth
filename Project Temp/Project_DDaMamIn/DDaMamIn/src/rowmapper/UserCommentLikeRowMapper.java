package rowmapper;

import java.sql.ResultSet;

import jdbcUtil.RowMapper;
import relation.UserPostLikeVO;

public class UserCommentLikeRowMapper implements RowMapper<UserPostLikeVO>{
	@Override
	public UserPostLikeVO mapRow(ResultSet rs) throws Exception {
		UserPostLikeVO vo = new UserPostLikeVO();
		
		vo.setU_id(rs.getString("u_id"));
		vo.setP_id(rs.getInt("p_id"));
		vo.setStatus(rs.getInt("status"));
		
		return vo;
	}
}
