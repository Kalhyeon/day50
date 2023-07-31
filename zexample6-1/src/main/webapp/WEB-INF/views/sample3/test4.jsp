<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>JSP 2.0 JSTL</h1> <!-- EL 과 JSTL 을 도입 -->
	<!-- c:if 문은 else 가 없다. -->
	<c:if test="${username==null}">
		<div>게스트 접속입니다. 로그인하세요.</div>
	</c:if>
	<c:if test="${username!=null}"> <!-- $를 만나면 EL 로 인식 -->
		<div>${username}님 환영합니다.</div>
	</c:if>
	
	<!--
		else if 는 c:when
		else 는 c:otherwise
	-->
	<c:choose>
		<c:when test="${username==null}">
			<div>게스트 접속입니다. 로그인하세요.</div>
		</c:when>
		<c:otherwise>
			<div>${username}님 환영합니다.</div>
		</c:otherwise>
	</c:choose>
</body>
</html>