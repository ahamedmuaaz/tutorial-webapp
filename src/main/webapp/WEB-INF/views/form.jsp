<%--
  Created by IntelliJ IDEA.
  User: muaaz
  Date: 7/11/19
  Time: 11:01 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title>Tutorial form</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
</head>
<body>
<div class="container">
    <h3 id="form_header" class="text-warning" align="center">Tutorial form</h3>
    <div> </div>

    <!-- User input form to add a new user or update the existing user-->
    <c:url var="saveUrl" value="/" />
    <form:form id="user_form" modelAttribute="userAttr" method="POST" action="/save">
        <form:hidden path="id" />

        <label for="name">Enter Tutorial Name: </label>
        <form:input id="name" cssClass="form-control" path="name" />

        <label for="tut_name">Enter TutorName: </label>
        <form:input id="tut_name" cssClass="form-control" path="tutname" />

        <label for="desc">Enter Description: </label>
        <form:input id="desc" cssClass="form-control" path="description" />

        <label for="url">Enter URL: </label>
        <form:input id="url" cssClass="form-control" path="url" />

        <br>

        <button id="saveBtn" type="submit" class="btn btn-primary">Save</button>
    </form:form>
</div>
</body>
</html>