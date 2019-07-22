<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<html>
<head>

    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
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
    <div class="myoverlay">
    <h1 align="center" class="bodyfont">The Online Library</h1>
    <h5 align="center" class="datefont"><fmt:formatDate value="${today}" pattern="yyy-MM-dd"/></h5>

    <div class="container bg-dark">


        <c:set var="namelower" value="${tute.getName()}"/>
        <c:set var="nametoupper" value="${fn:toUpperCase(namelower)}"/>
        <p class="datefont"><b>ALL TUTORIALS / VIEW / ${nametoupper}</b></p>
        <div class="row">
            <div class="col-sm">
                <img src="${tute.getImageUrl()}"
                     alt="No image" width="350px" height="400" style="margin-top: 50px">
            </div>
            <div class="col-7 contentrow">
                <h2 style="color: white">${nametoupper}</h2>
                <p style="color:skyblue;font-size: 20px; font-family: Baskerville, 'Palatino Linotype', Palatino, 'Century Schoolbook L', 'Times New Roman', 'serif'">
                    Online</p>
                <p style="color: grey">ITEM:C-FG4121</p>
                <hr>
                <div class="row">
                    <div class="col-3">
                        <p style="color: white">DESCRIPTION</p>
                    </div>
                    <div class="col-9">
                        <p style="color: white">${tute.getDescription()}</p>
                    </div>
                </div>
                <hr>
                <div class="row">
                    <div class="col-3">
                        <p style="color: white">TUTORIAL LINK</p>
                    </div>
                    <div class="col-9">
                        <a href="${tute.getUrl()}"><p style="color: white">${tute.getUrl()}</p></a>
                    </div>
                </div>
                <hr>
                <div class="row">
                    <div class="col-4">
                        <p style="color: white">RATE TUTORIAL</p>
                    </div>
                    <div class="col-8">
                        <div class="stars" id="stars">
                            <form action="">
                                <input class="star star-5" id="star-5" type="radio" name="star"/>
                                <label class="star star-5" for="star-5" onClick="rating()"></label>
                                <input class="star star-4" id="star-4" type="radio" name="star"/>
                                <label class="star star-4" for="star-4"></label>
                                <input class="star star-3" id="star-3" type="radio" name="star"/>
                                <label class="star star-3" for="star-3"></label>
                                <input class="star star-2" id="star-2" type="radio" name="star"/>
                                <label class="star star-2" for="star-2"></label>
                                <input class="star star-1" id="star-1" type="radio" name="star"/>
                                <label class="star star-1" for="star-1"></label>
                            </form>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <br>
    </div>
    <!-- Optional JavaScript -->
    <!-- jQuery first, then Popper.js, then Bootstrap JS -->
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
            integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
            crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"
            integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1"
            crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"
            integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM"
            crossorigin="anonymous"></script>
    <footer class="page-footer">
        <div class="container">
            <div class="row">
                <div class="col-lg-8 col-md-8 col-sm-12">
                    <h6 class="text-uppercase font-weight-bold">Additional Information</h6>
                    <p>hSenid Mobile Solutions is a company with a proud history of 20 years of innovations,
                        proven
                        expertise while still having a heart of a startup. We design and build innovative
                        cutting-edge technology platforms which enables the digital transformation of the
                        businesses..</p>
                    <p>Our advanced solutions and guaranteed service qualities has enabled us to gain healthy
                        base of loyal customers.
                        We strive to help our customers by opening up uncontested market spaces and thereby
                        achieve rapid growth.</p>
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
</div>
<script type="text/javascript">

    function gotoadmin() {
        window.location.assign("/admin");
    }

    function gotostudent() {
        window.location.assign("/student");

    }
</script>
</body>
</html>