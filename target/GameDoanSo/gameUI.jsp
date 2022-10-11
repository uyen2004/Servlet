<%--
  Created by IntelliJ IDEA.
  User: uyen
  Date: 10/6/2022
  Time: 3:58 PM
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

<form style="margin: auto; width: 220px;" action="http://localhost:8080/game/homepage" method="post">
    <h1>Number Guessing Game</h1>
    <label>Enter a random number from 1-1000</label><br>
    <input name="number" type="text"><br>
    <button>Submit</button><br>
    <p>${message}</p><br>
   <!-- <button>Next turn</button><br> -->
</form >
<form style="margin: auto; width: 220px;" action="http://localhost:8080/game/controller" method="post">
    <button onclick="window.location.href='http://localhost:8080/game/homepage';">Restart</button>
</form>
</body>
</html>
