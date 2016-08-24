<%--
  Created by IntelliJ IDEA.
  User: SHIKUN
  Date: 2016/8/23
  Time: 15:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<form action="parambind?urlParam=AAA" method="post" enctype="multipart/form-data">
    <input type="text" name="formParam"/><br>
    <input type="file" name="formFile" /><br>
    <input type="submit" value="Submit"/>

</form>
</body>
</html>
