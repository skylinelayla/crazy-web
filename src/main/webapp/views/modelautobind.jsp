<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: SHIKUN
  Date: 2016/8/23
  Time: 16:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>

<form:form modelAttribute="accountmodel" method="post">
    用户名：<form:input path="username"/><br/>
    密 码：<form:password path="password"/><br/>
    年龄： <form:input path="age"/><br>
    <input type="submit" value="Submit" />
</form:form>


</body>
</html>
