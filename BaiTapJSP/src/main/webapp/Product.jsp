<%--
  Created by IntelliJ IDEA.
  User: uyen
  Date: 10/13/2022
  Time: 1:16 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="com.uyen.controller.Home" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h3>QUAN LY SAN PHAM</h3>
<form action="http://localhost:8080/product/home" method="post">
    Ten san pham:<br>
    <input type="text" name="name"><br>
    So luong:<br>
    <input type="text" name="quantity"><br>
    Gia ban:<br>
    <input type="text" name="price"><br>
    <button>Luu lai</button>
    <table style="width: 100%;border:1px solid black; border-collapse: collapse;">
        <tr>
            <th>Ten San Pham</th>
            <th>So luong</th>
            <th>Gia Ban</th>
        </tr>
        <c:forEach var="product" items="${productList}">
            <tr>
                <td>${product.name}</td>
                <td>${product.quantity}</td>
                <td>${product.price}</td>
            </tr>
        </c:forEach>
    </table>
</form>
</body>
</html>
