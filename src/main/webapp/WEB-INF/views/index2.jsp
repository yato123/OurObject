<%--
  Created by IntelliJ IDEA.
  User: 63531
  Date: 2019/7/23
  Time: 15:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="/index2/addPost" enctype="multipart/form-data" method="post">
        文件:<input type="file" name="file"><br/>
        <input type="submit" value="提交">
    </form>
</body>
</html>
