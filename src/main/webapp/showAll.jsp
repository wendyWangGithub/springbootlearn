<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jstl/fmt_rt" prefix="fmt" %><!--jstl fmt:formatDate标签不解析的解决办法 -->
<%@ page isELIgnored="false" pageEncoding="UTF-8" contentType="text/html; UTF-8" %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width", user-scalable="no", initial-scal="1.0", maximum-scale="1.0", minimum-scale="1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Springboot</title>
</head>
<body>
<h2>
    用户列表1234
</h2>
<c:forEach items="${requestScope.users}" var="user">
    ${user.id}---${user.name}---${user.age}---<fmt:formatDate value="${user.bir}" type="both"/><br>
</c:forEach>
</body>
</html>