<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="EUC-KR"%>
<%@ page import="java.util.*"%>
<%@ page import="object.ObjectDAO"%>
<%@ page import="object.ObjectVO"%><%!
    List<ObjectVO> ols = null;
	ObjectDAO odao = null;
	String search = null;
%><%
	request.setCharacterEncoding("UTF-8");
	search = request.getParameter("search");
	
	odao = new ObjectDAO();
	ols = new ArrayList<>();
	
	try {
		if(search == null) search = "";
		
		ols = odao.findAll(search);
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
	                    <input type="text" name="search" id="search_bar" value="<%=search%>" placeholder=" 원하는 노래의 제목을 입력해주세요."/>
						<input type="submit" value="검색" id="search_button">
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
	<script type="text/javascript" src="./static/js/index.js"></script>
	<script type="text/javascript">
		var object2 = document.getElementsByClassName("object");
		
		for(var i = 0 ; i < object2.length ; i++) {
			object2[i].onclick = function() {
				location.href = "./static/html/" + this.querySelector('img').src.split("/")[4] + ".html";
			}
		}
	</script>
</body>
</html>