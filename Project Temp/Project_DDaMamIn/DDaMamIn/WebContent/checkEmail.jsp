<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%><%!
    String ctxPath = null;
%><%
	ctxPath = request.getContextPath();
	request.setCharacterEncoding("UTF-8");
	
	System.out.println("ctxPath2 : " + ctxPath);
	
	response.sendRedirect( ctxPath + "/index.jsp" );
%><!DOCTYPE html>