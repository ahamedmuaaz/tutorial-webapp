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
        -->
    </style>

</head>
<body>

<h1 align="center" class="adminTitile">The Online Library</h1>
<h5 align="center" class="adminDate"><fmt:formatDate value="${today}" pattern="yyy-MM-dd"/></h5>

<!--Simple dashboard grid layout-->
<div class="grid-container">
    <header class="header">
        <div class="pull-right">
            <button type="button" class="btn btn-secondary pull-right" onclick="gotostudent()">Student</button>
            <button type="button" class="btn btn-secondary pull-right" onclick="gotoadmin()">Admin</button>
        </div>
    </header>
    <aside class="sidenav">
        <ul class="sidenav__list">
            <li class="sidenav__list-item"><a href="${pageContext.request.contextPath}/admin/add">Add Tutorial</a></li>
            <li class="sidenav__list-item"><a href="${pageContext.request.contextPath}/admin/list">View Tutorials</a></li>
        </ul>
    </aside>
    <main class="main">

        <div class="container text-center">

            <div style="margin:auto;">
                <div class="row text-center">
                    <img class="rounded mx-auto d-block" src="${tute.imageUrl}" alt="not found" width="250px"
                         height="250px"/>
                </div>


                <h4>Tutorial Name :
                    ${tute.getName()}</h4>

                <p>Tutor Name :
                    ${tute.getTutname()}</p>

                <p style=" border: 1px solid black;
              padding: 10px;
              width: 50%;
              height: auto;
              margin: auto;
              text-align: justify; ">

                    ${tute.getDescription()}</p>

                <br>
                <p>Link :
                    <a href="${tute.getUrl()}">${tute.getUrl()}</a>
                </p>
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
        window.location.assign("/");

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
