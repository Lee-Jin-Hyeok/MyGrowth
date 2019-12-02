<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page import="javax.mail.Authenticator" %>
<%@ page import="java.util.Properties" %>
<%@ page import="javax.mail.internet.MimeMessage" %>
<%@ page import="javax.mail.internet.InternetAddress" %>
<%@ page import="javax.mail.Transport" %>
<%@ page import="javax.mail.Session" %>
<%@ page import="javax.mail.PasswordAuthentication" %>
<%@ page import="javax.mail.MessagingException" %>
<%@ page import="javax.mail.Message" %>
<%@ page import="user.STMPAuthenticator" %>
<%@ page import="java.util.Date" %>
<%@ page import="user.AuthenticationNumber" %>
<%!
    String ctxPath = null;
    String email = null;
    AuthenticationNumber an = null;
%><%
	ctxPath = request.getContextPath();
	request.setCharacterEncoding("UTF-8");
	
	email = request.getParameter("email");
	if(email == null || email.equals(""))
		System.out.println("email : null");
	else
		System.out.println("email : " + email);
	
	Properties p = new Properties();
	p.put("mail.transport.protocol", "smtp");
	p.put("mail.smtp.host", "smtp.naver.com");
	p.put("mail.stmt.port", "465");
	p.put("mail.smtp.starttls.enable","true");
	p.put("mail.smtp.auth", "true");
	
	an = new AuthenticationNumber();
	
	try {
		Authenticator auth = new STMPAuthenticator();
		
		Session mailSession = Session.getDefaultInstance(p, auth);
		
		MimeMessage message = new MimeMessage(mailSession);
		InternetAddress from = new InternetAddress("jinjin0816@naver.com");
		message.setFrom(from);
		message.setRecipients(Message.RecipientType.TO, InternetAddress.parse("0816jinjin@gmail.com"));
		message.setSubject("DDaMamIn SNS에서 인증 요청이 왔습니다.");
		message.setContent(AuthenticationNumber.getHTML(), "text/html; charset=UTF-8");
		message.setSentDate(new Date());
		
		Transport.send(message);
	} catch(Exception e) {
		e.printStackTrace();
	}
	
	response.sendRedirect( ctxPath + "/index.jsp" );
%><!DOCTYPE html>