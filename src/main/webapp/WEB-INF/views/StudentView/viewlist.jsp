<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>

    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
    <link rel="stylesheet" href="../../../resources/rating.css" type="text/css">
    <link rel="stylesheet" href="http://netdna.bootstrapcdn.com/font-awesome/4.2.0/css/font-awesome.min.css">
    <style type="text/css">

        <%@ include file="../../css/nav.css" %>

        -->
    </style>
    <script type="text/javascript">
        <%@include file="../../js/main.js"%>
    </script>

</head>
<body>

<!--Simple dashboard grid layout-->

<nav class="navbar navbar-expand-md">
    <a class="navbar-brand" href="${pageContext.request.contextPath}/student/home">HOME</a>
    <button class="navbar-toggler navbar-dark" type="button" data-toggle="collapse" data-target="#main-navigation">
        <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="main-navigation">
        <ul class="navbar-nav">
            <li class="nav-item">
                <a class="nav-link" href="${pageContext.request.contextPath}/student/">TUTORIAL</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="${pageContext.request.contextPath}/student/about-us">ABOUT</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="${pageContext.request.contextPath}/">LOGOUT</a>
            </li>
        </ul>
    </div>
</nav>
<div class="bodybackground">
    <h1 align="center" class="bodyfont">The Online Library</h1>
    <h5 align="center" class="datefont"><fmt:formatDate value="${today}" pattern="yyy-MM-dd"/></h5>

    <div class="container">
        <div class="row">
            <c:forEach var="tut" items="${tutelist}" varStatus="loop">

                <div class="col-md-3 text-center">
                    <div class="card1">
                        <img class="card-img-top" src="${tut.getImageUrl()}" alt=""
                             style=" width: 249px;height:250px">
                        <div class="card-body text-center">
                            <h4 class="card-title">${tut.getName()}</h4>

                            <div class="text-center">
                                <p class="text-center"> Conducted by : ${tut.getTutname()}</p>
                            </div>
                            <div class="text-center">
                                <button id="update" class="btn btn-primary"
                                        onclick="viewStudentMethod(${tut.getId()})">View More Details
                                </button>
                            </div>
                        </div>
                    </div>
                </div>
            </c:forEach>
        </div>
    </div>
</div>
<footer class="page-footer">
    <div class="container">
        <div class="row">
            <div class="col-lg-8 col-md-8 col-sm-12">
                <h6 class="text-uppercase font-weight-bold">Additional Information</h6>
                <p>hSenid Mobile Solutions is a company with a proud history of 20 years of innovations, proven
                    expertise while still having a heart of a startup. We design and build innovative
                    cutting-edge technology platforms which enables the digital transformation of the businesses..</p>
                <p>Our advanced solutions and guaranteed service qualities has enabled us to gain healthy base of loyal
                    customers.
                    We strive to help our customers by opening up uncontested market spaces and thereby achieve rapid
                    growth.</p>
            </div>
            <div class="col-lg-4 col-md-4 col-sm-12">
                <h6 class="text-uppercase font-weight-bold">Contact</h6>
                <p>hSenid Mobile Solutions
                    No 320, 3rd Floor,
                    T.B.Jayah Mawatha,
                    Colombo 10.
                    <br/>info@mywebsite.com
                    <br/>+ 94 712959395
                    <br/>+ 01 234 567 89</p>
            </div>
        </div>
        <div class="footer-copyright text-center">© 2019 Copyright: tutoriallibrary.com</div>
    </div>
</footer>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
</body>
</html>