<%--
  Created by IntelliJ IDEA.
  User: muaaz
  Date: 7/11/19
  Time: 10:08 AM
  To change this template use File | Settings | File Templates.
--%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<HEAD>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
</HEAD>

<body style="background-color: cornsilk">

<p style="color: black; border: 5px solid black; letter-spacing: 5px; padding: 10px;"><b>List Of Tutorials Available</b>
<p>
    <c:forEach var="emp" items="${tutelist}">
<ul style="font-family: Arial; font-size: 14pt;">


    <li>Tutorial ID: ${emp.getId()} </li>

    <li>Tutorial Name: ${emp.getName()}</li>

    <p><c:url var="tutUrl" value="/tut?id=${emp.getId()}" /><a id="update" href="${tutUrl}" class="btn btn-warning">View</a></p>


</ul>
</c:forEach>


</body>


</html>