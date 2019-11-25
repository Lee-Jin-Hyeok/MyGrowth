<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="EUC-KR"%><%!
    String ctxPath = null;
%><%
	ctxPath = request.getContextPath();
	request.setCharacterEncoding("UTF-8");
	

	response.sendRedirect( ctxPath + "/index.jsp" );
%><!DOCTYPE html>