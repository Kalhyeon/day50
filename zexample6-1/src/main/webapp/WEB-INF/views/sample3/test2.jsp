<%@page import="java.io.PrintWriter"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	.username {
		color: blue;
	}
</style>
</head>
<body>
	<h1>JSP 자바 코드로 출력하기</h1>
	<%
		String username = (String)request.getAttribute("username");
		out.println("<div class = 'username'>" + username + "님 환영합니다.</div>");
	%>
	<hr>
	<h1>JSP 에서 out.println 으로 바뀌어 실행되는 표현식 (Expression)</h1>
	<%=username%>
	<%="<div class='username'>" + username + "님 환영합니다.</div>"%>
	<hr>
	<h1>JSP 2.0에서 더욱 간단한 Expression Language 등장</h1>
	<div class='username'>
		${username}님 환영합니다.
		<!-- ${username} 은 request 에서 username 을 꺼낸 다음
		 out.println(username) 으로 바뀌어 출력된다. -->
	</div>
</body>
</html>