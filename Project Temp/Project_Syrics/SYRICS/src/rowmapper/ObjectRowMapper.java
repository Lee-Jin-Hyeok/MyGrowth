package rowmapper;

import java.sql.ResultSet;

import jdbcUtil.RowMapper;
import object.ObjectVO;

public class ObjectRowMapper implements RowMapper {
	@Override
	public ObjectVO mapRow(ResultSet rs) throws Exception {
		ObjectVO vo = new ObjectVO();
		
		vo.setId(rs.getInt("id"));
		vo.setTitle(rs.getString("title"));
		vo.setImg(rs.getString("img"));
		vo.setSinger(rs.getString("singer"));
		vo.setSong_title(rs.getString("song_title"));
		
		return vo;
	}
}
