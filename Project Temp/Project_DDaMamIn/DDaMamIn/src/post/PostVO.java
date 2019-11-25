package post;

public class PostVO {
	private Integer p_id = null;
	private String p_title = null;
	private String p_content = null;
	private String p_date = null;
	private Integer p_likecnt = null;
	
	public Integer getP_id() {
		return p_id;
	}
	public void setP_id(Integer p_id) {
		this.p_id = p_id;
	}
	public String getP_title() {
		return p_title;
	}
	public void setP_title(String p_title) {
		this.p_title = p_title;
	}
	public String getP_content() {
		return p_content;
	}
	public void setP_content(String p_content) {
		this.p_content = p_content;
	}
	public String getP_date() {
		return p_date;
	}
	public void setP_date(String p_date) {
		this.p_date = p_date;
	}
	public Integer getP_likecnt() {
		return p_likecnt;
	}
	public void setP_likecnt(Integer p_likecnt) {
		this.p_likecnt = p_likecnt;
	}
}
