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
        <!--
        <%@ include file="../../css/mainStyle.css" %>
        <%@ include file="../../css/listView.css" %>
        -->
    </style>
</head>
<body class="bg-dark">
<h1 align="center" class="bodyfont">The Online Library</h1>
<h5 align="center" class="datefont"><fmt:formatDate value="${today}" pattern="yyy-MM-dd"/></h5>
<!--Simple dashboard grid layout-->
<div class="grid-container">
    <header class="header">
        <div >
            <button type="button" class="btn btn-secondary" onclick="gotostudent()">Student</button>
            <button type="button" class="btn btn-secondary" onclick="gotoadmin()">Admin</button>
        </div>
    </header>
    <aside class="sidenav">
        <ul class="sidenav__list">
            <li class="sidenav__list-item"><a href="${pageContext.request.contextPath}/">View Tutorials</a></li>
            <li class="sidenav__list-item"><a href="${pageContext.request.contextPath}/about-us">About Us</a></li>
            <li class="sidenav__list-item"><a href="http://reactjs.org">Contact Us</a></li>
        </ul>
    </aside>
    <main class="main bg-dark">
        <div class="container">

            <div class="bg-dark">

                <c:set var="namelower" value="${tute.getName()}"/>
                <c:set var="nametoupper" value="${fn:toUpperCase(namelower)}"/>
                <p class="datefont"><b>ALL TUTORIALS / VIEW / ${nametoupper}</b></p>
                <div class="row">
                    <div class="col-5">
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
    </main>
    <footer class="footer">
        <div class="footer__copyright">&copy; 2019</div>
        <div class="footer__signature">THARUSHA WIJAYABAHU / Muaaz Ahamed</div>
    </footer>
</div>
<script type="text/javascript">

    function gotoadmin() {
        window.location.assign("/admin");
    }

    function gotostudent() {
        window.location.assign("/");

    }
</script>
</body>
</html>