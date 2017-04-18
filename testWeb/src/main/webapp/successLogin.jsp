<%--
  Created by IntelliJ IDEA.
  User: stasi
  Date: 18.04.2017
  Time: 23:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Страница успешного входа в систему</title>
</head>
<body>
<br>
<h1>Вход посетителя в систему прошел успешно</h1>
<jsp:useBean id="user" class="User" scope="application"/>
Пользователь: <%= user.getUser()%><br>
Email: <%= user.getEmail()%><br>
Адрес: <%= user.getAddress()%><br>
Телефон: <%= user.getPhone()%><br>
</body>
</html>
