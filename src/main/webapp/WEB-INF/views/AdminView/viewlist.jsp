<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
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

<h1 align="center">The Online Library</h1>
<h5 align="center"><fmt:formatDate value="${today}" pattern="yyy-MM-dd"/></h5>

<!--Simple dashboard grid layout-->
<div class="grid-container">
    <header class="header">
        <div class="btn-group btngroup" role="group" aria-label="Basic example">
            <button type="button" class="btn btn-secondary">Student</button>
            <button type="button" class="btn btn-secondary">Admin</button>
        </div>
    </header>
    <aside class="sidenav">
        <ul class="sidenav__list">
            <li class="sidenav__list-item"><a href="${pageContext.request.contextPath}/add">Add Tutorial</a></li>
            <li class="sidenav__list-item"><a href="${pageContext.request.contextPath}/list">View Tutorials</a></li>
            <li class="sidenav__list-item"><a href="http://reactjs.org">About Us</a></li>
            <li class="sidenav__list-item"><a href="http://reactjs.org">Contact Us</a></li>
        </ul>
    </aside>
    <main class="main">

        <div class="container">
            <p class="text-center" style="color: black; border: 5px solid black; letter-spacing: 5px; padding: 10px;">
                <b>List Of Tutorials Available</b>
            </p>
            <c:forEach var="emp" items="${tutelist}">
                <ul style="font-family: Arial; font-size: 14pt;">


                    <div class="row">
                        <div class="col-8">
                            <li>Tutorial Name: ${emp.getName()}</li>
                        </div>
                        <div class="col-4">

                            <!-- rating.js file -->

                            <p>
                                <button id="update" class="btn btn-success"
                                        onclick="viewMethod(${emp.getId()})">View
                                </button>

                                <button id="Delete" class="btn btn-success"
                                        onclick="confirmDelete(${emp.getId()})">Delete
                                </button>
                            </p>
                        </div>
                    </div>

                </ul>
                <hr>
            </c:forEach>

        </div>
    </main>
    <footer class="footer">
        <div class="footer__copyright">&copy; 2019</div>
        <div class="footer__signature">THARUSHA WIJAYABAHU / MUAAZ AHAMED</div>
    </footer>
</div>
<script type="text/javascript">

    function confirmDelete(id) {
        if (confirm('Are you sure you want to Delete this Tutorial')) {
            console.log(id);

            window.location.assign("/deleteTut?id=" + id);
            alert("Tutorial successfully deleted!");

            // Save it!
        } else {
            alert("Tutorial not deleted!");
        }
    }

    function viewMethod(id) {
        window.location.assign("/tut?id=" + id);
    }
</script>
</body>
</html>
