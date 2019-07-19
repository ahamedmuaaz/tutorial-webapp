<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>

    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
    <style type="text/css">
        <!--
        <%@ include file="../../css/mainStyle.css" %>
        -->
    </style>

</head>
<body>

<h1 align="center" class="adminTitile">The Online Library</h1>
<h5 align="center" class="adminDate"><fmt:formatDate value="${today}" pattern="yyy-MM-dd" /></h5>

<!--Simple dashboard grid layout-->
<div class="grid-container">
    <header class="header">
        <div class= "pull-right">
            <button type="button" class="btn btn-secondary pull-right" onclick="gotostudent()">Student</button>
            <button type="button" class="btn btn-secondary pull-right" onclick="gotoadmin()">Admin</button>
        </div>
    </header>
    <aside class="sidenav">
        <ul class="sidenav__list">
            <li class="sidenav__list-item"><a href="${pageContext.request.contextPath}admin/add">Add Tutorial</a></li>
            <li class="sidenav__list-item"><a href="${pageContext.request.contextPath}admin/list">View Tutorials</a></li>
        </ul>
    </aside>
    <main class="main">

        <div class="container">
            <h3 id="form_header" class="text-dark" align="center">Tutorial form</h3>
            <div> </div>

            <!-- User input form to add a new user or update the existing user-->
            <c:url var="saveUrl" value="/" />
            <form:form id="user_form" modelAttribute="userAttr" method="POST" action="/admin/save">
                <form:hidden path="id" />

                <label for="name">Enter Tutorial Name: </label>
                <form:input id="name" cssClass="form-control" path="name" />

                <label for="tut_name">Enter TutorName: </label>
                <form:input id="tut_name" cssClass="form-control" path="tutname" />

                <label for="desc">Enter Description: </label>
                <form:input id="desc" cssClass="form-control" path="description" />

                <label for="url">Enter URL: </label>
                <form:input id="url" cssClass="form-control" path="url" />

                <label for="imageUrl">Enter Image URL: </label>
                <form:input id="imageUrl" cssClass="form-control" path="imageUrl" />

                <br>

                <button id="saveBtn" type="submit" class="btn btn-primary" onclick="update()">Save</button>
            </form:form>
        </div>
    </main>
    <footer class="footer">
        <div class="footer__copyright">&copy; 2019</div>
        <div class="footer__signature">THARUSHA WIJAYABAHU / MUAAZ AHAMED</div>
    </footer>
</div>
<script type="text/javascript">
        function update(){
            alert("Tutorial successfully Updated!");
        }
        function gotoadmin() {
            window.location.assign("/admin");
        }

        function gotostudent() {
            window.location.assign("/student");

        }
</script>
</body>
</html>
