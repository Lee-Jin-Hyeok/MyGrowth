<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%><%!
    String ctxPath = null;
    String id = null;
    String pw = null;
%><%
	ctxPath = request.getContextPath();
	request.setCharacterEncoding("UTF-8");
	
	id = request.getParameter("id");
	pw = request.getParameter("pw");
	
	System.out.println("id : " + id);
	System.out.println("pw : " + pw);
	if(id.equals("1234"))
		System.out.println("아이디 일치");
	else
		System.out.println("아이디 불일치");
	
	if(pw.equals("0000"))
		System.out.println("비밀번호 일치");
	else
		System.out.println("비밀번호 불일치");
	
	response.sendRedirect( ctxPath + "/index.jsp" );
%><!DOCTYPE html>