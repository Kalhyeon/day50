<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- 로그인했으면 ~님 환영합니다., 비로그인이면 게스트 접속입니다.
		로그인하세요. 출력 -->
	<h1>JSP 로그인 처리</h1>
	<%
		String username = (String)request.getAttribute("username");
		if(username==null) {
		  out.println("<div>게스트 접속입니다. 로그인하세요.</div>");
		}else {
		  out.println("<div>"+username+"님 환영합니다.</div>");
		}
	%>
</body>
</html>