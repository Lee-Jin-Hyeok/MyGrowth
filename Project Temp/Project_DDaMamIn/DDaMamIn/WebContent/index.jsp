<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="EUC-KR"%>
<%@ page session = "true" %><%!
	String id_value;
	String email_value;
	int status;
%><%
	id_value = (String)session.getAttribute("id_value");
	email_value = (String)session.getAttribute("email_value");
	
	if(id_value != null) {
		if(email_value != null) {
			status = 3;					// ���̵� Ȯ�� �� �̸��� ���� ����
		} else {
			status = 2;					// �ƾƵ� Ȯ���� ������ �̸��� ������ �� ��
		}
	} else {
		if(email_value != null) {
			status = 1;					// �̸��� ������ ������ ���̵� Ȯ���� �� ��
		} else {
			status = 0;					// �ƾƵ� Ȯ�� �� �̸��� ���� �� ��
		}
	}
	status = 0;
	
%><!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>DDaMamIn</title>
<link rel="stylesheet" href="static/css/index.css"/>
</head>
<body>
	<div id="header">
        <p id="title">DDaMamIn</p>
    </div>
    <div id="main">
        <input type="button" class="login_join" value="L O G I N">
        <input type="button" class="login_join" value="J O I N">
    </div>
    <div id="footer">
        <p id="help">���̵�/��й�ȣ ã��</p>
    </div>

    <div class="modal">
        <div id="modal_login-content">
            <p class="close"> X </p>
            <form method="GET" action="login2.jsp">
                <p class="login_name">���̵�</p>
                <input type="text" name="id" class="login_text" placeholder=" �ƾƵ� �Է����ּ���."/>
                <p class="login_name">��й�ȣ</p>
                <input type="password" name="pw" class="login_text" placeholder=" ��й�ȣ�� �Է����ּ���."/>
                <button class="login_submit">L O G I N</button>
            </form>
        </div>
    </div>


	<% if(status == 0) { %>
    <div class="modal">
		<div id="modal_join-content">
		    <p class="close"> X </p>
		    
			    <form method="GET" action="./checkId2.jsp">
			    	<p class="join_name">���̵�</p>
			        <input type="text" name="id" id="join_text_id" placeholder=" �ּ� 4���̻� �ִ� 16������"/>
			        <button id="join_text_id_check">Check</button>
			    </form>
		        <p class="join_name">��й�ȣ</p>
		        <input type="password" name="pw" class="join_text" placeholder=" ����, ����, Ư����ȣ �ݵ�� ����"/>
		        <p class="join_name">��й�ȣ Ȯ��</p>
		        <input type="text" name="id" class="join_text" placeholder=" �ּ� 4���̻� �ִ� 16���̻�"/>
		        <p class="join_name">�г���</p>
		        <input type="text" name="name" class="join_text" placeholder=" �ѱ� 5��, ���� 10�� (Ư����ȣ ����)"/>
		        <p class="join_name">�̸���</p>
		        <form method="GET" action="./checkEmail.jsp">
				    <input type="email" name="email" id="join_text_email" placeholder=" ex) example@exam.com"/>
				    <button id="join_text_email_check">Check</button>
				</form>
		        <button class="join_submit">J O I N</button>
		</div>
    </div>
    <% } else if(status == 1) { %>
    <div class="modal">
		<div id="modal_join-content">
		    <p class="close"> X </p>
		    
			    <form method="GET" action="./checkId2.jsp">
			    	<p class="join_name">���̵�</p>
			        <input type="text" name="id" id="join_text_id" placeholder=" �ּ� 4���̻� �ִ� 16������"/>
			        <button id="join_text_id_check">Check</button>
			    </form>
		        <p class="join_name">��й�ȣ</p>
		        <input type="password" name="pw" class="join_text" placeholder=" ����, ����, Ư����ȣ �ݵ�� ����"/>
		        <p class="join_name">��й�ȣ Ȯ��</p>
		        <input type="text" name="id" class="join_text" placeholder=" �ּ� 4���̻� �ִ� 16���̻�"/>
		        <p class="join_name">�г���</p>
		        <input type="text" name="name" class="join_text" placeholder=" �ѱ� 5��, ���� 10�� (Ư����ȣ ����)"/>
		        <p class="join_name">�̸���</p>
		        <input type="email" name="email" class="join_text" placeholder=" ex) example@exam.com" readonly/>
		        <button class="join_submit">J O I N</button>
		    
		</div>
    </div>
    <% } else if(status == 2) { %>
    <div class="modal">
		<div id="modal_join-content">
		    <p class="close"> X </p>
		    
		    	<p class="join_name">���̵�</p>
		        <input type="text" name="id" class="join_text" placeholder=" �ּ� 4���̻� �ִ� 16������" readonly/>
		        <p class="join_name">��й�ȣ</p>
		        <input type="password" name="pw" class="join_text" placeholder=" ����, ����, Ư����ȣ �ݵ�� ����"/>
		        <p class="join_name">��й�ȣ Ȯ��</p>
		        <input type="text" name="id" class="join_text" placeholder=" �ּ� 4���̻� �ִ� 16���̻�"/>
		        <p class="join_name">�г���</p>
		        <input type="text" name="name" class="join_text" placeholder=" �ѱ� 5��, ���� 10�� (Ư����ȣ ����)"/>
		        <form method="GET" action="./checkEmail.jsp">
		        	<p class="join_name">�̸���</p>
				    <input type="email" name="email" id="join_text_email" placeholder=" ex) example@exam.com"/>
				    <button id="join_text_email_check">Check</button>
				</form>
		        <button class="join_submit">J O I N</button>
		    
		</div>
    </div>
    <% } else if(status == 3) { %>
   	<div class="modal">
		<div id="modal_join-content">
		    <p class="close"> X </p>
		    
		    <form method="POST" action="./join2.jsp">
		    	<p class="join_name">���̵�</p>
		        <input type="text" name="id" class="join_text" placeholder=" �ּ� 4���̻� �ִ� 16������" readonly/>
		        <p class="join_name">��й�ȣ</p>
		        <input type="password" name="pw" class="join_text" placeholder=" ����, ����, Ư����ȣ �ݵ�� ����"/>
		        <p class="join_name">��й�ȣ Ȯ��</p>
		        <input type="text" name="id" class="join_text" placeholder=" �ּ� 4���̻� �ִ� 16���̻�"/>
		        <p class="join_name">�г���</p>
		        <input type="text" name="name" class="join_text" placeholder=" �ѱ� 5��, ���� 10�� (Ư����ȣ ����)"/>
		        <p class="join_name">�̸���</p>
		        <input type="email" name="email" class="join_text" placeholder=" ex) example@exam.com" readonly/>
		        <button class="join_submit">J O I N</button>
		    </form>
		    
		</div>
    </div>
    <% } else {
    
    } %>



    <script src="static/js/index.js"></script>
</body>
</html>