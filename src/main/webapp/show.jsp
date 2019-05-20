<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jstl/core_rt"  prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table width="90%" border="1" align="center">
		<c:forEach items="${requestScope.list }" var="i">
			<tr align="center">
				<td>${i.user_id }</td>
				<td>${i.user_name }</td>
				<td>${i.user_pwd }</td>
				<td>${i.user_age }</td>
				<td>${i.user_class }</td>
				<td>${i.user_score }</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>