<%--
  Created by IntelliJ IDEA.
  User: stasi
  Date: 18.04.2017
  Time: 23:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Страница подтверждения успешной регистрации посетителя</title>
</head>
<body>
<h1>Регистрация посетителя успешно завершена</h1>
<jsp:useBean id="user" class="User" scope="application"/>
Пользователь: <%= user.getUser()%><br>
Email: <%= user.getEmail()%><br>
Адрес: <%= user.getAddress()%><br>
Телефон: <%= user.getPhone()%><br>
Зарегистрирован.<br><br>
<a href="login.html">Войти в систему</a>
</body>
</html>
