<%--
  Created by IntelliJ IDEA.
  User: 34759
  Date: 2019/10/29
  Time: 14:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>查询到所有账户信息如下：</h1>
    <c:forEach items="${accounts}" var="account">
        ${account.name}:${account.money}<br>
    </c:forEach>
</body>
</html>
