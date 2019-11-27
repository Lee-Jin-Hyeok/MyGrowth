<%@page import="user.OAuthProvider"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page import="user.UserDAO" %>
<%@ page import="user.UserVO" %>
<%@ page import="org.apache.struts.util.*" %>
<%!
    String ctxPath = null;
    
    UserDAO udao = null;
    UserVO uvo = null;
    
    String id = null;
    String pw = null;
%><%
	ctxPath = request.getContextPath();
	request.setCharacterEncoding("UTF-8");
	
	id = request.getParameter("id");
	pw = request.getParameter("pw");
	
	String token = org.apache.struts.util.TokenProcessor.getInstance().generateToken(request);
	session.setAttribute("token", token);
	
	Cookie cookie = new Cookie("key", "value");
	cookie.setMaxAge(365*24*60*60);
	cookie.setPath("/");
	response.addCookie(cookie);
	
	udao = new UserDAO();
	uvo = new UserVO();
	
	uvo.setU_id(id);
	
	
	
	//udao.findPwById(uvo);
	
	response.sendRedirect( ctxPath + "/index.jsp" );
%><!DOCTYPE html>