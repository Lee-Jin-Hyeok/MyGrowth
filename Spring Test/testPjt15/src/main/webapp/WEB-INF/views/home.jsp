<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<html>
<head>
	<title>Home</title>
</head>
<body>
<button onclick="test()" type="button">Ajax</button>

<script>
var obj = {"name": "kim", "age": 30};

function test() {
    $.ajax({
        url: "<c:url value="/test" />",
        type: "post",
        data: JSON.stringify(obj),
        dataType: "json",
        contentType: "application/json",
        success: function(data) {
            alert("성공");
        },
        error: function(errorThrown) {
            alert(errorThrown.statusText);
        }
    });
}
</script>
<script src="http://code.jquery.com/jquery-latest.min.js"></script>
</body>
</html>