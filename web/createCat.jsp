<%--
  Created by IntelliJ IDEA.
  User: MartynasV
  Date: 2017-04-18
  Time: 21:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Cat</title>
</head>
<body>
<form action="/createCat" method="post">
    <div>name:<input name="catName"></div>
    <div>kind:<input name="catKind"></div>
    <div>age:<input name="catAge"></div>
    <div>weight:<input name="catWeight"></div>
    <div>Cat like milk?:<input type="checkbox" name="likeMilk"></div>
    <button> Sukurti kate </button>

</form>

</body>
</html>
