<%--
  Created by IntelliJ IDEA.
  User: muaaz
  Date: 7/11/19
  Time: 10:08 AM
  To change this template use File | Settings | File Templates.
--%>
<%--

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
<div class="container">
<p  class="text-center" style="color: black; border: 5px solid black; letter-spacing: 5px; padding: 10px;"><b>List Of Tutorials Available</b>
<p>
    <c:forEach var="emp" items="${tutelist}">
<ul style="font-family: Arial; font-size: 14pt;">


  <div class="row">
      <div class="col-8">
    <li>Tutorial Name: ${emp.getName()}</li>
      </div>
      <div class="col-4">

          <!-- rating.js file -->

    <p><c:url var="tutUrl" value="/tut?id=${emp.getId()}" /><a id="update" href="${tutUrl}" class="btn btn-warning">View</a></p>
</div>


</div>

</ul>
<hr>
</c:forEach>

</div>
</body>


</html>










--%>


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
    <style>
        /* Assign grid instructions to our parent grid container */
        .grid-container {
            display: grid;
            grid-template-columns: 240px 1fr;
            grid-template-rows: 50px 1fr 50px;
            grid-template-areas: "sidenav header" "sidenav main" "sidenav footer";
            height: 100vh;
        }

        /* Give every child element its grid name */
        .header {
            grid-area: header;
            background-color: #648ca6;
        }

        .sidenav {
            grid-area: sidenav;
            background-color: #394263;
        }

        .main {
            grid-area: main;
            background-color: #8fd4d9;
        }

        .footer {
            grid-area: footer;
            background-color: #648ca6;
        }

        .header, .footer {
            display: flex;
            align-items: center;
            justify-content: space-between;
            padding: 0 16px;
            background-color: #648ca6;
        }

        .sidenav {
            display: flex; /* Will be hidden on mobile */
            flex-direction: column;
            grid-area: sidenav;
            background-color: #394263;
        }

        .sidenav__list {
            padding: 0;
            margin-top: 85px;
            list-style-type: none;
        }

        .sidenav__list-item {
            padding: 20px 20px 20px 40px;
            color: #ddd;
        }

        .sidenav__list-item:hover {
            background-color: rgba(255, 255, 255, 0.2);
            cursor: pointer;
        }

        a:link, a:visited {
            background-color: #394262;
            color: white;
            padding: 14px 25px;
            text-align: center;
            text-decoration: none;
            display: inline-block;
        }

        a:hover, a:active {
            background-color: #394262;
            border-color: black;
        }
        .btngroup{
            float: right;
        }

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
        <div class="footer__signature">THARUSHA WIJAYABAHU/Muaaz Ahamed</div>
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
