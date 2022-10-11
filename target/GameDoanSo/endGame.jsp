<%--
  Created by IntelliJ IDEA.
  User: uyen
  Date: 10/9/2022
  Time: 2:06 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="com.uyen.controller.Homepage" %>
<%@ page import="com.uyen.controller.Controller" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form style="margin: auto; width: 200px;">
    <h1>Number Guessing Game</h1>
    <label>Enter a random number from 1-1000</label>
    <input name="number" type="text">
    <p>${message}</p><br>
</form>
<form style="margin: auto; width: 200px; action="http://localhost:8080/game/controller" method="post">
    <button onclick="window.location.href='http://localhost:8080/game/homepage';">Restart</button>
</form>
    <div style="position: absolute;top: 50%;left: 50%;transform: translate(-50%, -50%);">
    <button  onclick="window.location.href='http://localhost:8080/game/homepage';">Next Player</button>
    <button  onclick="window.location.href='http://localhost:8080/game/controller'">End Game</button>
    </div>

</body>
</html>
