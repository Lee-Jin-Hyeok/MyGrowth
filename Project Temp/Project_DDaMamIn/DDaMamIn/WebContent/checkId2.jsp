<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="EUC-KR"%><%!
    String ctxPath = null;
    String id = null;
%><%
	ctxPath = request.getContextPath();
	request.setCharacterEncoding("UTF-8");

	id = request.getParameter("id");
	
	
	
	response.sendRedirect( ctxPath + "/index.jsp" );
%><!DOCTYPE html>