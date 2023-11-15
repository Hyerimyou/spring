<%@ page contentType="text/html; charset=UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %><!-- foreach문사용하려고 -->
<!DOCTYPE html>
<html>
<head>
<title>info</title>
</head>
<body>
	info.jsp입니다<br>
	이름 : ${infoCommand.name}<br>
	언어 : <c:forEach items="${infoCommand.lang }" var="lang">
		${lang }<br>
	</c:forEach>
</body>
</html>