<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>

    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
    <link rel="stylesheet" href="../../../resources/rating.css" type="text/css">
    <link rel="stylesheet" href="http://netdna.bootstrapcdn.com/font-awesome/4.2.0/css/font-awesome.min.css">
    <style type="text/css">
        <!--
        <%@ include file="../../css/mainStyle.css" %>
        -->
    </style>
    <script type="text/javascript">
        <%@include file="../../js/main.js"%>
    </script>

</head>
<body class="bg-dark ">

<h1 align="center" class="bodyfont">The Online Library</h1>
<h5 align="center" class="datefont"><fmt:formatDate value="${today}" pattern="yyy-MM-dd"/></h5>

<!--Simple dashboard grid layout-->
<div class="grid-container">
    <header class="header">

    </header>

    <aside class="sidenav">
        <ul class="sidenav__list">
            <li class="sidenav__list-item"><a href="${pageContext.request.contextPath}/student">View Tutorials</a></li>
            <li class="sidenav__list-item"><a href="${pageContext.request.contextPath}/student/about-us">About Us</a></li>
            <li class="sidenav__list-item"><a href="http://reactjs.org">Contact Us</a></li>
        </ul>
    </aside>
    <main class="main bg-dark">
        <div class="row about">
            <div class="col-md-2 text-center"></div>
            <div class="col-md-5 text-center">
            <div class="card" style="width: 263.5px; height:500px; margin-bottom: 10px;margin-top: 10px">
                <img class="card-img-top" src="../../../resources/tharusha.jpeg" alt="tharusha wijayabahu"
                     style=" width: 262.5px;height:250px">
                <div class="card-body text-center">
                    <h4 class="card-title">THARUSHA WIJAYABAHU</h4>

                    <div class="text-center">
                        <p class="text-center"> SOFTWARE ENGINEER</p>
                    </div>
                    <div class="text-center">
                        <P>EMAIL : tharushaw@hsenidmobile.com</P>
                        <P>CONTACT : +94-712959395</P>
                    </div>
                </div>
            </div>
        </div>
        <div class="col-md-5 text-center">
            <div class="card" style="width: 263.5px; height:500px; margin-bottom: 10px;margin-top: 10px">
                <img class="card-img-top" src="../../../resources/muaaz.jpeg" alt="Ahamed Muaaz"
                     style=" width:262.5px;height:250px">
                <div class="card-body text-center">
                    <h4 class="card-title">AHAMED MUAAZ</h4>

                    <div class="text-center">
                        <p class="text-center">SOFTWARE ENGINEER</p>
                    </div>
                    <div class="text-center">
                        <P>EMAIL : muaaz@hsenidmobile.com</P>
                        <P>CONTACT : +94-777659541</P>
                    </div>
                </div>
            </div>
        </div>
        </div>

    </main>
    <footer class="footer">
        <div class="footer__copyright">&copy; 2019</div>
        <div class="footer__signature">THARUSHA WIJAYABAHU / MUAAZ AHAMED</div>
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
</body>
</html>
