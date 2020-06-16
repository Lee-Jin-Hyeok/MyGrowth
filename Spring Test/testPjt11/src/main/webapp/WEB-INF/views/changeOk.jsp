<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>

<h1>회원님의 정보가 다음과 같이 변경되었습니다.</h1>
${userId} => ${user.userId} <br/>
${userPw} => ${user.userPw} <br/>
${userMail} => ${user.userMail} <br/>
${userAge} => ${user.userAge} <br/>
<a href="/session/resources/html/index.html">메인 페이지로</a>

</body>
</html>