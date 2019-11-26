<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="EUC-KR"
    import="user.*, java.util.*" %><%!
    String ctxPath = null;
    UserDAO udao = null;
    UserVO uvo = null;
    
    String id = null;
    String pw = null;
    String pw_re = null;
    String name = null;
    String email = null;
%><%
	ctxPath = request.getContextPath();
	request.setCharacterEncoding("UTF-8");
	
	id = request.getParameter("id");
	pw = request.getParameter("pw");
	pw_re = request.getParameter("pw_re");
	name = request.getParameter("name");
	email = request.getParameter("email");

	System.out.println("id : " + id);
	System.out.println("pw : " + pw);
	System.out.println("pw_re : " + pw_re);
	System.out.println("name : " + name);
	System.out.println("email : " + email);
	
	udao = new UserDAO();
	uvo = new UserVO();
	
	uvo.setU_id(id);
	uvo.setU_pw(pw);
	uvo.setU_name(name);
	uvo.setU_email(email);
	
	udao.insert(uvo);
	
	response.sendRedirect( ctxPath + "/index.jsp" );
%><!DOCTYPE html>