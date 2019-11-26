<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page import="user.UserDAO" %>
<%@ page import="user.UserVO" %>
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
	
	udao = new UserDAO();
	uvo = new UserVO();
	
	uvo.setU_id(id);
	udao.findPwById(uvo);
	
	response.sendRedirect( ctxPath + "/index.jsp" );
%><!DOCTYPE html>