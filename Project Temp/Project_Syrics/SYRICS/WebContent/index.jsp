<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="EUC-KR"%>
<%@ page import="java.util.*"%>
<%@ page import="object.ObjectDAO"%>
<%@ page import="object.ObjectVO"%><%!
    List<ObjectVO> ols = null;
	ObjectDAO odao = null;
	String condition = null;
	String search = null;
%><%
	request.setCharacterEncoding("UTF-8");

	condition = request.getParameter("condition");
	search = request.getParameter("search");
	
	odao = new ObjectDAO();
	ols = new ArrayList<>();
	
	try {
		if(condition == null) condition = "*";
		if(search == null) search = "";
		
		System.out.println("condition : " + condition);
		System.out.println("search : " + search);
		
		ols = odao.findAll(condition, search);
	} catch(NullPointerException npe) {
		System.out.println("DAO is null or LiST is null");
	}
%><!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>SYRICS</title>
<link rel="stylesheet" href="./static/css/index.css"/>
</head>
<body>
	<div id="wrapper">
        <div id="top_wrapper">
            <div id="leftStarSpace">
                <img src="./static/img/YellowStar.png" class="yellowStar" id="star1"/>
                <img src="./static/img/YellowStar.png" class="yellowStar" id="star2"/>
                <img src="./static/img/YellowStar.png" class="yellowStar" id="star3"/>
                <img src="./static/img/YellowStar.png" class="yellowStar" id="star4"/>
                <img src="./static/img/YellowStar.png" class="yellowStar" id="star5"/>
                <img src="./static/img/YellowStar.png" class="yellowStar" id="star6"/>
                <img src="./static/img/YellowStar.png" class="yellowStar" id="star7"/>
            </div>
            <div id="middleSpace">
                <p id="title">Syrics</p>
                <form action="index.jsp" method="post" name="searching">
	                <div id="search_wrapper">
	                    <input type="text" name="search" id="search_bar" value="<%=search%>" placeholder=" ���ϴ� �뷡�� ������ �Է����ּ���."/>
						<input type="submit" value="�˻�" id="search_button">
	                </div>
	                <div id="radios">
	                    <input type="radio" name="condition" class="condition" value="��ü" checked="checked"/>
	                    <span class="condition_name">��ü</span>
	                    <input type="radio" name="condition" class="condition" value="����"/>
	                    <span class="condition_name">����</span>
	                    <input type="radio" name="condition" class="condition" value="����"/>
	                    <span class="condition_name">����</span>
	                    <input type="radio" name="condition" class="condition" value="����"/>
	                    <span class="condition_name">���</span>
	                </div>
                </form>
            </div>
            <div id="rightStarSpace">
                <img src="./static/img/YellowStar.png" class="yellowStar" id="star8"/>
                <img src="./static/img/YellowStar.png" class="yellowStar" id="star9"/>
                <img src="./static/img/YellowStar.png" class="yellowStar" id="star10"/>
                <img src="./static/img/YellowStar.png" class="yellowStar" id="star11"/>
                <img src="./static/img/YellowStar.png" class="yellowStar" id="star12"/>
                <img src="./static/img/YellowStar.png" class="yellowStar" id="star13"/>
                <img src="./static/img/YellowStar.png" class="yellowStar" id="star14"/>
                <img src="./static/img/YellowStar.png" class="yellowStar" id="star15"/>
                <img src="./static/img/YellowStar.png" class="yellowStar" id="star16"/>
            </div>
        </div>
        <div id="bot_wrapper">
            <div id="objects"><%
            	if(ols != null) {
	            	for(ObjectVO vo : ols) {
					%><div class="object">
	                    <p class="article_title"><%=vo.getTitle()%></p>
	                    <img src="https://img.youtube.com/vi/<%=vo.getImg()%>/0.jpg" class="main_image"/>
	                    <p class="title-singer"><%=vo.getSinger()%> - <%=vo.getSong_title()%></p>
	                </div><%
	            	}
            	}
                %>
            </div>
        </div>
        <div id="hill"></div>
    </div>
</body>
<script type="text/javascript" src="./static/js/index.js"></script>
</html>