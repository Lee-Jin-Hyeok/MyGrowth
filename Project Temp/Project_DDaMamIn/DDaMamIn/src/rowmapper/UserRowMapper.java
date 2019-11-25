package rowmapper;

import java.sql.ResultSet;

import jdbcUtil.RowMapper;
import user.UserVO;

public class UserRowMapper implements RowMapper<UserVO> {
	@Override
	public UserVO mapRow(ResultSet rs) throws Exception {
		UserVO vo = new UserVO();
		
		vo.setU_id(rs.getString("u_id"));
		vo.setU_pw(rs.getString("u_pw"));
		vo.setU_name(rs.getString("u_name"));
		vo.setU_email(rs.getString("u_email"));
		
		return vo;
	}
}
