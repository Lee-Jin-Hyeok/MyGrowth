package user;

public class AuthenticationNumber {
	public String getHTML() {
		String html = "<head><style>"
					+ "#back {"
						+ "position : absolute;"
						+ "left : 50%;"
						+ "background-color : #7F00FFFF;"
						+ "height : 300px;"
						+ "width : 500px;"
					+ "}"
					+ "#injeung {"
						+ "text-align : center;"
						+ "color : white;"
						+ "font-size : 30px;"
					+ "}"
					+ "#content {"
						+ "text-align : center;"
						+ "color : white;"
						+ "font-size : 60px;"
					+ "}"
				+ "</style></head>"
				+ "<body>"
					+ "<div id='back'>"
						+ "<p id='injeung'>인증번호</p>"
						+ "<p id='content'>" + createNum() + "</p>"
					+ "</div>"
				+ "</body>";
		
		return html;
	}
	
	private String createNum() {
		StringBuffer sb = new StringBuffer();
		char[] num = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890".toCharArray();
		
		for(int i = 0 ; i < 6 ; i++)
			sb.append(num[((int)(Math.random()*100))%36]);
		
		return sb.toString();
	}
}