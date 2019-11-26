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

	System.out.println(id=="");
	System.out.println(pw.equals(""));
	
	response.sendRedirect( ctxPath + "/index.jsp" );
%><!DOCTYPE html>