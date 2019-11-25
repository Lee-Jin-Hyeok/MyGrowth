<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="EUC-KR"
    import="user.*, java.util.*" %><%!
    String ctxPath = null;
    UserDAO udao = null;
    UserVO uvo = null;
    
    String id = null;
    String pw = null;
    String name = null;
    String email = null;
%><%
	ctxPath = request.getContextPath();
	request.setCharacterEncoding("UTF-8");
	
	udao = new UserDAO();

	
	udao.insert(uvo);
	
	response.sendRedirect( ctxPath + "/main.jsp" );
%><!DOCTYPE html>