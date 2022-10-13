<%--
  Created by IntelliJ IDEA.
  User: uyen
  Date: 10/6/2022
  Time: 3:58 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="com.uyen.controller.Controller" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="http://localhost:8080/game/controller" method="get">
    <p>Nguoi thang cuoc la nguoi choi thu ${(minPlayer + 1)} voi ${minNumberOfTurn} luot choi</p>
</form>
<form action="http://localhost:8080/game/controller" method="post">
    <button onclick="window.location.href='http://localhost:8080/game/homepage';">Restart</button>
</form>


</body>
</html>
