<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title> Очень простая страница JSP </title>
</head>
<body>
<h1> Очень простая страница JSP </h1>
<h3>Этот пример показывает, как работать с выражениями JSP</h3>
Текущая дата: <%= new java.util.Date()%>
<br>
<%--Значение параметра "param": <%= request.getParameter("param")%>--%>
</body>
</html>
