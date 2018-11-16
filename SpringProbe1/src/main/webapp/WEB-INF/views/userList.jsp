<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://www.springframework.org/security/tags" prefix="security"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title><spring:message code="label.title" /></title>
</head>
<body>
<c:if test="${!empty userList}">
	<table class="data">
		<tr>
			<th><spring:message code="label.username" /></th>
			<th><spring:message code="label.password" /></th>
			<th><spring:message code="label.enabled" /></th>
			<th>&nbsp;</th>
		</tr>
		<c:forEach items="${userList}" var="user">
			<tr>
				<td>${user.username}</td>
				<td>${user.password}</td>
				<td>${user.enabled}</td>
			</tr>
		</c:forEach>
	</table>
</c:if>
</body>
</html>