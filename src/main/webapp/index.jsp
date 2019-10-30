<%--
  Created by IntelliJ IDEA.
  User: 34759
  Date: 2019/10/29
  Time: 14:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>首页</title>
</head>
<body>
    <a href="account/findAll">点击测试查询所有</a><br>

    <form method="post" action="account/saveAccount">
        姓名:<input type="text" name="name"><br>
        存款：<input type="text" name="money"><br>
        <input type="submit" value="提交">
    </form>
</body>
</html>
