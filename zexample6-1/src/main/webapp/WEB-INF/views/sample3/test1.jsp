<%@page import="java.io.PrintWriter"%>
<%@page import="java.time.LocalDateTime"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP 는 서버에서 실행된다</title>
</head>
<body>
	<ul>
		<li>JSP 는 자바와 HTML 을 함께 작성하는 기술</li>
		<li>JSP 의 자바 코드는 [서버] 에서 실행됨</li>
		<li>JSP 는 서버에서 실행된 다음 그 결과 HTML 을 사용자에게 보냄</li>
	</ul>
	<%
		LocalDateTime time = LocalDateTime.now();
		PrintWriter o = response.getWriter();
		o.println("<div>" + time + "</div>");
	%>
</body>
</html>