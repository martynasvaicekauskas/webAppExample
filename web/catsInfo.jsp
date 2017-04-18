<%--
  Created by IntelliJ IDEA.
  User: MartynasV
  Date: 2017-04-18
  Time: 20:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <title></title>
</head>
<body>
<c:forEach items="${cats}" var="cat">
    <div> name :  ${cat.name}  </div>
    <div>  kind: ${cat.kind} </div>
    <div> age: ${cat.age}  </div>
    <div>  weight: ${cat.weight}</div>
    <div> Cat like milk?: ${cat.likeMilk} </div>
    <br>
</c:forEach>




</body>
</html>
