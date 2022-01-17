<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>

<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8">
</head>

<body>
<div>
  <table>
    <thead>
    <th>ID</th>
    <th>UserName</th>
    <th>Email</th>
    </thead>
    <c:forEach items="${allUsers}" var="user">
      <tr>
        <td>${user.id}</td>
        <td>${user.username}</td>
        <td>${user.email}</td>
      </tr>
    </c:forEach>
  </table>
  <a href="/">Главная</a>
</div>
</body>
</html>