<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>捷丰收银台</title>
</head>
<body>
	<form id="alipaysubmit" name="alipaysubmit" action="https://mapi.alipay.com/gateway.do" method="get">
		<c:forEach var="map" items="${sParaMap}">
			<input type="hidden" name="${map.key}" value="${map.value}" />
		</c:forEach>
		<input type="submit" value="strButtonName" style="display: none;">
	</form>
	<script>document.forms['alipaysubmit'].submit();</script>
</body>
</html>