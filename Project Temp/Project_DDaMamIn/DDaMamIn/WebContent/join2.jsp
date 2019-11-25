<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="EUC-KR"
    import="user.*, java.util.*" %><%!
    String ctxPath = null;
    UserDAO udao = null;
    List<UserVO> uls = null;
%><%
	ctxPath = request.getContextPath();
	request.setCharacterEncoding("UTF-8");
	
	udao = new UserDAO();
	
	response.sendRedirect( ctxPath + "/main.jsp" );
%><!DOCTYPE html>